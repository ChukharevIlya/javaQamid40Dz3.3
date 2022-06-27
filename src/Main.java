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
        System.out.println(myPayment1);
        System.out.println(myPayment2);
        System.out.println(myPayment3);
    }


}

