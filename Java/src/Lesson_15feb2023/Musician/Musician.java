package Lesson_15feb2023.Musician;

// -= class of data here =-
// 2 of 2 files
// ----------------------------
//  Java 6  / 12.2.23  מצגת
//  שכופית 23
// ----------------------------
// תכונות:
//שם האומן
//סגנון מוזיקלי
//כלי נגינה
//ותק - מספר שנים שמנגן
//פעולות
//הדפס את השם שלך
//החזר את השם שלך
//
//הדפס את הותק שלך
//החזר את הותק שלך

public class Musician {
    String name;
    String style;
    String instrument;
    int experience;

    public Musician(String name, String style, String instrument, int experience){
        this.name = name;
        this.style = style;
        this.instrument = instrument;
        this.experience = experience;
    }

    public void printName(){
        System.out.printf("My name is %s\n",name);
    }
    public String returnName(){
        return "My name is" + name;
    }
    public void printExperience(){
        System.out.printf("I play %s %d years\n",instrument, experience);
    }
    public int returnExperience(){
        return experience;
    }
}
