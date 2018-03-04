package com.example.algorthms.swordrefers;

/**
 * 面试题8：旋转数组中的最小数字
 *
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为
 * 数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转
 * 数组的最小元素。
 * 例如数组：{3, 4, 5, 1, 2} 为 {1, 2, 3, 4, 5}，该
 * 旋转数组的最小值为1。
 */
public class MinInRotateArray {

  public static int findMin(int[] array) {
    if (array == null || array.length == 0) {
      throw new AssertionError("error");
    }
    int start = 0;
    int end = array.length - 1;
    if (array[start] < array[end]) {
      return array[start];
    }
    while (end - start != 1) {
      int mid = (end + start) >>> 1;
      if (array[start] == array[mid] && array[mid] == array[end]) {
        return findMinWithOrder(array, start + 1, end);
      }
      if (array[mid] >= array[start]) {
        start = mid;
      } else if (array[mid] <= array[end]) {
        end = mid;
      }
    }
    return array[end];
  }

  private static int findMinWithOrder(int[] array, int start, int end) {
    final int flag = array[start];
    if (array[start] < array[end]) {
      return flag;
    }
    for (int i = start; i <= end; i++) {
      if (array[i] < flag) {
        return array[i];
      }
    }
    throw new AssertionError("no min");
  }
}
