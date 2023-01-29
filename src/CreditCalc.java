public class CreditCalc {
    public static void main(String[] args) {
        int summa = 1_000_000;
        double percent = 9.99;
        int periodInMonth = 12;

        CreditPaymentService service = new CreditPaymentService();
        //случай для 1 года
        int payment = service.calculate(summa, periodInMonth, percent);
        System.out.println();
        System.out.println("Сумма кредита: " + summa + " руб.");
        System.out.println("Период кредитования (в мес): " + periodInMonth);
        System.out.println("Процент по кредиту: " + percent + "%");
        System.out.println("Ежемесячный платеж в руб: " + payment + " руб.");

        System.out.println();
        System.out.println();

        //случай для 2 лет
        periodInMonth = 24;
        payment = service.calculate(summa, periodInMonth, percent);
        System.out.println("Сумма кредита: " + summa + " руб.");
        System.out.println("Период кредитования (в мес): " + periodInMonth);
        System.out.println("Процент по кредиту: " + percent + "%");
        System.out.println("Ежемесячный платеж в руб: " + payment + " руб.");

        System.out.println();
        System.out.println();

        //случай для 3 лет
        periodInMonth = 36;
        payment = service.calculate(summa, periodInMonth, percent);
        System.out.println("Сумма кредита: " + summa + " руб.");
        System.out.println("Период кредитования (в мес): " + periodInMonth);
        System.out.println("Процент по кредиту: " + percent + "%");
        System.out.println("Ежемесячный платеж в руб: " + payment + " руб.");

        System.out.println();
        System.out.println();

        //случай для 3 лет, сумма 2 млн, процент 7%
        periodInMonth = 36;
        summa = 2000000;
        percent = 7;
        payment = service.calculate(summa, periodInMonth, percent);
        System.out.println("Сумма кредита: " + summa + " руб.");
        System.out.println("Период кредитования (в мес): " + periodInMonth);
        System.out.println("Процент по кредиту: " + percent + "%");
        System.out.println("Ежемесячный платеж в руб: " + payment + " руб.");
        int addSumma = payment * periodInMonth - summa;
        System.out.println("Сумма переплаты: " + addSumma + " руб.");
        double effPercent = (addSumma * 100 / summa);
        System.out.println("Эффективная % ставка: " + effPercent + "%");
    }
}
