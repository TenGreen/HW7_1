public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();

    }
    public static void task1() {
        System.out.println("Задача 1");
        for (int i=1;i<=10; i++) {
            System.out.println(i);
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        for (int i=10; i>0; i--) {
            System.out.println(i);
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        for (int i=0; i<=17; i=i+2) {
            System.out.println(i);
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        for (int i=10; i>= -10; i=i-1) {
            System.out.println(i);
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        for (int i=1904; i<2096; i=i+4) {
            System.out.println(i +" год является високосным");
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        for (int i=7; i<100; i=i+7) {
            System.out.print(i +" ");
        }
        System.out.println(' ');
    }
    public static void task7() {
        System.out.println("Задача 7");
        for (int i=2; i<520; i=i*2) {
            System.out.print(i + " ");
        }
        System.out.println(' ');
    }
    public static void task8 () {
        System.out.println("Задача 8");
        double contribution = 0.0d;
        int month = 8;
        for (int i=1; i<= month ; i++) {
            contribution = contribution +29000;
            System.out.print("Месяц " + i + ", сумма накоплений равна ");
            System.out.println( contribution + " рублей");
        }
    }
    public static void task9() {
        System.out.println("Задача 9");
        double contribution = 0.0d;
        double salary = 29000.0d;
        for (int i = 0; i < 12; i++) {
            contribution = contribution + contribution /100;
            contribution = contribution + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + contribution);
        }

    }
    public static void task10() {
        System.out.println("Задача 10");
        for (int i=1; i<11; i++) {
            System.out.println("2*" + i + "=" + (i*2));
        }

    }
}
