package com.example.algorthms.swordrefers;

/**
 * 面试题29：数组中出现次数超过一般的数字
 *
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 */
public class MoreThanHalfNumber {
  public static int moreThanHalf(int[] nums) {
    if (nums == null || nums.length == 0) {
      return -1;
    }
    int result = nums[0];
    int count = 1;
    for (int i = 1; i < nums.length; i++) {
      if (count == 0) {
        result = nums[i];
      } else if (nums[i] == result) {
        count++;
      } else {
        count--;
      }
    }
    if (checkHalf(nums, result)) {
      return result;
    }
    return 0;
  }

  private static boolean checkHalf(int[] nums, int check) {
    int count = 0;
    for (int a : nums) {
      if (a == check) {
        count++;
      }
    }
    return count > nums.length >> 1;
  }
}
