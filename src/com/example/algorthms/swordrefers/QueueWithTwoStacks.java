package com.example.algorthms.swordrefers;

import java.util.LinkedList;

/**
 * 面试题7：用两个栈实现队列
 *
 * 用两个栈实现一个队列，队列的声明如下，请实现它的两个函数
 * appendTail 和 deleteHead，分别完成在队列尾部插入节点和
 * 在队列头部删除节点的功能，
 */
public class QueueWithTwoStacks<T> {
  private LinkedList<T> stack1 = new LinkedList<>();
  private LinkedList<T> stack2 = new LinkedList<>();

  public void appendTail(final T node) {
    stack1.push(node);
  }

  public T deleteHead() {
    if(!stack2.isEmpty()) {
      return stack2.pop();
    }
    if(stack1.isEmpty()){
      return null;
    }
    while (!stack1.isEmpty()) {
      stack2.push(stack1.pop());
    }
    return stack2.pop();
  }
}
