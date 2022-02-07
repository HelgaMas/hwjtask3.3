public class CreditPaymentService {
    public double calculate(int creditAmount, int creditPeriod, double percentageRate) {
        double monthPercentageRate = percentageRate / 100 / 12; //ежемесячная процентная ставка
        double ratio = Math.pow(1 + monthPercentageRate, creditPeriod); //коэффициент для расчета
        double monthlyPayment = Math.round(creditAmount * (monthPercentageRate + (monthPercentageRate / (ratio - 1))));

        return monthlyPayment;
    }
}
