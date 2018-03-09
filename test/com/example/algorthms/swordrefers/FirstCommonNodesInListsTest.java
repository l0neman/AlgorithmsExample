package com.example.algorthms.swordrefers;

import com.example.algorthms.swordrefers.bean.ListNode;
import com.example.algorthms.util.Printer;
import edu.princeton.cs.algs4.StdOut;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstCommonNodesInListsTest {

  @Test
  public void findFirstCommonNode() {
    ListNode l6 = new ListNode(6);
    ListNode l7 = new ListNode(7);
    l6.link(l7);

    ListNode l1 = new ListNode(1);
    ListNode l2 = new ListNode(2);
    ListNode l3 = new ListNode(3);

    l1.link(l2);
    l2.link(l3);
    l3.link(l6);

    ListNode l4 = new ListNode(4);
    ListNode l5 = new ListNode(5);
    l4.link(l5);
    l5.link(l6);

    Printer.print(l1);
    Printer.print(l4);

    StdOut.println(
        FirstCommonNodesInLists.findFirstCommonNode2(l1, l4).value);
  }
}