package com.example.algorthms.classic.sort.linear;

import com.example.algorthms.util.Printer;
import org.junit.Test;

import static org.junit.Assert.*;

public class RadixSortTest {

  @Test
  public void sort() {
    int[] n = {329, 457, 657, 839, 436, 720, 355};
    RadixSort.sort(n, 3);
    Printer.Array.print(n);
  }
}