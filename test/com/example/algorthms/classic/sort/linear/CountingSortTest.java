package com.example.algorthms.classic.sort.linear;

import com.example.algorthms.util.Printer;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountingSortTest {

  @Test
  public void sort() {
    int[] a = {2, 5, 3, 0, 5, 8, 0, 3};
    final int[] b = new int[a.length];
    CountingSort.sort(a, b, 8);
    Printer.print(b);
  }
}