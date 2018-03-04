package com.example.algorthms.swordrefers;


import com.example.algorthms.swordrefers.bean.TreeNode;

/**
 * 面试题18：树的子结构
 *
 * 输入两颗二叉树 A 和 B，判断 B 是不是 A 的子结构。
 */
public class SubstructureInTree {

  private static boolean hasSubTree2(TreeNode a, TreeNode b) {
    if (b == null) { return true; }
    if (a == null) { return false; }

    if (b.value != a.value) {
      return false;
    }

    return hasSubTree2(a.left, b.left) && hasSubTree2(a.right, b.right);
  }

  public static boolean hasSubTree(TreeNode a, TreeNode b) {
    boolean result = false;
    if (a != null && b != null) {
      if (a.value == b.value) {
        result = hasSubTree2(a, b);
      }
      if (!result) {
        result = hasSubTree(a.left, b);
      }
      if (!result) {
        result = hasSubTree(a.right, b);
      }
    }
    return result;
  }
}
