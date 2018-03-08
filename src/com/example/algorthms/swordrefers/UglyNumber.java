package com.example.algorthms.swordrefers;

/**
 * 面试题34：丑数
 * 我们把只包含因子 2、3 和 5 的数称为丑数。求按
 * 从小到大的顺序的第1500个丑数。
 */
public class UglyNumber {

  public static int getUglyNumber(int index) {
    if (index <= 0) {
      return 0;
    }
    int[] uglyNumbers = new int[index];
    uglyNumbers[0] = 1;
    int nextUglyIndex = 1;
    int m2 = 0;
    int m3 = 0;
    int m5 = 0;
    while (nextUglyIndex < index) {
      int min = Math.min(uglyNumbers[m2] * 2,
          Math.min(uglyNumbers[m3] * 3, uglyNumbers[m5] * 5));

      uglyNumbers[nextUglyIndex] = min;

      while (uglyNumbers[m2] * 2 <= uglyNumbers[nextUglyIndex]) { ++m2; }
      while (uglyNumbers[m3] * 3 <= uglyNumbers[nextUglyIndex]) { ++m3; }
      while (uglyNumbers[m5] * 5 <= uglyNumbers[nextUglyIndex]) { ++m5; }

      ++nextUglyIndex;
    }
    return uglyNumbers[nextUglyIndex - 1];
  }
}
