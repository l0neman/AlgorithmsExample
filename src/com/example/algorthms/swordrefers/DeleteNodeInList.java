package com.example.algorthms.swordrefers;


import com.example.algorthms.swordrefers.bean.ListNode;

/**
 * 面试题13：在 O(1) 时间删除链表节点
 *
 * 给定单项链表的头指针和一个节点指针，定义一个函数
 * 在 0(1)时间删除该节点。
 */
public class DeleteNodeInList {

  public static ListNode deleteNode(ListNode head, ListNode del) {
    if (head == null || del == null) {
      return null;
    }
    if (head.next == null) {
      if (del.equals(head)) {
        return null;
      } else {
        throw new UnsupportedOperationException("not found delete node.");
      }
    }
    if (del.next == null) {
      while (head.next != null) {
        if (head.next.equals(del)) {
          head.next = del.next;
          return head;
        }
        head = head.next;
      }
      throw new UnsupportedOperationException("not found delete node.");
    }
    del.value = del.next.value;
    del.next = del.next.next;
    return head;
  }
}
