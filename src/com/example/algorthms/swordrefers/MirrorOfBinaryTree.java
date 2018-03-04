package com.example.algorthms.swordrefers;


import com.example.algorthms.swordrefers.bean.TreeNode;

/**
 * 面试题19：二叉树的镜像
 */
public class MirrorOfBinaryTree {

  public static void mirrorTreeRecursively(TreeNode root) {
    if (root == null) {
      return;
    }
    TreeNode t = root.left;
    root.left = root.right;
    root.right = t;
    mirrorTreeRecursively(root.left);
    mirrorTreeRecursively(root.right);
  }
}
