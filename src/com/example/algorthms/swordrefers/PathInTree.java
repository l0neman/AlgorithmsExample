package com.example.algorthms.swordrefers;

import com.example.algorthms.swordrefers.bean.TreeNode;
import com.example.algorthms.util.Printer;

import java.util.LinkedList;

/**
 * 面试题25；
 * 输入一棵二叉树和一个整数，打印出二叉树中节点的和为输入整数的所有路径。
 * 从树的根节点开始往下一直到叶节点所经过的节点形成一条路径。
 */
public class PathInTree {

  private LinkedList<Integer> path = new LinkedList<>();

  public void findInPath(TreeNode root, int target) {
    if (root == null) {
      return;
    }
    findPathRecursive(root, target, 0);
  }

  private void findPathRecursive(TreeNode root, int target, int sum) {
    path.offer(root.value);
    if (root.left == null && root.right == null) {
      if (sum + root.value == target) {
        Printer.print(path);
      }
    } else {
      sum += root.value;
      if (root.left != null) {
        findPathRecursive(root.left, target, sum);
      }
      if (root.right != null) {
        findPathRecursive(root.right, target, sum);
      }
    }
    path.pollLast();
  }
}
