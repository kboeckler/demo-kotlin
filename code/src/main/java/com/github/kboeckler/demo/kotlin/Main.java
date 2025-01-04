package com.github.kboeckler.demo.kotlin;

import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {
    System.out.println("Hello from Java");
    Stream.of(1, 2).filter(num -> num % 2 == 0).findFirst();
  }
}
