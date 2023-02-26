package Lesson_4;

public class Lesson4_1 {
    public static void main(String[] args) {
        breakWithFlag();
        Ex1();
        Ex2();
        Ex3();
        Ex4();
        Ex5();
        Ex6();
    }
        static void breakWithFlag(){
        boolean found = false;
        for (int i = 1; i < 1000 && !found; i++ ) {
            for (int j = 1; j < 1000 && !found; j++) {
                if ((j * i) % 172 == 0) {
                    System.out.printf("%d | %d \n", i, j);
                    found = true;
                    }
                }
            }
        }

        static void Ex1(){
            System.out.println("-----Ex1-----");
            System.out.println("הדפיסו את כל המספרים מ-1 עד 10 כולל");
            for( int i = 1; i <= 10; i++){
                System.out.print( i + " ");
            }
            System.out.println("\n");
        }

        static void Ex2(){
            System.out.println("-----Ex2-----");
            System.out.println("הדפיסו את המכפלה של כל המספרים בין 1 ל-5");
            System.out.println("יש להשתמש בלולאה כדי לחשב כמה זה 1*2*3*4*5");
            System.out.println();
            int j = 1;
            for( int i = 1; i <= 5; i++) {
                j *= i;
            }
            System.out.println("1*2*3*4*5 = " + j);
            System.out.println();
        }

        static void Ex3(){
            System.out.println("-----Ex3-----");
            System.out.println("הדפיסו את כל המספרים הזוגיים בין 2 ל-100");
            for (int i = 2; i <= 100; i++) {
                if (i % 2 == 0) {
                    System.out.print( i + " ");
                }
            }
            System.out.println("\n");
        }

        static void Ex4(){
            System.out.println("-----Ex4-----");
            System.out.println("יש להדפיס את כל המספרים שמתחלקים גם ב-3 וגם ב-5 בלי שארית בין 0 ל-100");
            for (int i = 0; i < 100; i++) {
                if (i % 3 == 0  &&  i % 5 == 0) {
                    System.out.print( i + " " );
                }
            }
            System.out.println("\n");
    }
        static void Ex5(){
            System.out.println("-----Ex5-----");
            System.out.println("הדפיסו 10 פעמים כוכבית");
            for (int i = 0; i < 10; i++) {
                    System.out.print( "* " );
            }
            System.out.println("\n");
    }

            static void Ex6(){
                System.out.println("-----Ex6-----");
                System.out.println("הדפיסו את הסכום של כל המספרים בין1 ל-20");
                int j = 0;
                for (int i = 0; i <= 20; i++) {
                    j += i;
                }
                System.out.print("1+2+3+4+5+6+7+8+9+10+11+12+13+14+15+16+17+18+19+20 = " + j );
                System.out.println();
            }
}


