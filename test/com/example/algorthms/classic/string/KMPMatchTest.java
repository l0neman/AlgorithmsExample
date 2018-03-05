package com.example.algorthms.classic.string;

import com.example.algorthms.util.Printer;
import edu.princeton.cs.algs4.StdOut;
import org.junit.Test;

public class KMPMatchTest {

  @Test
  public void getNext() {
    int[] next = KMPMatch.getNext("ababaaaba".toCharArray());
    int[] nextVal = KMPMatch.getNextVal("ababaaaba".toCharArray());
    Printer.print(next);
    Printer.print(nextVal);

    StdOut.println(KMPMatch.indexOf("abcababc", "cabab"));
  }

}