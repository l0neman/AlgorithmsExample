package com.example.algorthms.util;

import com.example.algorthms.swordrefers.bean.ComplexListNode;
import com.example.algorthms.swordrefers.bean.ListNode;
import com.example.algorthms.swordrefers.bean.TreeNode;
import edu.princeton.cs.algs4.StdOut;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 辅助打印一些数据结构
 */
public final class Printer {

  private Printer() { throw new AssertionError("no instance"); }

  public static final class Array {
    /**
     * 打印 int 型二维数组
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
     * 打印 char 型数组
     */
    public static void print(char[] a) {
      for (char anA : a) {
        StdOut.print(anA);
      }
      StdOut.println();
    }

    /**
     * 打印 int 型数组
     */
    public static void print(int[] a) {
      for (int anA : a) {
        StdOut.print(anA + "\t");
      }
      StdOut.println();
    }
  }

  public static final class Collection {
    /**
     * 打印集合
     */
    public static <T> void print(java.util.Collection<T> c) {
      for (T anA : c) {
        StdOut.print(anA + "\t");
      }
      StdOut.println();
    }
  }

  public static final class LinkedList {
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
     * 打印复杂链表
     */
    public static void print(ComplexListNode head) {
      ComplexListNode t = head;
      while (t != null) {
        ComplexListNode sibling = t.sibling;
        if (sibling == null) {
          StdOut.print(t.value + "~null");
        } else {
          StdOut.print(t.value + "~" + sibling.value);
        }
        StdOut.print(' ');
        t = t.next;
      }
      StdOut.println();
    }
  }

  public static final class Tree {
    /**
     * 二叉树前序遍历
     */
    public static void printPreOrder(TreeNode root) {
      if (root == null) { return; }
      StdOut.println(root.value);
      printPreOrder(root.left);
      printPreOrder(root.right);
    }

    /**
     * 二叉树中序遍历
     */
    public static void PrintInOrder(TreeNode root) {
      if (root == null) { return; }
      PrintInOrder(root.left);
      StdOut.println(root.value);
      PrintInOrder(root.right);
    }

    /**
     * 二叉树后序遍历
     */
    public static void printPostOrder(TreeNode root) {
      if (root == null) { return; }
      printPostOrder(root.left);
      printPostOrder(root.right);
      StdOut.println(root.value);
    }

    /**
     * 二叉树层序遍历
     */
    public static void printLevelOrder(TreeNode root) {
      Queue<TreeNode> queue = new java.util.LinkedList<>();
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
}
