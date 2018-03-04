package com.example.algorthms.swordrefers;

/**
 * 面试题14：调整数组顺序使奇数位于偶数前面
 *
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
 */
public class ReorderArray {

  public static void reorderArray(int[] array) {
    int even = 0;
    int odd = array.length - 1;
    while (even < odd) {
      while (even < odd && (array[even] & 0x1) == 1) {
        even++;
      }
      while (even < odd && (array[odd] & 0x1) == 0) {
        odd--;
      }
      exch(array, even, odd);
    }
  }

  private static void exch(int[] a, int x, int y) {
    int t = a[x];
    a[x] = a[y];
    a[y] = t;
  }
}
