package com.example.algorthms.swordrefers;

import edu.princeton.cs.algs4.StdOut;
import org.junit.Test;

public class NumberOfKTest {

  @Test
  public void getNumberOfK() {
    final int numberOfK = NumberOfK.getNumberOfK(new int[]{
        1, 2, 3, 5, 5, 5, 5, 8, 9, 12, 15, 56
    }, 10);
    StdOut.println(numberOfK);
  }
}