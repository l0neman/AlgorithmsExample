package com.example.algorthms.swordrefers;


import com.example.algorthms.swordrefers.bean.TreeNode;

/**
 * 面试题6：重建二叉树
 *
 * 输入某二叉树的 前序遍历 和 中序遍历 的结果，请重建出该二叉树
 * 例如：
 * 前序遍历的结果为 {1, 2, 4, 7, 3, 5, 6, 8}
 * 中序遍历的结果为 {4, 7, 2, 1, 5, 3, 8, 6}
 * 需要构建出如下的二叉树结构。
 */
/*
     1
    / \
   2   3
  /   / \
 4   5   6
  \     /
   7   8
*/
public class ConstructBinaryTree {

  private int[] preOrder;
  private int[] inOrder;

  public ConstructBinaryTree(int[] preOrder, int[] inOrder) {
    this.preOrder = preOrder;
    this.inOrder = inOrder;
  }

  public TreeNode construct() {
    return constructCore(0, preOrder.length - 1, 0, inOrder.length - 1);
  }

  /**
   * 递归构造二叉树
   *
   * @param startPre 前序序列开始位置
   * @param endPre   前序序列结束位置
   * @param startIn  中序序列开始位置
   * @param endIn    中序序列结束位置
   */
  private TreeNode constructCore(int startPre, int endPre, int startIn, int endIn) {
    /* 确定根节点的值 */
    final int rootValue = preOrder[startPre];
    TreeNode root = new TreeNode(rootValue);

    if (startPre == endPre) {
      if (startIn == endIn && preOrder[startPre] == inOrder[startIn]) {
        return root;
      } else {
        throw new UnsupportedOperationException("invalid input.");
      }
    }

    int leftTreeLength = 0;
    /* 计算左子树长度（在 inorder 序列中计算根节点位置）*/
    for (int i = startIn; i <= endIn; i++) {
      if (inOrder[i] == rootValue) {
        break;  
      }
      leftTreeLength++;
    }

    int leftPreEnd = startPre + leftTreeLength;
    if (leftTreeLength > 0) {
      root.left = constructCore(startPre + 1, leftPreEnd, startIn, startIn + leftTreeLength - 1);
    }
    if (leftTreeLength < endPre - startPre) {
      root.right = constructCore(leftPreEnd + 1, endPre, startIn + leftTreeLength + 1, endIn);
    }

    return root;
  }

}