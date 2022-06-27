public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double month1 = 12;
        double month2 = 24;
        double month3 = 36;
        double interestRate = 9.99;
        double creditAmount = 1_000_000;
        double myPayment1 = service.calculate(month1, creditAmount, interestRate);
        double myPayment2 = service.calculate(month2, creditAmount, interestRate);
        double myPayment3 = service.calculate(month3, creditAmount, interestRate);
        int payment1 = (int) myPayment1;
        int payment2 = (int) myPayment2;
        int payment3 = (int) myPayment3;
        System.out.println(payment1);
        System.out.println(payment2);
        System.out.println(payment3);
    }
}

