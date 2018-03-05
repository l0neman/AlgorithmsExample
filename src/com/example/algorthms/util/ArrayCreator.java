package com.example.algorthms.util;

public class ArrayCreator {

  /**
   * 使用可变参数列表创建二维数组
   */
  public static int[][] create2Array(int column, int row, int... a) {
    return to2Array(a, column, row);
  }

  private static int[][] to2Array(int a[], int column, int row) {
    if (a.length < column * row) {
      throw new UnsupportedOperationException("Insufficient amount");
    }
    int[][] b = new int[column][row];
    for (int i = 0; i < a.length; i++) {
      b[i / column][i % column] = a[i];
    }
    return b;
  }
}
