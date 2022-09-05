public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        for  (int i=0; i<11; i++) {
            System.out.println(i);
        }

        // Задача 2
        System.out.println("Задача 2");
        for (int x=10; x > 0; x-- ){
            System.out.println(x);
        }

        // Задача 3
        System.out.println("Задача 3");
        for (int i = 0; i<17; i=i+2) {
            System.out.println(i);
        }

        // Задача 4
        System.out.println("Задача 4");
        for (var w = 10; w > -10; w--);{
            System.out.println();
        }

        //  Задача 5
        System.out.println( "Задача 5");
        for (int i = 1904; i<2100; i=i+4) {
            System.out.println( i + " год является високосным!" );
        }

        // Задача 6
        System.out.println("Задача 6");
        for (int i = 7; i < 105; i=i+7) {
            System.out.println(i);
        }

        // Задача 7
        System.out.println("Задача 7");
        for (int i = 1; i<1024; i = i*2){
            System.out.println(i);
        }

        // Задача 8
        System.out.println("Задача 8");
        int salary = 29000;
        int total = 0;
        for (int i = 0; i <= 12; i++) {
            total = total+salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        }

    }
