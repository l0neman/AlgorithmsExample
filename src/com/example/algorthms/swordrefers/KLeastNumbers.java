package com.example.algorthms.swordrefers;

import com.example.algorthms.swordrefers.uitl.Utils;

import java.util.TreeSet;

/**
 * 面试题30：最小的k个数
 *
 * 输入 n 个整数，找出其中最小的 k 个数。
 */
public class KLeastNumbers {

  /* 分块法 */
  public static int[] getLeastNumbers(int[] target, int k) {
    if (target == null || target.length == 0 || k > target.length) {
      return null;
    }
    int start = 0;
    int end = target.length - 1;
    int index = Utils.partitionLow2High(target, start, end);
    while (index != k - 1) {
      if (index > k - 1) {
        end = index - 1;
      } else {
        start = index + 1;
      }
      index = Utils.partitionLow2High(target, start, end);
    }
    int[] result = new int[k];
    System.arraycopy(target, 0, result, 0, k);
    return result;
  }

  /* 树 */
  public static int[] getLeastNumbers2(int[] target, int k) {
    TreeSet<Integer> treeSet = new TreeSet<>();
    for (int a : target) {
      if (treeSet.size() < k) {
        treeSet.add(a);
      } else {
        int min = treeSet.last();
        if (a < min) {
          treeSet.remove(min);
          treeSet.add(a);
        }
      }
    }
    int[] result = new int[k];
    int i = 0;
    for (int a : treeSet) {
      result[i++] = a;
    }
    return result;
  }
}
