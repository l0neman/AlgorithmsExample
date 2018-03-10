package com.example.algorthms.swordrefers;

/**
 * 0, , ..., n-1 这 n 个是数字排成一个圆圈，从数字 0
 * 开始每次从这个圆圈里面删除第 m 个数字。求出这个圆圈里
 * 剩下的最后一个数字。
 */
public class LastNumberInCircle {

  public static int lastRemaining(int n, int m) {
    if (n < 1 || m < 1) {
      return -1;
    }
    int last = 0;
    for (int i = 2; i <= n; i++) {
      last = (last + m) % i;
    }
    return last;
  }
}
