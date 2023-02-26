package Lesson_15feb2023.Person;

// -= class of data here =-
// 1 of 2 files
// ----------------------------
//  Java 6  / 12.2.23  מצגת
//  שכופית 17
// ----------------------------
//  צרו מחלקה חדשה עבור Person
//  לכל Person יש: (תכונות)
//  שם פרטי
//  שם משפחה
//  תאריך לידה

// בנאי שמקבל שם פרטי, שם משפחה ותאריך לידה

// פעולות:
// הדפס שלום
// הדפס את השם הפרטי

// צרו ב main שני מופעים של המחלקה

import java.util.Date;

public class Person {
    String name;
    String lastName;
    Date birthDate;


    public Person(String name,String lastName, Date birthDate){
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }


    // מתודות
    void sayHello(){
        System.out.printf("Hello %s\n",this.name);
        }

    void printName(){
            System.out.printf("The name is : %s %s\n",this.name,this.lastName);
        }

    void printDate(){
        System.out.printf("Birthdate is: %s/%s/%d\n",this.birthDate.getYear(),this.birthDate.getMonth(),this.birthDate.getDay());
    }
}

