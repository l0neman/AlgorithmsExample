package com.example.algorthms.swordrefers;

import com.example.algorthms.swordrefers.util.Printer;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceBlankTest {

  @Test
  public void replace() {
    Printer.print(ReplaceBlank.replace("hello world h h".toCharArray()));
  }
}