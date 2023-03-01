package Lesson_22feb2023.CRM_ArrayList_Part2;

import java.util.ArrayList;

public class Management {
       static ArrayList<Student> students = new ArrayList<Student>();

    public static void main(String[] args) {

        System.out.println("CRM app started...");
        getNumAndFillStudents();
        System.out.println("List of students: \n");
        printStudents();
    }

    static void getNumAndFillStudents(){
        System.out.println("enter num of students");
        int numStudents = IO.nextInt();
        for(int i = 0; i < numStudents; i++){
            System.out.println("Enter name: ");
            String stName = IO.nextString();
            System.out.println("Enter age: ");
            int stAge = IO.nextInt();

            Student student = new Student(stName,stAge);
            students.add(student) ;
        }
    }

    static void printStudents(){
        for (Student student: students){
            System.out.println(student);
        }
    }


}


