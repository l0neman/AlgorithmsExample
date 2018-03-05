package com.example.algorthms.classic.string;

public class KMPMatch {

  public static boolean match(String target, String match) {
    return indexOf(target, match) != -1;
  }


  public static int indexOf(String target, String match) {
    if ("".equals(match)) {
      return 0;
    }
    if (target.length() < match.length()) {
      return -1;
    }
    final char[] targets = target.toCharArray();
    final char[] matchs = match.toCharArray();
    int i = 0;
    int j = 0;
    int[] next = getNextVal(targets);
    while (i < targets.length && j < matchs.length) {
      if (j == -1 || targets[i] == matchs[j]) {
        i++;
        j++;
      } else {
        j = next[j];
      }
    }
    return j == matchs.length ? i - matchs.length : -1;
  }

  static int[] getNext(char[] strings) {
    int i = 0;
    int j = -1;
    int[] next = new int[strings.length];
    next[0] = -1;
    while (i < strings.length - 1) {
      if (j == -1 || strings[i] == strings[j]) {
        i++;
        j++;
        next[i] = j;
      } else {
        j = next[j];
      }
    }
    return next;
  }

  static int[] getNextVal(char[] strings) {
    int i = 0;
    int j = -1;
    int[] next = new int[strings.length];
    next[0] = -1;
    while (i < strings.length - 1) {
      if (j == -1 || strings[i] == strings[j]) {
        i++;
        j++;
        if (strings[i] == strings[j]) {
          next[i] = next[j];
        } else {
          next[i] = j;
        }
      } else {
        j = next[j];
      }
    }
    return next;
  }
}
