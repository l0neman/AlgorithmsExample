package com.example.algorthms.swordrefers;

import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * 面试题12：打印1到最大的n位数
 *
 * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。
 * 比如输入 3，则打印出 1、2、3 一直到最大的3位即 999。
 */
public class Print1ToMaxOfNDigits {

  /* 使用迭代累加 */
  public static void print(int n) {
    if (n <= 0) {
      StdOut.println(0);
    }
    byte[] number = new byte[n];
    Arrays.fill(number, (byte) 0);
    while (!increment(number)) {
      printNum(number);
    }
  }

  private static void printNum(byte[] number) {
    boolean isStart = false;
    for (byte aNumber : number) {
      if (!isStart && aNumber != 0) {
        isStart = true;
      }
      if (isStart) {
        StdOut.print(aNumber);
      }
    }
    StdOut.print('\t');
  }

  private static boolean increment(byte[] number) {
    boolean isOverFlow = false;
    /* 进位 */
    byte takeOver = 0;
    for (int i = number.length - 1; i >= 0; i--) {
      byte newNum = (byte) (number[i] + takeOver);
      if (i == number.length - 1) {
        newNum++;
      }
      if (newNum == 10) {
        if (i == 0) {
          isOverFlow = true;
        } else {
          newNum = 0;
          takeOver = 1;
          number[i] = newNum;
        }
      } else {
        number[i] = newNum;
        break;
      }
    }
    return isOverFlow;
  }

  /* 使用递归的方法 */
  public static void print2(int n) {
    if (n <= 0) {
      return;
    }
    byte[] number = new byte[n];
    Arrays.fill(number, (byte) 0);
    for (byte i = 0; i < 10; i++) {
      number[0] = i;
      print1ToMaxOfNDigitsRecursively(number, 0);
    }
  }

  /* 打印从 index 开始，打印后面的所有数字的全排列 */
  private static void print1ToMaxOfNDigitsRecursively(byte[] number, int index) {
    if (index == number.length - 1) {
      printNum(number);
      return;
    }
    for (byte i = 0; i < 10; i++) {
      number[index + 1] = i;
      print1ToMaxOfNDigitsRecursively(number, index + 1);
    }
  }
}
