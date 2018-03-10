package com.example.algorthms.swordrefers;

import java.util.Arrays;

/**
 * 从扑克牌中随机抽取 5 张牌，判断是不是一个顺子，即这
 * 5 张牌是不是连续的。2~10 为数字本身，A 为 1，J为 11，Q为 12，
 * K 为 13，而大、小王可以看成任意数字。
 */
public class ContinuousCards {

  public static boolean isContinuous(int[] cards) {
    if (cards == null || cards.length != 5) {
      return false;
    }
    int[] sorted = sortCards(cards);
    if (sorted == null) {
      return false;
    }
    int zero = 0;
    int gap = 0;
    for (int i = 0; i < cards.length && cards[i] == 0; i++) {
      zero++;
    }
    int small = zero;
    int big = small + 1;
    while (big < cards.length) {
      gap += (cards[big] - cards[small] - 1);
      small = big++;
    }
    return zero >= gap;
  }

  private static int[] sortCards(int[] cards) {
    int[] hash = new int[14];
    Arrays.fill(hash, 0);
    for (int c : cards) {
      hash[c]++;
    }
    int count = 0;
    for (int j = 0; j < hash.length; j++) {
      if (count == cards.length) {
        return cards;
      }
      if (j == 0) {
        for (int i = 0; i < hash[0]; i++) {
          cards[count++] = 0;
        }
      } else {
        /* 存在两个相同的扑克牌 */
        if (hash[j] > 1) {
          return null;
        }
        if(hash[j] != 0){
          cards[count++] = j;
        }
      }
    }
    return cards;
  }
}
