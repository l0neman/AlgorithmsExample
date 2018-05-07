package com.example.algorthms.classic.sort;

import com.example.algorthms.util.Printer;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

  @Test
  public void sort() {
    int[] array = {
        52, 48, 13, 57, 94, 25, 85, 4, 52, 45, 245, 184, 264, 215
    };
    InsertionSort.sort(array);
    Printer.print(array);
  }
}