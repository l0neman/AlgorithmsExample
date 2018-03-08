package com.example.algorthms.classic.sort;

public class QuickSort {

  public static void sort(int[] array) {
    sort(array, 0, array.length - 1);
  }

  private static void sort(int[] array, int start, int end) {
    if (start >= end) {
      return;
    }
    int index = partition(array, start, end);
    sort(array, start, index - 1);
    sort(array, index + 1, end);
  }

  @SuppressWarnings("Duplicates")
  private static int partition(int[] array, int start, int end) {
    int left = start;
    int right = end;
    int flag = array[start];
    while (left < right) {
      while (left < right && array[right] >= flag) {
        right--;
      }
      while (left < right && array[left] <= flag) {
        left++;
      }
      int t = array[left];
      array[left] = array[right];
      array[right] = t;
    }
    array[start] = array[left];
    array[left] = flag;
    return left;
  }
}
