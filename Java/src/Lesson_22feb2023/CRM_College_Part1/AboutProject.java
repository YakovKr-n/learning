package Lesson_22feb2023.CRM_College_Part1;

public class AboutProject {
}
//    Rolling project

//    ====משימה====
//   אנחנו רוצים לבנות מערכת לניהול מכללה להאקר-יו. המערכת תאפשר ניהול סטודנטים, מרצים,
//   משימות, פרויקטים (סיום מודול וסיום קורס), משובים. אנחנו נבנה מערכת מבוססת תפריטים
//   שתאפשר לנו לשלוט בתפעול המערכת

//    חלק א משימה
//       1 .לבנות תכנית שתבקש מהמשתמש מספר סטודנטים להזין
//                  2 .עבור כל סטודנט אנחנו נקלוט שם וגיל
// 3 .אנחנו נשמור את הסטודנטים במערך במחלקת ה-MAIN הראשית
//                         4 .בסוף להדפיס את כל הסטודנטים

//    תכנון ביצוע חלק א

//      1 .בניית CLASS ראשי שנקרא לו CollegeManagement
//2 .בתוך ה-CLASS נגדיר את המתודה main שלנו
//        main-ה לתוך" Starting college management app" נוסיף הדפסה


            // Student Class בניית
    //class Student בניית. 1
    //2 .נגדיר מאפיין שם כסוג String
    //3 .נגדיר מאפיין גיל כסוג int
    //4 .נגדיר constructor אחד שקולט 2 פרמטרים, שם וגיל ונשמור אותם במאפיינים המקבילים במופע (נשתמש ב-this(
            //השלמת ה-main
    //1 .נגדיר מערך של []Student ונגדיר אותו גודל 0 בclass של CollegeManagement ונגדיר אותו static
    //2 .בתוך ה-main נגדיר Scanner עם שאלה של "כמות סטודנטים להזין" - נא להשתמש במחלקה IO לעטוף את ה-(WRAPPER (SCANNER
    //3 .נגדיר מחדש את גודל המערך []Student ע"י שימוש ב-()copyOf.Arrays ונציב במשתנה (נבדוק הצעה של אביעד)
    //4 .למלא את המערך במופעים של Students
    //a .ליצור לולאה
    //b .נשתמש ב-SCANNER לקלוט מהמשתמש שם וגיל
    //c .יוצרים אובייקטים (מופעים) של סטודנט ומשתמשים ב-constructor
            //הדפסת הסטודנטים
    //1 .נגדיר מתודה ()toString בתוך Student כדי להגדיר איך להדפיס אובייקט סטודנט
    //2 .ניצור לולאה על כל הסטודנטים ב-Management College
    //3 .נשתמש ב-println.out.System להדפיס כל אובייקט של סטודנט
