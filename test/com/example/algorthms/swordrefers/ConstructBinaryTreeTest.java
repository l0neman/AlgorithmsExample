package com.example.algorthms.swordrefers;

import com.example.algorthms.swordrefers.bean.TreeNode;
import com.example.algorthms.util.Printer;
import edu.princeton.cs.algs4.StdOut;
import org.junit.Test;

public class ConstructBinaryTreeTest {

  @Test
  public void construct() {
    ConstructBinaryTree constructBinaryTree = new ConstructBinaryTree(
        new int[]{1, 2, 4, 7, 3, 5, 6, 8},
        new int[]{4, 7, 2, 1, 5, 3, 8, 6}
    );

    TreeNode tree = constructBinaryTree.construct();
    StdOut.println("preorder: ");
    Printer.Tree.printPreOrder(tree);
    StdOut.println("inorder: ");
    Printer.Tree.PrintInOrder(tree);
  }
}