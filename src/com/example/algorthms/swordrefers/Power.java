package com.example.algorthms.swordrefers;

/**
 * 面试题11：数值的整数次方
 *
 * 实现函数 double Power(double base, int exponent)，求 base 的
 * exponent 次方，不得使用库函数，同时不需要考虑大数问题。
 * a^n = {
 * n 为偶数：a^(n/2) * a^(n/2)
 * n 为奇数：a^((n-1)/2) * a^((n-1)/2) * a
 * }
 */
public class Power {

  public static double power(double base, int exponent) {
    if (equal(0D, base) && exponent < 0) {
      return 0D;
    }
    double result = powerWithIntExponent(base, exponent);
    if (exponent < 0) {
      result = 1.0 / result;
    }
    return result;
  }

  private static boolean equal(double d0, double d1) {
    double v = d0 - d1;
    return v > -0.0000001D && v < 0.0000001D;
  }

  private static double powerWithIntExponent(double base, int exponent) {
    if (exponent == 0) { return 1; }
    if (exponent == 1) { return base; }

    double result = powerWithIntExponent(base, exponent >> 1);
    result *= result;
    if ((exponent & 0x1) == 1) {
      result *= base;
    }
    return result;
  }
}
