package com.example.algorthms.swordrefers;

import edu.princeton.cs.algs4.StdOut;
import org.junit.Test;

public class ReverseWordsInSentenceTest {

  @Test
  public void reverseSentence() {
    StdOut.println(ReverseWordsInSentence.reverseSentence(
        "I am a Student."
    ));
    StdOut.println(ReverseWordsInSentence.leftRotateString(
        "abcdefg", 6
    ));
  }
}