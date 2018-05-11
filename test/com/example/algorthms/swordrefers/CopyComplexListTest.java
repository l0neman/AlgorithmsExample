package com.example.algorthms.swordrefers;

import com.example.algorthms.swordrefers.bean.ComplexListNode;
import com.example.algorthms.util.Printer;
import org.junit.Test;

public class CopyComplexListTest {

  @Test
  public void copy() {
    ComplexListNode a = new ComplexListNode('A');
    ComplexListNode b = new ComplexListNode('B');
    ComplexListNode c = new ComplexListNode('C');
    ComplexListNode d = new ComplexListNode('D');
    ComplexListNode e = new ComplexListNode('E');

    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;

    a.sibling = c;
    b.sibling = e;
    d.sibling = b;

    Printer.LinkedList.print(a);

    Printer.LinkedList.print(CopyComplexList.clone(a));
  }
}