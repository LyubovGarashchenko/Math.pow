public class CreditPaymentService {
    public int calculate(int credit, double procent, int mounths) {
        double i = procent / 100 / 12; // ежемесячная процентная ставка
        double annuity = credit * (i + i / (Math.pow(1 + i, mounths) - 1));
        return (int) annuity;
    }
}