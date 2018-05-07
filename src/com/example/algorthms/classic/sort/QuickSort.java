package com.example.algorthms.classic.sort;

public class QuickSort {

  public static void sort(int[] a) {
    sort(a, 0, a.length - 1);
  }

  private static void sort(int[] a, int start, int end) {
    if (start >= end) {
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
