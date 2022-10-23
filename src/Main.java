public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println( service.calculate(12,1000000));

        System.out.println();
        System.out.println (service.calculate(24 , 1000000));

        System.out.println();
        System.out.println (service.calculate(36 , 1000000));

    }
}