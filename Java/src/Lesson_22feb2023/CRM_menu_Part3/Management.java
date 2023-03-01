package Lesson_22feb2023.CRM_menu_Part3;

import java.util.ArrayList;

public class Management {
       static ArrayList<Student> students = new ArrayList<Student>();

    public static void main(String[] args) {

        System.out.println("CRM app started...");
        menu();
    }

    static void menu(){
        var option = 0;
        do {
            System.out.printf("""
                     You have %d students in you list
                    1. List of students
                    2. Add student
                    3. Remove student
                    4. Exit
                    """,students.size());
            option = IO.nextInt();
            switch (option) {
                case 1 -> printStudents();
                case 2 -> addStudent();
                case 3 -> deleteStudent();
                case 4 -> System.out.println( " You out of App\n See you later...");
                default -> System.out.println("choose number 1 to 4");
                }
        } while (option !=4);
    };

    static void addStudent(){
        System.out.println("Enter name: ");
        String stName = IO.nextString();
        System.out.println("Enter age: ");
        int stAge = IO.nextInt();

        Student student = new Student(stName,stAge);
        students.add(student) ;
        System.out.println(students.get(0));

    };
    static void deleteStudent(){
        for (int i = 0; i < students.size(); i++) {
            System.out.printf("ID_%d \n",i+1);
            System.out.println(students.get(i));
        }
        System.out.println("Enter ID of student to remove");
        int iDToRemove = IO.nextInt();
        students.remove(iDToRemove-1);
    };


    static void printStudents(){
        System.out.println("List of students: \n");
        for (Student student: students){
            System.out.println(student);
        }

    }


}





