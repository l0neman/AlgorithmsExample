package com.example.algorthms.swordrefers;

/**
 * 面试题28：字符串的排列
 * 输入一个字符串，打印出该字符串中字符的所有排列。
 */
public class StringPermutation {
  public static void permutation(String string) {
    if (string == null || string.length() == 0) {
      return;
    }
    permutation(string.toCharArray(), 0);
  }

  private static void permutation(char[] strs, int start) {
    if (start == strs.length - 1) {
      System.out.println(strs);
      return;
    }
    for (int i = start; i < strs.length; i++) {
      if (i != start && strs[start] == strs[i]) {
        continue;
      }

      char temp = strs[start];
      strs[start] = strs[i];
      strs[i] = temp;

      permutation(strs, start + 1);

      temp = strs[start];
      strs[start] = strs[i];
      strs[i] = temp;
    }
  }
}
