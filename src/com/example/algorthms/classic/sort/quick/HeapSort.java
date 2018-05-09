package com.example.algorthms.classic.sort.quick;

import com.example.algorthms.classic.sort.Utils;

/**
 * 堆排序
 *
 * 平均 nlg^n
 * 最坏 nlg^n
 */
public class HeapSort {

  public static void sort(int[] a) {
    int end = a.length - 1;
    buildMaxHeap(a, end);
    for (int i = a.length - 1; i >= 1; i--) {
      Utils.exch(a, 0, i);
      end--;
      maxHeapify(a, 0, end);
    }
  }

  /* 构建大顶堆 */
  private static void buildMaxHeap(int[] a, int end) {
    for (int i = end / 2 - 1; i >= 0; i--) {
      maxHeapify(a, i, end);
    }
  }

  /* 调整大顶堆 curr-当前结点*/
  private static void maxHeapify(int[] a, int curr, int end) {
    int l = left(curr);
    int r = right(curr);
    int largest = curr;
    if (l <= end && a[l] > a[curr]) {
      largest = l;
    }
    if (r <= end && a[r] > a[largest]) {
      largest = r;
    }
    if (largest != curr) {
      /* 调整较小的i节点到 largest 位置 */
      Utils.exch(a, curr, largest);
      maxHeapify(a, largest, end);
    }
  }

  private static int left(int i) { return (i + 1) * 2 - 1; }

  private static int right(int i) { return left(i) + 1; }
}