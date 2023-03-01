package Lesson_26feb2022.CRM_actionMenu_Part4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
                          -= Main Menu =-
                     You have %d students in your list
                    1. List of students
                    2. Add student
                    3. Remove student
                    4. Actions
                    5. Exit
                    """,students.size());
            option = IO.nextInt();
            switch (option) {
                case 1 -> printStudents();
                case 2 -> addStudent();
                case 3 -> deleteStudent();
                case 4 -> actions();
                case 5 -> System.out.println( " You out of App\n See you later...");
                default -> System.out.println("enter number 1 to 5");
                }
        } while (option !=5);
    };

   static void  actions(){
       var option = 0;
       do {
           System.out.printf("""
                          -= Actions =-
                     You have %d students in your list
                    1. Show how many students before 18
                    2. Show all students over 35
                    3. Search student by free text
                    4. Back to main menu
                    """,students.size());
           option = IO.nextInt();
           switch (option) {
               case 1 -> System.out.println(youngStudents());
               case 2 -> System.out.println(Arrays.toString(olderStudents()));
               case 3 -> SearchByFreeText();
               case 4 -> System.out.println();
               default -> System.out.println("enter number 1 to 4");
           }
       } while (option !=4);
   };

   static int youngStudents(){
       List<Student> studentsLess18 = students.stream().filter(c -> c.age < 18).toList();
       return studentsLess18.size();
   };
   static Student[] olderStudents(){
       List<Student> studentsOver35 = students.stream().filter(c -> c.age > 35).toList();
       Student[] students35 = new Student[studentsOver35.size()];
       return studentsOver35.toArray(students35);
   };
   static void SearchByFreeText(){
       System.out.println("Enter some free text");
       String inputOfUser = IO.nextString();
       List<Student> foundedStudents = students.stream().filter(s -> s.name.toLowerCase().contains(inputOfUser.toLowerCase())).toList();
       System.out.println(foundedStudents);
   };
    static void addStudent(){
        System.out.println("Enter name: ");
        String stName = IO.nextString();
        System.out.println("Enter age: ");
        int stAge = IO.nextInt();

        Student student = new Student(stName,stAge);
        students.add(student) ;
        printStudents();

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





