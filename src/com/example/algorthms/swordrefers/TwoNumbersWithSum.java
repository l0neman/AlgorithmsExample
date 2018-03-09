package com.example.algorthms.swordrefers;

import edu.princeton.cs.algs4.StdOut;

/**
 * 面试题41：和为 s 的两个数字 VS 和为 s 的连续正数序列
 * 输入一个递增排序的数组和一个数字 s，在数组中查找两个数，
 * 使得它们的和正好是 s。如果多对数字的和为 s。输出任意一对即可。
 */
public class TwoNumbersWithSum {

  public static boolean findNumbersWithSum(int data[], int n) {
    if (data == null || data.length < 2) {
      return false;
    }
    int start = 0;
    int end = data.length - 1;
    while (start < end) {
      int sum = data[start] + data[end];
      if (sum == n) {
        StdOut.println("1: " + data[start] + " 2: " + data[end]);
        return true;
      } else if (sum > n) {
        end--;
      } else {
        start++;
      }
    }
    return false;
  }

  /**
   * 输入一个整数 s，打印出所有和为 s 的整数序列（至少有两个数）。
   */
  public static void findContinuousSequeue(int sum) {
    if (sum < 3) {
      print(1, 2);
      return;
    }
    int start = 1;
    int end = 2;
    final int middle = (sum + 1) >> 1;
    int curr = start + end;
    while (start < middle) {
      if (curr == sum) {
        print(start, end);
      }
      while (curr > sum && start < middle) {
        curr -= start;
        start++;
        if (curr == sum) {
          print(start, end);
        }
      }
      end++;
      curr += end;
    }
  }

  private static void print(int start, int end) {
    for (int i = start; i <= end; i++) {
      StdOut.print(i + "\t");
    }
    StdOut.println();
  }
}
