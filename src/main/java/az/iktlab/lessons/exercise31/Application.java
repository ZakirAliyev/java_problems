package az.iktlab.lessons.exercise31;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void run() {

        List<Person> people = new ArrayList<>(15);

        Person father = new Person("Adam", "Not defined");
        Person mother = new Person("Havva", "Not defined");

        people.add(new Person("Habil1", "Adamoghlu", 44, Gender.MALE, father, mother));
        people.add(new Person("Habil2", "Adamoghlu", 43, Gender.MALE, father, mother));
        people.add(new Person("Habil3", "Adamoghlu", 42, Gender.MALE, father, mother));
        people.add(new Person("Habil4", "Adamoghlu", 41, Gender.MALE, father, mother));
        people.add(new Person("Habil4", "Adamoghlu", 41, Gender.MALE, father, mother));
        people.add(new Person("Habil5", "Adamoghlu", 40, Gender.MALE, father, mother));
        people.add(new Person("Habil6", "Adamoghlu", 39, Gender.MALE, father, mother));
        people.add(new Person("Habil7", "Adamoghlu", 38, Gender.MALE, father, mother));
        people.add(new Person("Habil8", "Adamoghlu", 37, Gender.MALE, father, mother));
        people.add(new Person("Habil9", "Adamoghlu", 36, Gender.MALE, father, mother));
        people.add(new Person("Habil10", "Adamoghlu", 35, Gender.MALE, father, mother));
        people.add(new Person("Habil11", "Adamoghlu", 34, Gender.MALE, father, mother));
        people.add(new Person("Habil12", "Adamoghlu", 33, Gender.MALE, father, mother));
        people.add(new Person("Habil13", "Adamoghlu", 32, Gender.MALE, father, mother));
        people.add(new Person("Habil14", "Adamoghlu", 31, Gender.MALE, father, mother));
        people.add(new Person("Habil15", "Adamoghlu", 30, Gender.MALE, father, mother));

    }
}
