package com.example.algorthms.swordrefers;

import com.example.algorthms.util.Printer;
import org.junit.Test;

import static org.junit.Assert.*;

public class KLeastNumbersTest {

  @Test
  public void getLeastNumbers() {
    Printer.Array.print(KLeastNumbers.getLeastNumbers2(
        new int[]{
            52, 48, 13, 57, 94, 25, 85, 4, 52, 45, 245, 184, 264, 215
        }, 5
    ));
  }
}