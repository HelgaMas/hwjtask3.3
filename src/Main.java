public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        // расчет ежемесячного платежа при сроке кредита 12 месяцев
        double monthlyPayment = service.calculate(1000000, 12, 9.99);
        System.out.println("Ваш ежемесячный платеж составит: " + monthlyPayment + "₽");

        // расчет ежемесячного платежа при сроке кредита 24 месяца
        double monthlyPayment24 = service.calculate(1000000, 24, 9.99);
        System.out.println("Ваш ежемесячный платеж составит: " + monthlyPayment24 + "₽");

        // расчет ежемесячного платежа при сроке кредита 36 месяцев
        double monthlyPayment36 = service.calculate(1000000, 36, 9.99);
        System.out.println("Ваш ежемесячный платеж составит: " + monthlyPayment36 + "₽");
    }
}
