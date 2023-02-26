package Lesson_15feb2023.Person;

// -= class of controller here =-
// 2 of 2 files
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

import static java.util.Calendar.MAY;
import static java.util.Calendar.JULY;

public class Persons {
    public static void main(String[] args) {
        // מופעים
        Person human1 = new Person("Mister","Smith", new Date(1970,MAY,24));
        human1.sayHello();
        human1.printName();
        human1.printDate();

        System.out.println();

        Person human2 = new Person("Mister","Apchi", new Date(1980,JULY,15));
        human2.sayHello();
        human2.printName();
        human2.printDate();

    }
}
