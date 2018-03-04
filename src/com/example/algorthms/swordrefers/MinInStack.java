package com.example.algorthms.swordrefers;


import com.example.algorthms.swordrefers.bean.ListNode;

/**
 * 面试题21：包含 min 的栈
 *
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素
 * 的 min 函数。在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。
 */
public class MinInStack {

  private static final class IntStack {
    private int length;
    private ListNode head;

    public boolean isEmpty() {
      return length == 0;
    }

    public void push(int n) {
      if (length == 0) {
        head = new ListNode(n);
        head.link(null);
      } else {
        ListNode oldHead = head;
        head = new ListNode(n);
        head.link(oldHead);
      }
      length++;
    }

    public int pop() {
      if (length == 0) {
        throw new AssertionError("error");
      } else {
        int value = head.value;
        head = head.next;
        length--;
        return value;
      }
    }

    public int top() {
      if (length == 0) {
        throw new AssertionError("error");
      } else {
        return head.value;
      }
    }
  }

  private IntStack dataStack = new IntStack();
  private IntStack minStack = new IntStack();

  public void push(int n) {
    if (minStack.isEmpty()) {
      minStack.push(n);
    } else {
      if (minStack.top() > n) {
        minStack.push(n);
      } else {
        minStack.push(minStack.top());
      }
    }
    dataStack.push(n);
  }

  public int pop() {
    minStack.pop();
    return dataStack.pop();
  }

  public int min() {
    return minStack.top();
  }
}
