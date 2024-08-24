public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 2");

        {
            System.out.println("Задание 1");
            int i = 6;
            byte b = 15;
            short s = 36;
            long l = 54_342_234_567_657L;
            float f = 5.5f;
            double d = 4.347345912378389;

            System.out.println("Значение переменной i с типом int равно " + i);
            System.out.println("Значение переменной b с типом byte равно " + b);
            System.out.println("Значение переменной s с типом short равно " + s);
            System.out.println("Значение переменной l с типом long равно " + l);
            System.out.println("Значение переменной f с типом float равно " + f);
            System.out.println("Значение переменной d с типом double равно " + d);

        }


        {
            System.out.println("Задание 2");
            float f = 27.12f;
            long l = 987_678_965_549L;
            double d = 2.786;
            short s = 569;
            int i = -159;
            int i1 = 27897;
            byte b = 67;
            System.out.println(f);
            System.out.println(l);
            System.out.println(d);
            System.out.println(s);
            System.out.println(i);
            System.out.println(i1);
            System.out.println(b);
        }


        System.out.println("Задание 3");
        int luda = 23;
        int anna = 27;
        int katya = 30;
        int paper = 480;
        int paperForStudent = paper / (luda + anna + katya);
        System.out.println("На каждого ученика рассчитано " + paperForStudent + " листов бумаги");


        System.out.println("Задание 4");
        int performance = 16 / 2;
        int perf20Min = performance * 20;
        int perf1Day = (performance * 60) * 24;
        int perf3Days = (perf1Day * 3);
        int perf30Days = (perf1Day * 30);
        System.out.println("За 20 минут машина произвела " + perf20Min + " штук бутылок");
        System.out.println("За 24 часа машина произвела " + perf1Day + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + perf3Days + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + perf30Days + " штук бутылок");

        System.out.println("Задание 5");
        int totalPaint = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;
        int totalClass =  totalPaint / (whiteCansPerClass + brownCansPerClass);
        int totalWhite = totalClass * whiteCansPerClass;
        int totalBrown = totalClass * brownCansPerClass;
        System.out.println("В школе, где " + totalClass + " классов, нужно " +
                totalWhite + " банок белой краски" +
                "и " + totalBrown + " банок коричневой краски" );

        System.out.println("Задание 6");
        int banana = 5 * 80;
        double milk = 200 * 1.05;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        double totalWeight = banana + milk + iceCream + eggs;
        System.out.println("Общий вес " + totalWeight + " гр");
        double totalWeight1 = (totalWeight / 1000);
        System.out.println("Общий вес " + totalWeight1 + " кг");

        System.out.println("Задание 7");
        int loseWeight = 7 * 1000;
        int firstLoss = 250;
        int secondLoss = 500;
        int dayOne = loseWeight / firstLoss;
        int dayTwo = loseWeight / secondLoss;
        int optimalDays = (dayOne + dayTwo) / 2;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то ему понадобится " + dayOne + " дней");
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм, то ему понадобится " + dayTwo + " дней");
        System.out.println("В среднем спотсмену понадобится " + optimalDays + " день");

        System.out.println("Задание 8");
        int masha = 67_760;
        int denis = 83_690;
        int kristina = 76_230;

        int mashaYear = masha * 12;
        int denisYear = denis * 12;
        int kristinaYear = kristina * 12;

        double mashaIncreased = masha * 1.1;
        double denisIncreased = denis * 1.1;
        double kristinaIncreased = kristina * 1.1;

        double mashaA = mashaIncreased * 12;
        double denisA = denisIncreased * 12;
        double kristinaA = kristinaIncreased * 12;
        System.out.println("Маша теперь получает " +
                mashaIncreased + " рублей. Годовой доход вырос на "
                + (mashaA - mashaYear) + " рублей");
        System.out.println("Денис теперь получает " +
                denisIncreased + " рублей. Годовой доход вырос на "
                + (denisA - denisYear) + " рублей");
        System.out.println("Кристина теперь получает " +
                kristinaIncreased + " рублей. Годовой доход вырос на "
                + (kristinaA - kristinaYear) + " рублей");
    }
}