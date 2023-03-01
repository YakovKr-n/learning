package Lesson_march1_2023;

import java.time.LocalDate;

public class Animal {
    LocalDate birthDate;
    int numOfLegs;
    String name;

    public Animal(LocalDate birthDate, int noOfLegs, String name) {
        this.birthDate = birthDate;
        this.numOfLegs = noOfLegs;
        this.name = name;
    }

    public void feed(String food) {
        System.out.println("Feeding with " + food);
    }

    public String toString() {
        return name + " ; " + numOfLegs + " legs ; " + birthDate;
    }
}
