package Lesson_22feb2023.ArrayLists;

import java.util.ArrayList;

public class ArrayList_1 {
    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<String>();

        studentNames.add("Tomer"); // add to index 0
        studentNames.add("Shimon"); // add to index 1
        studentNames.add("Eitan"); // add to index 2
        studentNames.add("Daniel"); // add to index 3

        System.out.println(studentNames.get(0));
        studentNames.set(2,"Guy");
        System.out.println(studentNames.get(2));

        studentNames.remove(1);
        System.out.println(studentNames.get(1));
    }
}
