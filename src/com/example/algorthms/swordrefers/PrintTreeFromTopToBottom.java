package com.example.algorthms.swordrefers;

import com.example.algorthms.swordrefers.bean.TreeNode;
import edu.princeton.cs.algs4.StdOut;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 面试题23：从上往下打印二叉树
 */
public class PrintTreeFromTopToBottom {

  public static void print(TreeNode root) {
    if (root == null) {
      return;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
      TreeNode node = queue.poll();
      if (node != null) {
        StdOut.print(node.value + "\t");
      } else {
        StdOut.print("x\t");
        continue;
      }
      queue.add(node.left);
      queue.add(node.right);
    }
  }
}
