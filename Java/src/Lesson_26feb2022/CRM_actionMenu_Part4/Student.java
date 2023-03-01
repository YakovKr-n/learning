package Lesson_26feb2022.CRM_actionMenu_Part4;

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


