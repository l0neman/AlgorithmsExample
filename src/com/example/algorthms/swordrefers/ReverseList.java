package com.example.algorthms.swordrefers;

import com.example.algorthms.swordrefers.bean.ListNode;
import edu.princeton.cs.algs4.StdOut;

/**
 * 面试题16：反转链表
 *
 * 定义一个函数，输入一个链表的头结点，反转该链表，并输出反转后的头结点。
 */
public class ReverseList {

  /* 迭代方法 */
  public static ListNode reverse(ListNode head) {
    ListNode newHead = null;
    ListNode t = head;
    ListNode prev = null;
    while (t != null) {
      ListNode next = t.next;
      if (next == null) {
        newHead = t;
      }
      t.next = prev;
      prev = t;
      t = next;
    }
    return newHead;
  }

  public static ListNode[] reverseList(ListNode head) {
    if (head.next == null) {
      return new ListNode[]{head, head};
    } else {
      ListNode[] next = reverseList(head.next);
      next[1].next = head;
      StdOut.println("happy");
      return new ListNode[]{next[0], head};
    }
  }

  /* 递归方法 */
  public static ListNode reverse3(ListNode head) {
    if (head == null) {
      return null;
    }
    ListNode[] list = reverseList(head);
    list[1].next = null;
    return list[0];
  }

  /* 失败的递归-_- */
  public static ListNode reverse2(ListNode head) {
    if (head.next == null) {
      return head;
    }
    ListNode nextHead = reverse2(head.next);
    ListNode last = nextHead;
    while (last.next != null) {
      last = last.next;
    }
    last.next = head;
    head.next = null;
    return nextHead;
  }
}
