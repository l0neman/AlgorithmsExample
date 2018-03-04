package com.example.algorthms.swordrefers;

import java.util.LinkedList;

/**
 * 用两个队列实现一个栈，请实现它的两个函数
 * push 和 pop。
 */
public class StackWithTwoQueues<T> {
  private LinkedList<T> queue1 = new LinkedList<>();
  private LinkedList<T> queue2 = new LinkedList<>();

  public void push(T node) {
    queue1.offer(node);
  }

  public T pop() {
    if (!queue1.isEmpty()) {
      while (queue1.size() != 1) {
        queue2.offer(queue1.poll());
      }
      return queue1.poll();
    }
    if (queue2.isEmpty()) {
      return null;
    }
    while (queue2.size() != 1) {
      queue1.offer(queue2.poll());
    }
    return queue2.poll();
  }
}
