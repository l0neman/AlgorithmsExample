package com.example.algorthms.swordrefers.bean;

public class ListNode {
  public int value;
  public ListNode next;

  public ListNode(int value) {
    this.value = value;
  }

  public void link(ListNode node) {
    this.next = node;
  }

}
