public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int credit = 1_000_000;
        double interestRate = 9.99;
        long payment1 = service.calculate(credit, 12, interestRate);
        long payment2 = service.calculate(credit, 24, interestRate);
        long payment3 = service.calculate(credit, 36, interestRate);
        System.out.println(payment1);
        System.out.println(payment2);
        System.out.println(payment3);
    }
}
