package com.example.algorthms.swordrefers;

import com.example.algorthms.swordrefers.bean.TreeNode;
import com.example.algorthms.util.Printer;
import org.junit.Test;

public class PathInTreeTest {

  @Test
  public void findInPath() {

    TreeNode root = new TreeNode(10);

    TreeNode n21l = new TreeNode(5);
    TreeNode n21r = new TreeNode(12);

    TreeNode n31l = new TreeNode(4);
    TreeNode n31r = new TreeNode(7);

    root.left = n21l;
    root.right = n21r;

    n21l.left = n31l;
    n21l.right = n31r;

    Printer.Tree.printLevelOrder(root);

    PathInTree pathInTree = new PathInTree();
    pathInTree.findInPath(root, 22);
  }
}