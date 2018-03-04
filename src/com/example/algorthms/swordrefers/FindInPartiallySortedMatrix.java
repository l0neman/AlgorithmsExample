package com.example.algorthms.swordrefers;

import edu.princeton.cs.algs4.StdOut;

/**
 * 面试题3：
 *
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的
 * 一个二维数组和一个整数，判断数组中是否含有该整数
 *
 *  | 1, 2, 8,  9,  |
 *  | 2, 4, 9,  12, |
 *  | 4, 7, 10, 13, |
 *  | 6, 8, 11, 15  |
 */
public class FindInPartiallySortedMatrix {

  /** 右上角开始 */
  public static boolean find(int[][] a, int column, int row, int target) {
    if (a == null || a.length * column < column * row) {
      return false;
    }
    int findRow = 0;
    int findColumn = column - 1;
    while (findRow < row && findColumn >= 0) {
      if (a[findRow][findColumn] == target) {
        return true;
      } else if (a[findRow][findColumn] < target) {
        findRow++;
        StdOut.println("row++");
      } else {
        findColumn--;
        StdOut.println("column--");
      }
    }
    return false;
  }

  /** 从左下角开始 */
  public static boolean find2(int[][] a, int column, int row, int target) {
    if (a == null || a.length * column < row * column) {
      return false;
    }
    int findRow = row - 1;
    int findColumn = 0;
    while (findColumn < column && findRow >= 0) {
      if (a[findRow][findColumn] == target) {
        return true;
      } else if (a[findRow][findColumn] < target) {
        findColumn++;
        StdOut.println("column++");
      } else {
        findRow--;
        StdOut.println("row--");
      }
    }
    return false;
  }
}
