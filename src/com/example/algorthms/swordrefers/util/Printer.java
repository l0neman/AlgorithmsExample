package com.example.algorthms.swordrefers.util;

import com.example.algorthms.swordrefers.bean.ListNode;
import com.example.algorthms.swordrefers.bean.TreeNode;
import edu.princeton.cs.algs4.StdOut;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 辅助打印一些数据结构
 */
public class Printer {

  /**
   * 打印int型二维数组
   */
  @SuppressWarnings("Duplicates")
  public static void print(int[][] a, int column) {
    final int l = a.length * column;
    for (int i = 0; i < l; i++) {
      if (i != 0 && i % column == 0) {
        StdOut.println();
      }
      StdOut.print(a[i / column][i % column]);
      StdOut.print('\t');
    }
    StdOut.println();
  }

  /**
   * 打印char型数组
   */
  public static void print(char[] a) {
    for (char anA : a) {
      StdOut.print(anA);
    }
    StdOut.println();
  }

  /**
   * 打印链表
   */
  public static void print(ListNode head) {
    ListNode t = head;
    while (t != null) {
      StdOut.print(t.value);
      StdOut.print(' ');
      t = t.next;
    }
    StdOut.println();
  }

  /**
   * 二叉树前序遍历
   */
  public static void preOrderPrint(TreeNode root) {
    if (root == null) { return; }
    StdOut.println(root.value);
    preOrderPrint(root.left);
    preOrderPrint(root.right);
  }

  /**
   * 二叉树中序遍历
   */
  public static void inOrderPrint(TreeNode root) {
    if (root == null) { return; }
    inOrderPrint(root.left);
    StdOut.println(root.value);
    inOrderPrint(root.right);
  }

  /**
   * 二叉树后序遍历
   */
  public static void postOrderPrint(TreeNode root) {
    if (root == null) { return; }
    postOrderPrint(root.left);
    postOrderPrint(root.right);
    StdOut.println(root.value);
  }

  /**
   * 二叉树层序遍历
   */
  public static void levelOrderPrint(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    int i = 0;
    int count = 2;
    while (!queue.isEmpty()) {
      TreeNode print = queue.poll();
      i++;
      if (print == null) {
        StdOut.print("x\t");
        continue;
      }
      StdOut.print(print.value + "\t");
      queue.offer(print.left);
      queue.offer(print.right);
      if ((i + 1) % count == 0) {
        count *= 2;
        StdOut.println();
      }
    }
    StdOut.println();
  }
}
