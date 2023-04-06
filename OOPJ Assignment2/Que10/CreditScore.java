import java.util.Scanner;

public class CreditScore {
    private int creditHistory;
    private double creditUtilization;
    private boolean paymentHistory;

    // Constructor
    public CreditScore(int creditHistory, double creditUtilization, boolean paymentHistory) {
        this.creditHistory = creditHistory;
        this.creditUtilization = creditUtilization;
        this.paymentHistory = paymentHistory;
    }

    // Getter and Setter methods
    public int getCreditHistory() {
        return creditHistory;
    }

    public void setCreditHistory(int creditHistory) {
        this.creditHistory = creditHistory;
    }

    public double getCreditUtilization() {
        return creditUtilization;
    }

    public void setCreditUtilization(double creditUtilization) {
        this.creditUtilization = creditUtilization;
    }

    public boolean hasGoodPaymentHistory() {
        return paymentHistory;
    }

    public void setPaymentHistory(boolean paymentHistory) {
        this.paymentHistory = paymentHistory;
    }

    // Method to calculate credit score
    public int calculateCreditScore() {
        int creditScore;
        if (paymentHistory) {
            creditScore = (creditHistory * 15) + (int)(creditUtilization * 30) + 55;
        } else {
            creditScore = (creditHistory * 15) + (int)(creditUtilization * 30) + 35;
        }
        return creditScore;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of your credit history (in years): ");
        int creditHistory = sc.nextInt();

        System.out.print("Enter the percentage of available credit you are using (e.g. 0.5 for 50%): ");
        double creditUtilization = sc.nextDouble();

        System.out.print("Do you have a good payment history? (true/false): ");
        boolean paymentHistory = sc.nextBoolean();

        CreditScore calculator = new CreditScore(creditHistory, creditUtilization, paymentHistory);
        int creditScore = calculator.calculateCreditScore();

        System.out.println("Your credit score is: " + creditScore);
        sc.close();
    }
}
