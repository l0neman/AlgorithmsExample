package com.example.algorthms.swordrefers;

/**
 * 面试题38：数字在排序数组中出现的次数
 *
 * 统计一个数字在排序数组中出现的次数。
 */
public class NumberOfK {

  public static int getNumberOfK(int[] array, int k) {
    final int first = getFirstKIndex(array, k);
    final int last = getLastKIndex(array, k);
    if (first != -1 && last != -1) {
      return last - first + 1;
    }
    return 0;
  }

  private static int getFirstKIndex(int[] array, int k) {
    int start = 0;
    int end = array.length - 1;
    while (start <= end) {
      int mid = (start + end) >> 1;
      if (array[mid] == k) {
        if (mid > 0 && array[mid - 1] != k || mid == 0) {
          return mid;
        } else {
          end = mid - 1;
        }
      } else if (array[mid] > k) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return -1;
  }

  private static int getLastKIndex(int[] array, int k) {
    int start = 0;
    final int last = array.length - 1;
    int end = last;
    while (start <= end) {
      int mid = (start + end) >> 1;
      if (array[mid] == k) {
        if (mid < last && array[mid + 1] != k || mid == last) {
          return mid;
        } else {
          start = mid + 1;
        }
      } else if (array[mid] > k) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return -1;
  }

}
