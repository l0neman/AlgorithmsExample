package com.example.algorthms.classic.sort;

/**
 * 插入排序
 *
 * 平均 n^2/4 次比较 和 n^2/4 次交换
 * 最坏 n^2/2 次比较 和 n^2/2 次交换
 * 最好 n-1   次比较 和 0     次交换
 * 空间 原地
 */
public class InsertionSort {

  public static void sort(int[] a) {
    sort(a, 0, a.length - 1);
  }

  public static void sort(int[] a, int start, int end) {
    for (int i = start + 1; i <= end; i++) {
      for (int j = i; j > 0 && a[j] < a[j - 1]; j--) {
        Utils.exch(a, j, j - 1);
      }
    }
  }
}
