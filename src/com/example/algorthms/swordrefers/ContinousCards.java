package com.example.algorthms.swordrefers;

import java.util.Arrays;

/**
 * 从扑克牌中随机抽取 5 张牌，判断是不是一个顺子，即这
 * 5 张牌是不是连续的。2~10 为数字本身，A 为 1，J为 11，Q为 12，
 * K 为 13，而大、小王可以看成任意数字。
 */
public class ContinousCards {

  public static boolean isContinous(int[] cards) {
    if (cards == null || cards.length != 5) {
      return false;
    }
    int[] sorted = sortCards(cards);
    if (sorted == null) {
      return false;
    }
    int zero = 0;
    int gap = 0;
    for (int i = 0; i < cards.length && cards[i] != 0; i++) {
      zero++;
    }
    int small = zero;
    int big = small + 1;
    while (big < cards.length) {
      gap += cards[big] - cards[small];
      small = big++;
    }
    return zero > gap;
  }

  private static int[] sortCards(int[] cards) {
    int[] hash = new int[13];
    Arrays.fill(hash, 0);
    for (int c : cards) {
      hash[c]++;
    }
    int count = 0;
    for (int h : hash) {
      if (count == cards.length) {
        return cards;
      }
      if (h != 0) {
        /* 存在两个相同的扑克牌 */
        if (h != 1) {
          return null;
        }
        cards[count++] = h;
      }
    }
    return cards;
  }
}
