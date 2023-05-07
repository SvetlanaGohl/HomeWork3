public class Main {
    public static void main(String[] args) {
      //Задача 1
        byte cat = 3;
        System.out.println("Вес кошки " + cat + " кг ");

        short appleBox = 150;
        System.out.println("Вес коробки с яблоками " + appleBox + " кг ");

        int weightCar = 2500;
        System.out.println("Вес автомобиля " + weightCar + " кг ");

        long starSky = 200000000L;
        System.out.println("Количество звезд на небе, которое я насчитал сегодня " + starSky + " шт ");

        float flour = 4.5f;
        System.out.println("Точный вес упаковки с мукой " + flour + " кг ");

        double launcherMass = 1770.568923458;
        System.out.println("Стартовая масса пусковой ракеты составляет " + launcherMass + " кг ");


        //Задача 2
        double x = 27.12;
        long y = 987678965549L;
        float z = 2.786f;
        int a = 569;
        short b = -159;
        int c = 27897;
        byte d = 67;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d); //Можно ли вывести все переменные на консоль одной командой?


        //Задача 3
        byte teacherLudmilaPavlovna = 23;
        byte teacherAnnaSergeevna = 27;
        byte teacherEkaterinaAndreevna = 30;
        int sheetsPaper = 480;
        int studentsNumber = teacherLudmilaPavlovna + teacherAnnaSergeevna + teacherEkaterinaAndreevna;
        int sheetsNumber = sheetsPaper/studentsNumber;
        System.out.println("На каждого ученика расчитано " + sheetsNumber + " листов бумаги.");


        //Задача 4
        byte bottles = 16;
        byte minutes = 2;
        int capacityMachineInMinute = bottles/minutes;
        int capacity = 20;
        int totalBottles = capacity * capacityMachineInMinute;
        System.out.println("За " + capacity + " минут машина произвела " + totalBottles + " штук бутылок.");
        byte hours24 = 24;
        byte hour = 60;
        int minutesHour = hours24 * hour;
        int totalBottles1 = minutesHour * capacityMachineInMinute;
        System.out.println("За " + minutesHour + " минут машина произвела " + totalBottles1 + " штук бутылок.");
        byte day = 3;
        int minutesDay = day * hours24 * hour;
        int totalBottles2 = minutesDay * capacityMachineInMinute;
        System.out.println("За " + minutesDay + " минут машина произвела " + totalBottles2 + " штук бутылок.");
        byte mouth = 1;
        byte daysMouth = 28;
        int minutesMouth = mouth * daysMouth * minutesHour;
        int totalBottles3 = minutesMouth * capacityMachineInMinute;
        System.out.println("За " + minutesMouth + " минут машина произвела " + totalBottles3 + " штук бутылок (если в месяце 28 дней).");
        byte daysMouth1 = 30;
        int minutesMouth1 = mouth * daysMouth1 * minutesHour;
        int totalBottles4 = minutesMouth * capacityMachineInMinute;
        System.out.println("За " + minutesMouth1 + " минут машина произвела " + totalBottles4 + " штук бутылок (если в месяце 30 дней).");
        byte daysMouth2 = 31;
        int minutesMouth2 = mouth * daysMouth2 * minutesHour;
        int totalBottles5 = minutesMouth2 * capacityMachineInMinute;
        System.out.println("За " + minutesMouth2 + " минут машина произвела " + totalBottles5 + " штук бутылок (если в месяце 31 день).");


        //Задача 5
        byte paintCans = 120;
        byte canWight = 2;
        byte canBrown = 4;
        int classes = paintCans / (canWight + canBrown);
        int totalCansWight = classes * canWight;
        int totalCansBrown = classes * canBrown;
        System.out.println("В школе, где " + classes + " классов, нужно " + totalCansWight + " банок белой краски и " + totalCansBrown + " банок коричневой краски.");

        //Задача 6
        int banana = 5;
        int bananaGramme = 80;
        int totalWeightBananas = banana * bananaGramme;
        int milk = 200;
        int milkPortion = 100;
        int milkGramme = 105;
        int totalWeightMilk = milk/milkPortion*milkGramme;
        int iceCream = 2;
        int iceCreamGramme = 100;
        int totalWeightIceCream = iceCream*iceCreamGramme;
        int egg = 4;
        int eggGramme = 70;
        int totalWeightEgg = egg*eggGramme;
        int breakfastWeight = totalWeightBananas+totalWeightMilk+totalWeightIceCream+totalWeightEgg;
        System.out.println("Общий вес завтрака спортсмена составляет " + breakfastWeight + " грамм.");

        //Задача 7
        int loseWeight = 7;
        int oneKgGramme = 1000;
        int loseWeightGramme = loseWeight*oneKgGramme;
        int loseWeightDay1 = 250;
        int loseWeightDay2 = 500;
        int amountDays1 = loseWeightGramme/loseWeightDay1;
        System.out.println("Если спортсмен в день будет терять " + loseWeightDay1 + " грамм, то он потратит на это " + amountDays1 + " дней.");
        int amountDays2 = loseWeightGramme/loseWeightDay2;
        System.out.println("Если спортсмен в день будет терять " + loseWeightDay2 + " грамм, то он потратит на это " + amountDays2 + " дней.");
        int averageDays = (amountDays1+amountDays2)/2;
        System.out.println(averageDays + " день может потребоваться в среднем, чтобы добиться результата похудения.");

        //Задача 8
        int year = 12;
        long salaryMasha = 67766L;
        long salaryDenis = 83690L;
        long salaryKristina = 76230L;
        float raise = 0.1f;
        float raiseSalaryMasha = salaryMasha + salaryMasha*raise;
        float raiseSalaryDenis = salaryDenis + salaryDenis*raise;
        float raiseSalaryKristina = salaryKristina + salaryKristina*raise;
        long revenueMasha = salaryMasha*year;
        long revenueDenis = salaryDenis*year;
        long revenueKristina = salaryKristina*year;
        float raiseRevenueMasha = raiseSalaryMasha*year;
        float raiseRevenueDenis = raiseSalaryDenis*year;
        float raiseRevenueKristina = raiseSalaryKristina*year;
        float differenceRevenueMasha = raiseRevenueMasha-revenueMasha;
        float differenceRevenueDenis = raiseRevenueDenis-revenueDenis;
        float differenceRevenueKristina = raiseRevenueKristina-revenueKristina;
        System.out.println("Маша теперь получает " + raiseSalaryMasha + " рублей. Годовой доход вырос на " + differenceRevenueMasha + " рублей.");
        System.out.println("Денис теперь получает " + raiseSalaryDenis + " рублей. Годовой доход вырос на " + differenceRevenueDenis + " рублей.");
        System.out.println("Кристина теперь получает " + raiseSalaryKristina + " рублей. Годовой доход вырос на " + differenceRevenueKristina + " рублей.");

    }
}