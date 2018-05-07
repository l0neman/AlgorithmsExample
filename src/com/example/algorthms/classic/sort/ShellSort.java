package com.example.algorthms.classic.sort;

public class ShellSort {
  public static void sort(int[] a) {
    int s = 1;
    while (s < a.length / 3) {
      s = s * 3 + 1;
    }
    while (s >= 1) {
      for (int i = s; i < a.length; i++) {
        for (int j = i; j >= s && a[j] < a[j - s]; j -= s) {
          Utils.exch(a, j, j - s);
        }
      }
      s /= 3;
    }
  }
}
