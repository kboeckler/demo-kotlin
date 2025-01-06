package com.github.kboeckler.demo.kotlin;

import java.util.Objects;

public class ClassesJ {

  private static class SomeClass {

    private final int zahl;

    private final int anotherZahl;

    public SomeClass(int zahl) {
      this.zahl = zahl;
      anotherZahl = zahl * 2;
    }

    public SomeClass() {
      this(1);
    }

    void printIt() {
      System.out.println(zahl);
      System.out.println(anotherZahl);
    }
  }

  private static interface SomeInterface {
    void printIt();
  }

  private static class SomeImplementation implements SomeInterface {
    @Override
    public void printIt() {
      System.out.println("Hallo from Implementation");
    }
  }

  private static class SomeOldDataClass {
    private final int zahl;

    private SomeOldDataClass(int zahl) {
      this.zahl = zahl;
    }

    public int getZahl() {
      return zahl;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      SomeOldDataClass that = (SomeOldDataClass) o;
      return zahl == that.zahl;
    }

    @Override
    public int hashCode() {
      return Objects.hashCode(zahl);
    }
  }

  private record SomeDataClass(int zahl) {}
}
