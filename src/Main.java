public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int credit = 1_000_000;
        double procent = 9.99;
        int mounths = 12;
        double annuity =  service.calculate(1_000_000, 9.99,36);
        System.out.println(annuity);
    }
}