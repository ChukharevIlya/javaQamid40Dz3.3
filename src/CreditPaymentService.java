public class CreditPaymentService {
    public double calculate(double month, double creditAmount, double interestRate) {
        double monthInterestRate = interestRate / 100 / 12;
        double restMonth = Math.pow ((1 + monthInterestRate), month);
        double payment = creditAmount * (monthInterestRate + (monthInterestRate / (restMonth - 1)));
        return payment;
    }

}