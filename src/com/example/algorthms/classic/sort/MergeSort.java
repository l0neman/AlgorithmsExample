package com.example.algorthms.classic.sort;

/**
 * 归并排序
 * 平均 nlg^n   次比较
 * 最低 nlg^n/2 次比较
 * 最高 6nlg^n  次比较
 * 空间 n （数组复制）
 */
public class MergeSort {

  private static int[] extra;

  public static void sortBU(int[] a) {
    extra = new int[a.length];
    for (int s = 1; s < a.length; s = 2 * s) {
      for (int l = 0; l < a.length - s; l += 2 * s) {
        // l + s - 1     前面数组的最后一个元素
        // l + s + s - 1 后面数组的最后一个元素
        merge(a, l, l + s - 1, Math.min(l + s + s - 1, a.length - 1));
      }
    }
  }

  /**
   * 自顶向上的方法
   * 无需额外空间，同时适合链表类型的数据结构
   *
   */
  public static void sort(int[] a) {
    extra = new int[a.length];
    sortRange(a, 0, a.length - 1);
  }

  private static void sortRange(int[] a, int start, int end) {
    if (end <= start) { return; }
    /* 小规模数组使用插入排序 */
    if (end - start < 10) {
      InsertionSort.sort(a, start, end);
      return;
    }
    int mid = start + (end - start) / 2;
    sortRange(a, start, mid);
    sortRange(a, mid + 1, end);
    /* 已经有序 */
    if (a[mid] <= a[mid + 1]) { return; }
    merge(a, start, mid, end);
  }

  private static void merge(int[] a, int left, int mid, int right) {
    int i = left;
    int j = mid + 1;
    System.arraycopy(a, left, extra, left, right - left + 1);
    for (int k = left; k <= right; k++) {
      if (i > mid) {
        a[k] = extra[j++];
      } else if (j > right) {
        a[k] = extra[i++];
      } else if (extra[i] < extra[j]) {
        a[k] = extra[i++];
      } else {
        a[k] = extra[j++];
      }
    }
  }
}
