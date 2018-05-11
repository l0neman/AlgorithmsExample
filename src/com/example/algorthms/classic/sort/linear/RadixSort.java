package com.example.algorthms.classic.sort.linear;

import com.example.algorthms.classic.sort.Utils;

/**
 * 基数排序
 */
public class RadixSort {

  public static void sort(int[] a, int d) {
    for (int i = 1; i <= d; i++) {
      insertionSortWithBit(a, i);
    }
  }

  private static void insertionSortWithBit(int[] a, int bit) {
    for (int i = 1; i < a.length; i++) {
      for (int j = i; j > 0 && getBit(a[j], bit) < getBit(a[j - 1], bit); j--) {
        Utils.exch(a, j, j - 1);
      }
    }
  }

  private static int getBit(int t, int i) {
    for (int j = 1; j < i; j++) {
      t /= 10;
      if (t == 0) { break; }
    }
    return t % 10;
  }
}
