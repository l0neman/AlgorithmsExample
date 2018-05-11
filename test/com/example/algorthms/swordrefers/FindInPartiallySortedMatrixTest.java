package com.example.algorthms.swordrefers;

import com.example.algorthms.util.ArrayCreator;
import com.example.algorthms.util.Printer;
import edu.princeton.cs.algs4.StdOut;
import org.junit.Test;

public class FindInPartiallySortedMatrixTest {

  @Test
  public void find() {
    int[][] a = ArrayCreator.create2Array(4, 4,
        1, 2, 8, 9,
        2, 4, 9, 12,
        4, 7, 10, 13,
        6, 8, 11, 15
    );
    Printer.Array.print(a, 4);
    StdOut.println(FindInPartiallySortedMatrix.find(a, 4, 4, 7));
  }

  @Test
  public void find2() {
    int[][] a = ArrayCreator.create2Array(4, 4,
        1, 2, 8, 9,
        2, 4, 9, 12,
        4, 7, 10, 13,
        6, 8, 11, 15
    );
    Printer.Array.print(a, 4);
    StdOut.println(FindInPartiallySortedMatrix.find2(a, 4, 4, 7));
  }
}