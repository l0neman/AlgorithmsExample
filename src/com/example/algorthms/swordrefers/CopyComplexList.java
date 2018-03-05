package com.example.algorthms.swordrefers;

import com.example.algorthms.swordrefers.bean.ComplexListNode;
import com.example.algorthms.util.Printer;

/**
 * 面试题26：复杂链表的复制
 *
 * 请实现函数 ComplexListNode clone(ComplexListNode head)，
 * 复制一个复杂链表。在复杂链表中，每个节点除了有一个 next 指针指向下一个
 * 节点外，还有一个 sibling 指向链表中的任意节点或者 null。
 */
public class CopyComplexList {

  public static ComplexListNode clone(ComplexListNode head) {
    if (head == null) {
      return null;
    }
    createCopyList(head);
    Printer.print(head);
    linkSiblingNodes(head);
    Printer.print(head);
    return unlinkSrcNodes(head);
  }

  private static void createCopyList(ComplexListNode head) {
    ComplexListNode node = head;
    while (node != null) {
      ComplexListNode copyNode = new ComplexListNode((char) (node.value + 32));
      copyNode.next = node.next;
      node.next = copyNode;
      node = copyNode.next;
    }
  }

  private static void linkSiblingNodes(ComplexListNode head) {
    ComplexListNode node = head;
    while (node != null) {
      if (node.sibling != null) {
        node.next.sibling = node.sibling.next;
      }
      node = node.next.next;
    }
  }

  public static ComplexListNode unlinkSrcNodes(ComplexListNode head) {
    ComplexListNode h = head.next;
    ComplexListNode node = h;
    while (node.next != null) {
      node.next = node.next.next;
      node = node.next;
    }
    return h;
  }
}
