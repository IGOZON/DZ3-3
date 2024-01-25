public class CreditPaymentService {

    public double calculate(int loanAmount, int term, double rate) {
        double monthlyRate = rate / 12 / 100;
        double paymentAmount = loanAmount * ((monthlyRate * Math.pow((1 + monthlyRate), term * 12)) / (Math.pow((1 + monthlyRate), term * 12) - 1));
                return (int) paymentAmount;


    }
}



