package com.github.kboeckler.demo.kotlin;

import java.util.Optional;

public class NonNullsJ {

  public static void main(String[] args) {
    String name = "Kevin";
    Optional<String> anotherNameOrNot = Optional.of("Kevin");
    Optional<String> anotherNameOrNot2 = Optional.empty();
  }
}
