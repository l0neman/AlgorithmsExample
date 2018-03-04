package com.example.algorthms.swordrefers;

import com.example.algorthms.swordrefers.bean.ListNode;

/**
 * 面试题15：链表中倒数第k个节点
 *
 * 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，
 * 本题从1开始计数，即链表的尾节点是倒数第1个节点。
 * 例如一个链表有6个节点，从头结点开始他们的值依次是1、2、3、4、5、6.
 * 这个链表的倒数第3个节点是值为4的节点。
 */
public class KthNodeFromEnd {
  public static ListNode findKthToTail(ListNode head, int k) {
    if (head == null || k == 0) {
      return null;
    }
    int times = k - 1;
    ListNode kNode = head;
    for (int i = 0; i < times; i++) {
      kNode = kNode.next;
      if (kNode == null) {
        return null;
      }
    }
    ListNode target = head;
    while (kNode.next != null) {
      target = target.next;
      kNode = kNode.next;
    }
    return target;
  }
}
