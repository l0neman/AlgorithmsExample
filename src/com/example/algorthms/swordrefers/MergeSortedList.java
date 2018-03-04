package com.example.algorthms.swordrefers;


import com.example.algorthms.swordrefers.bean.ListNode;

/**
 * 面试题17：合并两个排序的链表
 *
 * 输入两个递增的排序的链表，合并这两个链表并新链表中的节点仍然是
 * 按照递增排序的。
 */
public class MergeSortedList {

  public static ListNode merge(ListNode aH, ListNode bH) {
    if (aH == null) { return bH; }
    if (bH == null) { return aH; }

    ListNode head;

    if (aH.value < bH.value) {
      head = aH;
      aH = aH.next;
    } else {
      head = bH;
      bH = bH.next;
    }
    ListNode t = head;

    while (aH != null && bH != null) {
      if (aH.value < bH.value) {
        t.next = aH;
        aH = aH.next;
      } else {
        t.next = bH;
        bH = bH.next;
      }
      t = t.next;
    }

    if (aH == null) { t.next = bH; }
    if (bH == null) { t.next = aH; }
    return head;
  }

  public static ListNode merge2(ListNode aH, ListNode bH) {
    if (aH == null) { return bH; }
    if (bH == null) { return aH; }

    ListNode head;
    if (aH.value < bH.value) {
      head = aH;
      head.next = merge2(aH.next, bH);
    } else {
      head = bH;
      head.next = merge2(bH.next, aH);
    }
    return head;
  }
}
