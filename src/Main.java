public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 2");

        System.out.println("Задание 1");
        int parrot = 96775;
        System.out.println("Значение переменное parrot с типом int равно " + parrot);
        byte car = 36;
        System.out.println("Значение переменное car с типом byte равно " + car);
        short leatherGloves = 25080;
        System.out.println("Значение переменное leatherGloves с типом short равно " + leatherGloves);
        long brick = 75434223;
        System.out.println("Значение переменное brick с типом long равно " + brick);
        float dust = 25.58f;
        System.out.println("Значение переменное dust с типом float равно " + dust);
        double stones = 55.347;
        System.out.println("Значение переменное stones с типом double равно " + stones);

        System.out.println("Задание 2");
        float a = 27.12f;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        double c = 2.786;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short e = -159;
        System.out.println(e);
        int f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);

        System.out.println("Задание 3");
        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        short paper = 480;
        short paperForStudent = (short) (paper / (lp + as + ea));
        System.out.println("На каждого ученика рассчитано " + paperForStudent + " листов бумаги");

        System.out.println("Задание 4");
        byte performanceIn2Minutes = 16;
        byte performance = (byte) (performanceIn2Minutes / 2);
        byte min20 = 20;
        short perfMin20 = (short) (performance * min20);
        byte day1 = 24;
        short perfDay1 = (short) ((performance * 60) * day1);
        byte day3 = 3;
        int perfDays3 = (perfDay1 * day3);
        byte month = 1;
        int perfMonth = (perfDay1 * 30);
        System.out.println("За " + min20 + " минут машина произвела " + perfMin20 + " штук бутылок");
        System.out.println("За " + day1 + " часа машина произвела " + perfDay1 + " штук бутылок");
        System.out.println("За " + day3 + " дня машина произвела " + perfDays3 + " штук бутылок");
        System.out.println("За " + month + " месяц машина произвела " + perfMonth + " штук бутылок");

        System.out.println("Задание 5");
        byte totalPaint = 120;
        byte white = 2;
        byte brown = 4;
        byte totalClass = (byte) (totalPaint / (white + brown));
        byte totalWhite = (byte) (totalClass * white);
        byte totalBrown = (byte) (totalClass * brown);
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски" );

        System.out.println("Задание 6");
        short banana = 5 * 80;
        short milk = 200 / 100 * 105;
        short iceCream = 2 * 100;
        short eggs = 4 * 70;
        short totalWeight = (short) (banana + milk + iceCream + eggs);
        System.out.println("Общий вес " + totalWeight + " грамм");
        float totalWeight1 = (totalWeight / 1000f);
        System.out.println("Общий вес " + totalWeight1 + " килограмм");

        System.out.println("Задание 7");
        byte loseWeight = 7;
        float firstLoss = (float) 250 / 1000;
        float secondLoss = (float) 500 / 1000;
        float dayOne = (loseWeight * firstLoss);
        float dayTwo = (loseWeight * secondLoss);
        float optimalDays = (dayOne + dayTwo) / 2 ;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то ему понадобится " + dayOne + " дней");
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм, то ему понадобится " + dayTwo + " дней");
        System.out.println("В среднем спотсмену понадобится " + optimalDays + " дней");

        System.out.println("Задание 8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int mashaYear = masha * 12;
        int denisYear = denis * 12;
        int kristinaYear = kristina * 12;
        float mashaIncreasedSalary = (float) (mashaYear * 1.1);
        float denisIncreasedSalary = (float) (denisYear * 1.1);
        float kristinaIncreasedSalary = (float) (kristinaYear * 1.1);
        float mashaA = mashaIncreasedSalary - mashaYear;
        float denisA = denisIncreasedSalary - denisYear;
        float kristinaA = kristinaIncreasedSalary - kristinaYear;
        System.out.println("Маша теперь получает " + mashaIncreasedSalary + " рублей. Годовой доход вырос на " + mashaA + " рублей");
        System.out.println("Денис теперь получает " + denisIncreasedSalary + " рублей. Годовой доход вырос на " + denisA + " рублей");
        System.out.println("Кристина теперь получает " + kristinaIncreasedSalary + " рублей. Годовой доход вырос на " + kristinaA + " рублей");
    }
}