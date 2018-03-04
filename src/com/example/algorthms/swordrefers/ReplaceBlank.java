package com.example.algorthms.swordrefers;

/**
 * 面试题4：替换空格
 *
 *  请实现一个函数，把字符串中的每个空格替换成 "%20" 。例如输入
 *  "We are happy."，则输出 "We%20are%20happy"
 */
public class ReplaceBlank {

  public static char[] replace(char[] src) {
    if (src == null || src.length == 0) {
      return new char[]{};
    }
    int newL = src.length;
    for (char c : src) {
      if (c == ' ') { newL += 2; }
    }
    /* 计算添加替换空格后的长度 */
    char[] newStr = new char[newL];
    /* 复制到新的数组中 */
    System.arraycopy(src, 0, newStr, 0, src.length);

    int indexOfOriginal = src.length - 1;
    int indexOfNew = newL - 1;

    /* 从后向前替换 */
    while (indexOfOriginal >= 0 && indexOfNew > indexOfOriginal) {
      if (newStr[indexOfOriginal] == ' ') {
        newStr[indexOfNew--] = '0';
        newStr[indexOfNew--] = '2';
        newStr[indexOfNew--] = '%';
      } else {
        newStr[indexOfNew--] = newStr[indexOfOriginal];
      }
      indexOfOriginal--;
    }
    return newStr;
  }
}
