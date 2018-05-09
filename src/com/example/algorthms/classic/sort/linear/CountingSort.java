package com.example.algorthms.classic.sort.linear;

import java.util.Arrays;

public class CountingSort {
  public static void sort(int[] a, int[] b, int k) {
    int[] temp = new int[k + 1];
    Arrays.fill(temp, 0);
    for (int x : a) {
      temp[x] = temp[x] + 1;
    }
    for (int i = 1; i <= k; i++) {
      temp[i] = temp[i] + temp[i - 1];
    }
    for (int i = a.length - 1; i >= 0; i--) {
      int src = a[i];
      b[temp[src] - 1] = src;
      temp[src] = temp[src] - 1;
    }
  }
}
