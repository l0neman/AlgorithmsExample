package com.example.algorthms.swordrefers;

/**
 * 面试题42：反转单词顺序 VS 左旋转字符串
 * 输入一个英文句子，翻转句子中的单词的顺序，但单词内字符的顺序
 * 不变。为简单起见，标点符号和普通字母一样处理。例如输入字符串
 * "I an a student."，则输出 "student. a am I"
 */
public class ReverseWordsInSentence {

  public static String reverseSentence(String sentence) {
    if (sentence == null || sentence.length() == 0) {
      return "";
    }
    final char[] chars = sentence.toCharArray();
    reverseCharArray(chars, 0, chars.length - 1);
    int start = -1;
    int end = 0;
    while (end < chars.length) {
      if (chars[end] == ' ') {
        if (end == 0) {
          start++;
        } else {
          reverseCharArray(chars, start + 1, end - 1);
          start = end;
        }
      }
      end++;
    }
    reverseCharArray(chars, start + 1, end - 1);
    return String.valueOf(chars);
  }

  private static void reverseCharArray(char[] chars, int start, int end) {
    final int half = (end + start) >> 1;
    for (int i = start; i < half; i++) {
      char t = chars[i];
      chars[i] = chars[end - i];
      chars[end - i] = t;
    }
  }

  /**
   * 字符串的左旋操作是把字符串前面的若干个字符转移到
   * 字符串的尾部。请定义一个函数实现字符串左旋操作的功能。
   */
  public static String leftRotateString(String string, int rotate) {
    if (string == null || string.length() == 0 || rotate > string.length()) {
      return "";
    }
    if (rotate == string.length()) {
      return string;
    }
    final char[] chars = string.toCharArray();
    reverseCharArray(chars, 0, rotate - 1);
    reverseCharArray(chars, rotate, chars.length - 1);
    reverseCharArray(chars, 0, chars.length - 1);
    return String.valueOf(chars);
  }


}
