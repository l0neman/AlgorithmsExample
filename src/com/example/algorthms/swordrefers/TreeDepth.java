package com.example.algorthms.swordrefers;

import com.example.algorthms.swordrefers.bean.TreeNode;

/**
 * 面试题39：二叉树的深度
 *
 * 输入一棵二叉树的根节点，求该树的深度。从根节点到叶节点
 * 一次经过的节点（含根、叶节点）形成树的一条路径，最长路径的
 * 长度为输的深度。
 */
public class TreeDepth {

  public static int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    final int leftDepth = maxDepth(root.left);
    final int rightDepth = maxDepth(root.right);

    return leftDepth > rightDepth ? leftDepth + 1 : rightDepth + 1;
  }

  /**
   * 输入一棵二叉树的根节点，判断该树是不是平衡二叉树。
   * 如果某二叉树中任意节点的左右子树的深度相差不超过1，
   * 那么它就是一棵平衡二叉树。
   */
  public static boolean isBalanced(TreeNode root) {
    return depthIfBalanced(root) != -1;
  }

  private static int depthIfBalanced(TreeNode root) {
    if (root == null) {
      return 0;
    }
    final int left = depthIfBalanced(root.left);
    final int right = depthIfBalanced(root.right);
    if (Math.abs(left - right) > 1) {
      return -1;
    }
    return left > right ? left + 1 : right + 1;
  }
}
