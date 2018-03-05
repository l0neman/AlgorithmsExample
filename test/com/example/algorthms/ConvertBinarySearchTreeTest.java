package com.example.algorthms;

import com.example.algorthms.swordrefers.bean.TreeNode;
import com.example.algorthms.util.Printer;
import edu.princeton.cs.algs4.StdOut;
import org.junit.Test;

public class ConvertBinarySearchTreeTest {

  @Test
  public void convert() {
    TreeNode root = new TreeNode(10);

    TreeNode n21l = new TreeNode(6);
    TreeNode n21r = new TreeNode(14);

    TreeNode n31l = new TreeNode(4);
    TreeNode n31r = new TreeNode(8);

    TreeNode n32l = new TreeNode(12);
    TreeNode n32r = new TreeNode(16);

    root.left = n21l;
    root.right = n21r;

    n21l.left = n31l;
    n21l.right = n31r;

    n21r.left = n32l;
    n21r.right = n32r;

    Printer.printLevelOrder(root);

    ConvertBinarySearchTree convert = new ConvertBinarySearchTree();
    TreeNode head = convert.convert(root);
    while (head != null) {
      StdOut.print(head.value + "\t");
      head = head.right;
    }
  }
}