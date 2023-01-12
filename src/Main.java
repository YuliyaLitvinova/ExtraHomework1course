public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int a = 47;
        int b = 13;
        var d = a % b;
        int c = a / b;
        System.out.println("47/13 = " + c + " и " +d +" в остатке");

    }

    public static void task2 () {
        System.out.println("Задача 2");
        var a = 13;
        int b = a/10;
        int c = a%10;
        int d = b+c;
        System.out.println( " Сумма чисел двузначного числа " + a + " равна " + d );

    }
    public static void task3 () {
        System.out.println("Задача 3");
       var a = 123;
       int b = a/100;
       int с = a/10;
       int d = с%10;
       int e = a % 10;
       int f = b+d+e;
        System.out.println( " Сумма чисел трехзначного числа " + a + " равна " + f );
    }
    public static void task4 () {
        System.out.println("Задача 4");
        // Пишем код для задачи 2
    }
    public static void task5 () {
        System.out.println("Задача 5");
         // Пишем код для задачи 2
    }
    public static void task6 () {
        System.out.println("Задача 6");
         // Пишем код для задачи 2
    }
}
