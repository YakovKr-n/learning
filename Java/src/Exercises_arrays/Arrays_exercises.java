package Exercises_arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Arrays_exercises {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] arr = new String[10];

        for(int i=0; i < 10; i++) {
            System.out.print("Enter some string " + (i+1) + " : ");
            arr[i] = scan.next();
        }
        System.out.println(Arrays.toString(arr) +"\n");

        System.out.println("upside down elements of array:");
        for (int i=9; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }

    }
}
