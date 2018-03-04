package com.example.algorthms.swordrefers;

/**
 * 面试题10：二进制中1的个数
 *
 * 请实现一个函数，输入一个整数，输出该数二进制表示中1的个数。例如
 * 把9表示成二进制是 1001， 有2位是1，因此如果输入9，该函数输出2。
 */
public class NumberOf1InBinary {
  public static int numberOf(int n) {
    int count = 0;
    while (n != 0) {
      n = n & (n - 1);
      count++;
    }
    return count;
  }

  /**
   * 判断一个数是否是2的整数次方
   */
  public static boolean is2Power(int n) {
    return (n & (n - 1)) == 0;
  }
}
