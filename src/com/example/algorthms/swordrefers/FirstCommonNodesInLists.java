package com.example.algorthms.swordrefers;

import com.example.algorthms.swordrefers.bean.ListNode;

import java.util.LinkedList;

/**
 * 面试题37：两个链表的第一个公共节点
 *
 * 输入两个链表，找出它们的第一个公共节点。
 */
public class FirstCommonNodesInLists {

  public static ListNode findFirstCommonNode(ListNode l1, ListNode l2) {
    if (l1 == null || l2 == null) {
      return null;
    }
    LinkedList<ListNode> s1 = new LinkedList<>();
    LinkedList<ListNode> s2 = new LinkedList<>();
    for (ListNode t1 = l1; t1 != null; t1 = t1.next) {
      s1.push(t1);
    }
    for (ListNode t2 = l2; t2 != null; t2 = t2.next) {
      s2.push(t2);
    }
    ListNode result = null;
    while (!s1.isEmpty() && !s2.isEmpty()) {
      final ListNode pop = s1.pop();
      final ListNode pop1 = s2.pop();
      if (pop == pop1) {
        result = pop;
      } else {
        return result;
      }
    }
    return result;
  }

  public static ListNode findFirstCommonNode2(ListNode l1, ListNode l2) {
    final int len1 = getLength(l1);
    final int len2 = getLength(l2);
    int move = Math.abs(len1 - len2);
    ListNode longStart = len1 > len2 ? l1 : l2;
    for (int i = 0; i < move; i++) {
      longStart = longStart.next;
    }
    ListNode t = len1 > len2 ? l2 : l1;
    while (longStart != null) {
      if (longStart == t) {
        return t;
      }
      longStart = longStart.next;
      t = t.next;
    }
    return null;
  }

  private static int getLength(ListNode head) {
    int count = 0;
    for (ListNode t = head; t != null; t = t.next) {
      count++;
    }
    return count;
  }
}
