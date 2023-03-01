package Lesson_22feb2023.CRM_ArrayList_Part2;

public class Student {
    String name;
    int age;

    public Student(String name, int age){
        this.name = name;
        this.age =age;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\n" + "Age :" + this.age + "\n" ;
    }
}


