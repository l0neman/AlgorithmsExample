package com.example.algorthms.classic.sort;

public class Utils {

  public static void exch(int[] a, int i, int j) {
    int t = a[i];
    a[i] = a[j];
    a[j] = t;
  }
}
