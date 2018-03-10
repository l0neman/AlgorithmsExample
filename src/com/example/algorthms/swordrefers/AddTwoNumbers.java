package com.example.algorthms.swordrefers;

/**
 *面试题47：不用加减法乘除做加法
 *
 * 写一个函数，求两个整数之和，要求在函数体内不得使用
 * +,-,*,/,四则运算符号
 */
public class AddTwoNumbers {

  public static int add(int n1, int n2) {
    int sum = 0;
    int carry = -1;
    while (carry != 0) {
      sum = n1 ^ n2;
      carry = (n1 & n2) << 1;
      n1 = sum;
      n2 = carry;
    }
    return sum;
  }
}
