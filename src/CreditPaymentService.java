public class CreditPaymentService {
    public int calculate (int period , int amount)
    {
        double year_percent = 9.99;
        double month_percent = year_percent / 12 / 100;

        double a = Math.pow( 1+month_percent , period);

        double result = amount * (month_percent + (month_percent / (a - 1)));

        return (int) result;
    }
}
