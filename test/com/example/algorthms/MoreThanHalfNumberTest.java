package com.example.algorthms;

import edu.princeton.cs.algs4.StdOut;
import org.junit.Test;

public class MoreThanHalfNumberTest {

  @Test
  public void moreThanHalf() {
    StdOut.println(MoreThanHalfNumber.moreThanHalf(
        new int[]{1, 4, 5, 9, 2, 2, 2, 2, 2}
    ));
    StdOut.println(MoreThanHalfNumber.moreThanHalf(
        new int[]{2, 1, 2, 4, 2, 5, 9, 2, 2}
    ));
    StdOut.println(MoreThanHalfNumber.moreThanHalf(
        new int[]{1, 4, 2, 2, 5, 9, 2, 2, 2}
    ));
  }
}