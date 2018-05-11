package com.example.algorthms.swordrefers;

import com.example.algorthms.swordrefers.bean.TreeNode;
import com.example.algorthms.util.Printer;
import edu.princeton.cs.algs4.StdOut;
import org.junit.Test;

public class TreeDepthTest {

  @Test
  public void maxDepth() {
    TreeNode root = new TreeNode(1);

    TreeNode t21l = new TreeNode(2);
    TreeNode t21r = new TreeNode(3);

    TreeNode t31l = new TreeNode(4);
    TreeNode t31r = new TreeNode(5);

    TreeNode t32r = new TreeNode(6);

    TreeNode t42l = new TreeNode(7);

    root.left = t21l;
    root.right = t21r;

    t21l.left = t31l;
    t21l.right = t31r;

    t21r.right = t32r;

    t31r.left = t42l;

    Printer.Tree.printLevelOrder(root);

    StdOut.println(TreeDepth.isBalanced(root));
  }
}