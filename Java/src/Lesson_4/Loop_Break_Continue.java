package Lesson_4;

public class Loop_Break_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            if (i % 17 == 2 && i % 32 == 1) {
                //stop the loop if we want to
                System.out.println(i);
                break;
            }
        }

        boolean found = false;
        for (int i = 1; i < 1000 && !found; i++ ) {
            for (int j = 1; j < 1000; j++) {
                if (j * i % 1723 == 0) {
                    System.out.printf("%d | %d \n", i, j);
                    found = true;
                    break;
                }
            }
        }
    }
}
