package Lesson_22feb2023.CRM_menu_Part3;

public class test {
    public static void main(String[] args) {
        var option = 0;
        do{option = IO.nextInt();
            switch (option) {
                case 1 -> System.out.println("test");
                case 2 ->  System.out.println("exit");
                default -> System.out.println("enter 1 or 2");
            }}while (option !=2 );
        }
    }

