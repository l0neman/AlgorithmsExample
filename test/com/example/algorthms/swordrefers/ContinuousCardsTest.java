package com.example.algorthms.swordrefers;

import edu.princeton.cs.algs4.StdOut;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContinuousCardsTest {

  @Test
  public void isContinuous() {
    StdOut.println(ContinuousCards.isContinuous(
        new int[]{
            2, 3, 0, 6, 0
        }
    ));
  }
}