package com.example.algorthms.swordrefers;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 面试题35：第一个只出现一次的字符。
 */
public class FirstNotRepeatingChar {

  public static char firstNotRepeatingChar(String str) {
    Map<Character, Integer> map = new LinkedHashMap<>();
    final char[] strs = str.toCharArray();
    for (char c : strs) {
      final Integer integer = map.get(c);
      if (integer == null) {
        map.put(c, 1);
      } else {
        map.put(c, integer + 1);
      }
    }
    for (char c : strs) {
      if (map.get(c) == 1) {
        return c;
      }
    }
    return '\0';
  }
}
