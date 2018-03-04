package com.example.algorthms.swordrefers;

/**
 * 面试题9：裴波那契数列
 *
 * 裴波那契数列的第 n 项
 */
public class Fibonacci {

  public static long getN(int n) {
    int[] result = {0, 1};
    if (n < 0) {
      return 0;
    }
    if (n <= 2) {
      return result[n - 1];
    }
    int t = n - 2;
    for (int i = 0; i < t; i++) {
      int last = result[1];
      result[1] = result[0] + result[1];
      result[0] = last;
    }
    return result[1];
  }
}
