public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        task1();
        System.out.println("Задача2");
        task2();
        System.out.println("Задача 3");
        task3();
        System.out.println("Задача 4");
        task4();
        System.out.println("Задача 5");
        task5();
        System.out.println("Задача 6");
        task6();
    }
    public static void task1() {
        int a = 232;
        byte b = 127;
        short c = -111;
        long d = 1234567890;
        float e = 1.333f;
        double f = 1.5;
        System.out.printf(" %d\n %d\n %d\n %d\n",a,b,c,d);
        System.out.printf(" %f\n %f\n", e, f);
    }
    public static void task2() {
        double first = 27.12;
        long second = 98712312365549L;
        float third = 2.7886f;
        boolean fourth = false;
        short fifth = 569;
        int sixth = 27897;
        int seventh = -159;
        byte eighth = 67;
        System.out.printf(" %d\n %d\n %d\n %d\n %d\n", second, fifth, sixth, seventh, eighth);
        System.out.printf(" %f\n %f\n", first, third);
        System.out.printf(" %b\n", fourth);
    }
    public static void task3() {
        int lyudmilaClass = 23;
        int annaClass = 27;
        int kateClass = 30;
        int commonAmount = lyudmilaClass + annaClass + kateClass;
        int papers = 480;
        int paperForPupils = papers / commonAmount;
        System.out.println("На каждого ученика рассчитано " + paperForPupils + " листов бумаги");

    }
    public static void task4() {
        int minute = 1;
        int hour = minute * 60;
        int day = hour * 24;
        int month = day * 31;
        int bottlesPerTwoMinutes = 16;
        int bottlesPerMinute = bottlesPerTwoMinutes / 2;
        int bottlesPerTwentyMinutes = bottlesPerMinute * 20;
        System.out.println("За 20 минут машина произвела бутылок " + bottlesPerTwentyMinutes + " штук ");
        int bottlesPerDay = bottlesPerMinute * hour * day;
        System.out.println("За сутки машина произвела бутылок " + bottlesPerDay + " штук ");
        int bottlesPerThreeDays = bottlesPerDay * 3;
        System.out.println("За 3 суток машина произвела бутылок " + bottlesPerThreeDays + " штук ");
        int bottlesPerMonth = bottlesPerDay * month;
        System.out.println("За месяц машина произвела бутылок " + bottlesPerMonth + " штук ");
    }
    public static void task5() {
        int commonAmountInkCan = 120;
        int whiteInkForClass = 2;
        int brownInkForClass = 4;
        int inkForClass = whiteInkForClass + brownInkForClass;
        int classAmount = commonAmountInkCan / inkForClass;
        int whiteInkAmount = whiteInkForClass * classAmount;
        int brownInkAmount = brownInkForClass * classAmount;
        System.out.println("В школе, где " + classAmount + " классов, нужно " + whiteInkAmount + " банок белой краски и " + brownInkAmount + " банок коричневой краски");
    }
    public static void task6() {
        int bananas = 5;
        int milk = 2;
        int iceCream = 2;
        int eggs = 4;
        int oneBananaWeight = 80;
        int oneMilkWeight = 105;
        int oneIceCreamWeight = 100;
        int oneEggWeight = 70;
        int bananasWeight = bananas * oneBananaWeight;
        int milkWeight = milk * oneMilkWeight;
        int iceCreamWeight = iceCream * oneIceCreamWeight;
        int eggsWeight = eggs * oneEggWeight;
        int commonWeight = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        System.out.println("Спорт-завтрак весит " + commonWeight + " грамм");
        double kg = 1000;
        double commonWeightKg = commonWeight / kg;
        System.out.println("Спорт-завтрак весит " + commonWeightKg + " килограмм");
    }
}