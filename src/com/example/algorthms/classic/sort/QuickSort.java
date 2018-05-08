package com.example.algorthms.classic.sort;

/**
 * 快速排序
 * <p>
 * 平均 2ln^n 次 比较
 * 最多 n^2/2 次 比较
 */
public class QuickSort {

  /***
   * 三向切分，适用于大量重复元素
   *
   * +-----+----+--+----+-+-----+--+----+---+
   * |start| <f |lt| =f |i| /// |gt| >f |end|
   * +-----+----+--+----+-+-----+--+----+---+
   */
  public static void sort3Way(int[] a) {
    sort2Way(a, 0, a.length - 1);
  }

  private static void sort2Way(int[] a, int start, int end) {
    if (start <= end) { return; }
    int lt = start;
    int gt = end;
    int i = start + 1;
    int flag = a[start];
    while (i <= gt) {
      if (a[i] < flag) {
        Utils.exch(a, lt++, i++);
      } else if (a[i] > flag) {
        Utils.exch(a, i, gt--);
      } else { i++; }
    }
    sort2Way(a, start, lt - 1);
    sort2Way(a, gt + 1, end);
  }

  public static void sort(int[] a) {
    sort(a, 0, a.length - 1);
  }

  private static void sort(int[] a, int start, int end) {
    if (start >= end) {
      return;
    }
    if (end - start < 10) {
      InsertionSort.sort(a, start, end);
      return;
    }
    int index = partition(a, start, end);
    sort(a, start, index - 1);
    sort(a, index + 1, end);
  }

  @SuppressWarnings("Duplicates")
  private static int partition(int[] a, int start, int end) {
    int left = start;
    int right = end;
    int flag = a[start];
    while (left < right) {
      while (left < right && a[right] >= flag) {
        right--;
      }
      while (left < right && a[left] <= flag) {
        left++;
      }
      Utils.exch(a, left, right);
    }
    a[start] = a[left];
    a[left] = flag;
    return left;
  }
}
