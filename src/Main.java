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
        System.out.println();
        System.out.println("Задача 1");
        int a = 47;
        int b = 13;
        var d = a % b;
        int c = a / b;
        System.out.println("47/13 = " + c + " и " +d +" в остатке");
        System.out.println();

    }

    public static void task2 () {
        System.out.println("Задача 2");
        var a = 13;
        int b = a/10;
        int c = a%10;
        int d = b+c;
        System.out.println( " Сумма чисел двузначного числа " + a + " равна " + d );
        System.out.println();

    }
    public static void task3 () {
        System.out.println("Задача 3");
       var a = 345;
       int b = a/100;
       int c = a/10;
       int d = c%10;
       int e = a % 10;
       int f = b+d+e;
        System.out.println( " Сумма чисел трехзначного числа " + a + " равна " + f );
        System.out.println();
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int BouquetPrice = 4899;
        int CardPrice = 157;
        int discount = 10;

        double TotalPrice = BouquetPrice + CardPrice;
        double DiscountPrice = TotalPrice *(discount /100f) ;
        double DiscountSum = TotalPrice - DiscountPrice;


        System.out.println("Общая сумме покупки без скидки = " + Math.round(TotalPrice));
        System.out.println("Сумма покупки со скидкой  = " + Math.round(DiscountPrice));
        System.out.println( "Сумма скидки = " + Math.round(DiscountSum));
        System.out.println();
    }
    public static void task5 () {
        System.out.println("Задача 5a");
         int OrangePrice = 73;
         int OrangeWeight = 10;
         int OrangeDiscount = 15;
         int BananaPrice = 95;
         int BananaWeight = 2;

         double OrangeSum = (OrangePrice * OrangeWeight) * (OrangeDiscount/100f);
         double TotalSum = (BananaWeight* BananaPrice) + OrangeSum;
         System.out.printf( "Сумма покупки: "+ "%.1f",TotalSum);
        System.out.println();
        System.out.println("Задача 5b");
    }
    public static void task6 () {
        System.out.println("Задача 6");
         // Пишем код для задачи 2
    }
}
