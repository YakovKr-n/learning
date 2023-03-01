package Lesson_26feb2022;

import java.util.ArrayList;
import java.util.List;

//1. Create ArrayList of type Integer
//2. Add 8 random numbersfrom 1 to 100
//3. Count number of elements that are even
//4. Return a newlist of all numbers above 50
public class Exercise {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < 8; i++) {
            int num = (int)Math.floor(Math.random()*101);
            numbers.add(num);
        }

        numbers.forEach(n -> System.out.print(n+" "));

        int evensInArray = (int)numbers.stream().filter(n ->(n%2)==0).count();
        List moreThen50InArray = numbers.stream().filter(n -> n >50).toList();

        System.out.println();
        System.out.println(evensInArray);
        moreThen50InArray.forEach(n -> System.out.print(n + " "));

    }
}
