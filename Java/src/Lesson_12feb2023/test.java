package Lesson_12feb2023;

public class test {
    public static void main(String[] args) {
        int n=789;
        while(n>0)
        {
            System.out.print(n-10*(n/10));
            n=n/10;
        }
    }
}
