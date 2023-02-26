package Lesson_15feb2023.Musician;

// -= class of controller here =-
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

public class MeMusician {
    public static void main(String[] args) {
        Musician me = new Musician("John","mix","piano",10);
        me.printName();
        me.returnName();
        me.printExperience();
        me.returnExperience();
    }
}
