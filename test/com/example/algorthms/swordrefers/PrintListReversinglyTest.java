package com.example.algorthms.swordrefers;

import com.example.algorthms.swordrefers.bean.ListNode;
import com.example.algorthms.swordrefers.util.Printer;
import edu.princeton.cs.algs4.StdOut;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrintListReversinglyTest {

  @Test
  public void printWithRecursively() {
    ListNode n0 = new ListNode(0);
    ListNode n1 = new ListNode(1);
    ListNode n2 = new ListNode(2);
    ListNode n3 = new ListNode(3);
    ListNode n4 = new ListNode(4);

    n0.link(n1);
    n1.link(n2);
    n2.link(n3);
    n3.link(n4);

    StdOut.print("src: ");
    Printer.print(n0);

    PrintListReversingly.printWithRecursively(n0);
  }

  @Test
  public void printWithStack() {
    ListNode n0 = new ListNode(0);
    ListNode n1 = new ListNode(1);
    ListNode n2 = new ListNode(2);
    ListNode n3 = new ListNode(3);
    ListNode n4 = new ListNode(4);

    n0.link(n1);
    n1.link(n2);
    n2.link(n3);
    n3.link(n4);

    StdOut.print("src: ");
    Printer.print(n0);

    PrintListReversingly.printWithStack(n0);
  }
}