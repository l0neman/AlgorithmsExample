package com.example.algorthms.swordrefers;

import edu.princeton.cs.algs4.StdOut;
import org.junit.Test;

public class NumbersAppearOnceTest {

  @Test
  public void findNumsAppearOnce() {
    StdOut.println(NumbersAppearOnce.findNumsAppearOnce(new int[]{
            1, 2, 2, 5, 8, 6, 4, 4, 8, 7, 1, 7
        }
    ));
  }
}