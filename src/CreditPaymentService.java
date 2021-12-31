public class CreditPaymentService {
    public long calculate(int credit, int period, double interestRate) {
        double index = interestRate / 12 / 100;
        long payment = (long) (credit * ((index * Math.pow(1+index, period))/(Math.pow(1+index, period) - 1)));
        return payment;
    }
}