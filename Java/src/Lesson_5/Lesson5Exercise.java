package Lesson_5;

import java.util.Arrays;

public class Lesson5Exercise {
    public static void main(String[] args) {
        byte[] arr = new byte[10];

        for (int i = 0 ; i<arr.length ; i++) {
            arr[i]  = (byte)(Math.random()*10 + 1);
        }
        System.out.println(Arrays.toString(arr));
        boolean isFlag = false;
        iIteration:
        for (int i = 0 ; i<arr.length - 1 ; i++) {
            for(int j=i+1 ; j<arr.length ; j++) {
                if(arr[i] + arr[j] ==9 ) {
                    isFlag = true;
                    System.out.printf("Pair: %d (%d) | %d (%d)", arr[i], i, arr[j],j);
                    break iIteration;
                }
            }
        }
        if (!isFlag) {
            System.out.println("don't have pairs");
        }
    }
}

