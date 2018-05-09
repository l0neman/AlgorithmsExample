package com.example.algorthms.classic.sort.simple;

import com.example.algorthms.classic.sort.Utils;

/**
 * 选择排序
 *
 * 平均 n^2/2 次比较 和 n 次交换
 * 最好 /     次比较 和 / 次交换
 * 最坏 /     次比较 和 / 次交换
 */
public class SelectionSort {

  public static void sort(int[] a) {
    for (int i = 0; i < a.length; i++) {
      int min = i;
      int j;
      for (j = i + 1; j < a.length; j++) {
        if (a[j] < a[min]) { min = j; }
      }
      Utils.exch(a, i, j);
    }
  }
}
