package Lesson_19feb2023.Exercises;

public class Exercises {
    public static void main(String[] args) {
        Ex1();
        Ex2();
        Ex3();
    }

    public static void Ex1(){
        char[] data = {'a','b','c'};
        String str = new String(data);
        System.out.println(str);
    }
    public static void Ex2(){
        String str = "Hello World";
        String str2 = new String(str.toCharArray(),str.length()-5,5);
        System.out.println(str2);
        String str3 = str.substring(str.length()-5);
        System.out.println(str3);
    }

    public static void Ex3(){
        String hello = "Hello World";
        int count = (int)hello.chars().filter(ch -> ch == 'l').count();
        System.out.println(count);
    }
}
