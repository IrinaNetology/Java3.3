public class CreditPaymentService {
    public int calculate(int period, int amount) {
        double yearPercent = 9.99;
        double monthPercent = yearPercent / 12 / 100;

        double a = Math.pow(1 + monthPercent, period);

        double result = amount * (monthPercent + (monthPercent / (a - 1)));

        return (int) result;
    }
}
