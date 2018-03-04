package com.example.algorthms.swordrefers;

/**
 * 面试题24：二叉搜索树的后序遍历序列
 *
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则返回 true，否则返回 false，假设输入的数组的任意两个数组
 * 都互不相同。
 */
public class SquenceOfBST {

  public static boolean verify(int[] squence) {
    if (squence == null || squence.length == 0) {
      return false;
    }
    return squence.length == 1 || verifyRecursive(squence, 0, squence.length - 1);
  }

  private static boolean verifyRecursive(int[] squence, int start, int end) {
    if (end - start <= 1) {
      return true;
    }
    int root = squence[end];
    int i = start;
    for (; i < end; i++) {
      if (squence[i] > root) {
        break;
      }
    }
    int j = i;
    for (; j < end; j++) {
      if (squence[j] < root) {
        return false;
      }
    }
    boolean leftVerify = true;
    if (i > 0) {
      leftVerify = verifyRecursive(squence, start, i - 1);
    }
    boolean rightVerify = true;
    if (i < end) {
      rightVerify = verifyRecursive(squence, i, end - 1);
    }
    return leftVerify && rightVerify;
  }
}
