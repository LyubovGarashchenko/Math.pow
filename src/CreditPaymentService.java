public class CreditPaymentService {
    public int calculate(int credit, double procent, int mounths) {
        double monthlyInterestRate = procent / 100 / 12; // ежемесячная процентная ставка
        double annuity = credit * (monthlyInterestRate + monthlyInterestRate / (Math.pow(1 + monthlyInterestRate, mounths) - 1));
        return (int) annuity;
    }
}