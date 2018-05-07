package com.example.algorthms.classic.sort;

/**
 * 插入排序
 *
 * 平均需要 n^2/4 次比较和 n^2/4 次交换
 * 最坏情况 n^2/2 次比较和 n^2/2 次交换
 * 最好情况 n-1   次比较和 0     次交换
 * 空间    原地
 */
public class InsertionSort {

  public static void sort(int[] a) {
    for (int i = 1; i < a.length; i++) {
      for (int j = i; j > 0 && a[j] < a[j - 1]; j--) {
        Utils.exch(a, j, j - 1);
      }
    }
  }
}
