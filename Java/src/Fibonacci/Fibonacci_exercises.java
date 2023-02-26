package Fibonacci;
import java.util.Arrays;

public class Fibonacci_exercises {
    public static void main(String[] args) {
        Fibonacci();
        Fibonacci1();
    }
    static void Fibonacci() {
        System.out.println(" print first 10 numbers from Fibonacci series");
        int a = 0, b = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println("\n");
    }

    static void Fibonacci1() {
        System.out.println("Create an array of size 15 and fill it up with numbers from Fibonacci series");
        System.out.println("Print this array");
        int[] arr = new int[15];
        int a = 0, b = 1;
        for (int i = 0; i < 15; i++) {
            arr[i] = a;
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println(Arrays.toString(arr));
    }
}