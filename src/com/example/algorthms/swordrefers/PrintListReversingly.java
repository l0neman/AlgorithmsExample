package com.example.algorthms.swordrefers;

import com.example.algorthms.swordrefers.bean.ListNode;
import edu.princeton.cs.algs4.StdOut;

import java.util.LinkedList;

/**
 * 面试题5：从尾到头打印链表
 *
 * 输入一个链表的头结点，从尾到头反过来打印出每个节点的值。
 */
public class PrintListReversingly {

  /**
   * 使用递归
   */
  public static void printWithRecursively(ListNode head) {
    if (head == null) { return; }
    printWithRecursively(head.next);
    StdOut.println(head.value);
  }

  /**
   * 使用栈
   */
  public static void printWithStack(ListNode head) {
    LinkedList<ListNode> stack = new LinkedList<>();
    while (head != null) {
      stack.push(head);
      head = head.next;
    }
    for (ListNode node : stack) {
      StdOut.println(node.value);
    }
  }
}
