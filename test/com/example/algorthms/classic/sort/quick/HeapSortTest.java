package com.example.algorthms.classic.sort.quick;

import com.example.algorthms.classic.sort.quick.HeapSort;
import com.example.algorthms.util.Printer;
import org.junit.Test;

public class HeapSortTest {

  @Test
  public void sort() {
    int[] array = {
        52, 48, 13, 57, 94, 25, 85, 4, 52, 45, 245, 184, 264, 215
    };
    HeapSort.sort(array);
    Printer.print(array);
  }
}