package Lesson_12feb2023;
import java.util.Arrays;

public class Slide11 {
    public static void main(String[] args) {
        Ex1();
        Ex2();
}
    static void Ex1(){
        int[][] table = new int[4][5];

        //Question no.3: Populate 3rd row with these numbers 2, 3, 5, 10, 20
        int sum = 0;
        for (int i=0; i<5; i++){
            // sum all elements
            sum += 1+2;
            table[2][i] = i+2;
        }
        System.out.println(Arrays.toString(table[2]));
    }

    static void Ex2() {
        // Print the 2d array
        int[][] table = new int[4][5];
        for (int i = 0; i < table.length; i++) {
            Printing_2d_array(table,i);
        }
    }

    static void Printing_2d_array(int[][] table, int i){
        for (int j = 0; j < table[i].length; j++){
            System.out.printf("%d, %d | ", i, j);
        }
        System.out.println();
    }
}

