package com.example.algorthms.swordrefers;

import com.example.algorthms.swordrefers.bean.TreeNode;

/**
 * 面试题27：二叉搜索树与双向链表
 *
 * 输入一颗二叉搜索树，将该二叉搜索树转换成一个排序的
 * 双向链表。要求不能创建任何新的节点，只能调整树中的
 * 节点指针的指。
 */
public class ConvertBinarySearchTree {

  private TreeNode mLast;

  public TreeNode convert(TreeNode root) {
    convertNode(root);
    TreeNode node = mLast;
    while (node != null && node.left != null) {
      node = node.left;
    }
    return node;
  }

  private void convertNode(TreeNode node) {
    if (node == null) {
      return;
    }

    if (node.left != null) {
      convertNode(node.left);
    }
    node.left = mLast;
    if (mLast != null) {
      mLast.right = node;
    }
    mLast = node;
    if (node.right != null) {
      convertNode(node.right);
    }
  }
}
