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
         System.out.println();

         System.out.println("Задача 5б");
         int ChampagnePrice = 2870;
         int ChampagneCount = 7;
         int DiscountChampagne = 50;
         int BreadPrice = 27;
         int BreadCount = 1;
         double TotalSum_b = ((ChampagneCount*ChampagnePrice)*(DiscountChampagne/100f)) + (BreadCount* BreadPrice);
        System.out.printf( "Сумма покупки: "+ "%.1f",TotalSum_b);
        System.out.println();
        System.out.println();

        System.out.println("Задача 5в");
        double ChampignonsPrice = 436.0;
        double ChampignonsWeight = 2.5;
        double PorciniPrice = 578.0;
        double PorciniWeight = 3.75;
        double PorciniDiscount = 5.0;

        double PorciniSumDiscount = ( (PorciniPrice * PorciniWeight) /100) * (100 - PorciniDiscount);
        double TotalSum_v = PorciniSumDiscount + (ChampignonsPrice*ChampignonsWeight);

        System.out.println("Сумма покупки: "+ TotalSum_v);
        System.out.println();

    }
    public static void task6 () {
        System.out.println("Задача 6");
         double x = 0.40;
         double y = 0.87;
        System.out.printf( "%.2f",11*x +y);
        System.out.println();
        System.out.printf( "%.2f",(x+10*y)- 15*(x/y));


    }
}
