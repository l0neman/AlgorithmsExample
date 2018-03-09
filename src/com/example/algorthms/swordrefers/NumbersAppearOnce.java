package com.example.algorthms.swordrefers;

import javafx.util.Pair;

/**
 * 面试题40：数组中只出现一次的数字
 *
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。
 * 请写程序找出这两个只出现一次的数字。要求时间复杂度是 O(n)，
 * 空间复杂度是 O(1)
 */
public class NumbersAppearOnce {

  public static Pair<Integer, Integer> findNumsAppearOnce(int[] data) {
    if (data == null || data.length == 0) {
      return null;
    }
    int exclusiveOr = 0;
    for (int a : data) {
      exclusiveOr ^= a;
    }
    int index = findFirstBitIs1(exclusiveOr);
    int n1 = 0;
    int n2 = 0;
    for (int a : data) {
      if (isBit1(a, index)) {
        n1 ^= a;
      } else {
        n2 ^= a;
      }
    }
    return new Pair<>(n1, n2);
  }

  private static int findFirstBitIs1(int n) {
    int index = 0;
    while ((n & 1) == 0 && index < 32) {
      n = n >> 1;
      index++;
    }
    return index;
  }

  private static boolean isBit1(int n, int index) {
    n = n >> index;
    return (n & 1) == 1;
  }
}
