package com.github.kboeckler.demo.kotlin;

import java.util.Optional;

public class NonNullsJ {

  public static void main(String[] args) {
    // Optional
    String name = "Kevin";
    Optional<String> nameOrNot = Optional.of("Kevin");
    Optional<String> anotherNameOrNot = Optional.empty();

    // orElse
    String myName = nameOrNot.orElse("Max");

    // Chaining mit map
    var person = new Person(new Name("Kevin", "Böckler"));
    System.out.println(person.getName().map(Name::vorname));
    var personWithoutName = new Person(null);
    System.out.println(personWithoutName.getName().map(Name::vorname));
    String vorname = personWithoutName.getName().map(Name::vorname).orElse("Max");
    System.out.println(vorname);

    // ifPresent
    person.getName().ifPresent(
        personName -> {
          System.out.println(personName);
        });

    // if / get
    if (nameOrNot.isPresent()) {
      int length = nameOrNot.get().length();
    }
    int forcedLength = nameOrNot.get().length();
  }

  private record Person(Name name) {
    public Optional<Name> getName() {
      return Optional.ofNullable(name);
    }
  }

  private record Name(String vorname, String nachname) {}
}
