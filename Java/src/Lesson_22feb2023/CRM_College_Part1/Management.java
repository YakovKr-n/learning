package Lesson_22feb2023.CRM_College_Part1;

import java.util.Arrays;

public class Management {
    static Student[] students = new Student[0];

    public static void main(String[] args) {
        System.out.println("CRM app started...\n");
        getNumStudents();
        fillStudents();
        System.out.println();
        System.out.println("List of students: \n");
        printStudents();

    }

    static void getNumStudents(){
        System.out.println("enter num of students");
        int numStudents = IO.nextInt();
        students = Arrays.copyOf(students,numStudents);
    }

    static void printStudents(){
        for (Student student: students){
            System.out.println(student);
        }
    }

    static void fillStudents(){
        for(int i = 0; i < students.length; i++){
            System.out.println("Enter name: ");
            String stName = IO.nextString();
            System.out.println("Enter age: ");
            int stAge = IO.nextInt();
            students[i] = new Student(stName, stAge);
        }
    }
}


