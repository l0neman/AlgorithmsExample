package com.example.algorthms.swordrefers;

/**
 * 面试题31：连续子数组的最大和
 *
 *
 */
public class GreatestSumOfSubarrays {
  public static int findCreatestSumOfSubarrays(int[] array) {
    if (array == null || array.length == 0) {
      return -1;
    }
    int max = array[0];
    for (int i = 1; i < array.length; i++) {
      array[i] = array[i] + (array[i - 1] < 0 ? 0 : array[i - 1]);
      max = Math.max(max, array[i]);
    }
    return max;
  }
}
