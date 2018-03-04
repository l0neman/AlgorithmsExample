package com.example.algorthms.swordrefers;

import java.util.LinkedList;

/**
 * 面试题22：栈的压入、弹出序列
 *
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第
 * 二个序列是否为该栈的弹出顺序。假设压栈的所有数字均不
 * 相等。
 * 例如：
 * 序列 1、2、3、4、5 是某栈的压栈序列
 * 序列 4、5、3、2、1 是该压栈序列对应的一个弹出序列，
 * 但是 4、3、5、1、2 就不可能是该压栈序列的弹出序列。
 */
public class StackPushPopOrder {

  public static boolean isPopOrder(int[] push, int[] isPop) {
    if (push == null || isPop == null || isPop.length == 0 || push.length == 0) {
      throw new AssertionError();
    }
    LinkedList<Integer> dataStack = new LinkedList<>();
    LinkedList<Integer> testStack = new LinkedList<>();
    for (int i = push.length - 1; i >= 0; i--) {
      dataStack.push(push[i]);
    }
    for (int a : isPop) {
      if (!dataStack.isEmpty()) {
        /* 从原始栈中找到目标并加入测试栈 */
        while (true) {
          testStack.push(dataStack.pop());
          if (testStack.peek() == a) {
            break;
          }
          if (dataStack.isEmpty()) {
            /* 找不到目标 */
            return false;
          }
        }
      }
      /* 若测试栈为 null 或者栈顶元素不是目标，则不通过 */
      if (testStack.isEmpty() || testStack.peek() != a) {
        return false;
      }
      if (testStack.peek() == a) {
        /* 从测试栈中弹出目标 */
        testStack.pop();
        if (testStack.isEmpty()) {
          return true;
        }
      }
    }
    return false;
  }
}
