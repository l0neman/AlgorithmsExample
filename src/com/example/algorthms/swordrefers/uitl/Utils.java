package com.example.algorthms.swordrefers.uitl;

public class Utils {

  @SuppressWarnings("Duplicates")
  public static int partitionLow2High(int[] array, int start, int end) {
    int left = start;
    int right = end;
    final int flag = array[start];
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

  public static int partitionHigh2Low(int[] array, int start, int end) {
    int left = start;
    int right = end;
    final int flag = array[start];
    while (left < right) {
      while (left < right && array[right] <= flag) {
        right--;
      }
      while (left < right && array[left] >= flag) {
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
