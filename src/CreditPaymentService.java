public class CreditPaymentService {
    public int calculate(int sum, int month, double percent) {
        double coef = 1; //коэффициент для подсчета аннуитетных платежей
        //далее расчет коэффицента (1 + процент за месяц) в степени месяца
        for (int m = 1; m <= month; m++) {
            coef = coef * (1200 + percent) / 1200;
        }
        // формула аннуитетных платежей
        // = сумма sum * процент за месяц (percent в единицах/ 12 месяцев) *
        // (1 + процент за месяц) в степени кол-ва месяцев - это coef / на
        // (1 + процент за месяц) в степени месяца минус 1
        int result = (int) (sum * percent * (coef / (coef - 1)) / 1200);
        return result;
    }
}
