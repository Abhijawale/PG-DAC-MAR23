import java.util.Scanner;

class TelephoneBill {

   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       // Take input from the user
       System.out.print("Enter customer name: ");
       String name = sc.nextLine();

       System.out.print("Enter phone number: ");
       String phoneNumber = sc.nextLine();

       System.out.print("Enter number of calls made: ");
       int numCalls = sc.nextInt();

       System.out.print("Enter duration of calls (in minutes): ");
       int duration = sc.nextInt();

       // Calculate the bill
       double bill = 10.0; // flat rate of $10 per month
       int remainingCalls = numCalls - 100;

       if (remainingCalls > 0) {
           bill += 50.0 + (remainingCalls * 25.0); // First 100 calls at 50 cents per call and calls beyond that at 25 cents per call
       } else {
           bill += numCalls * 0.5; // All calls at 50 cents per call for the first 100 calls
       }

       if (duration < 1) {
           duration = 1; // Calls with a duration less than 1 minute are rounded up to 1 minute
       }

       bill += duration * 0.1; // All calls subject to a minimum duration of 1 minute at a rate of 10 cents per minute

       // Display the result
       System.out.println("Customer Name: " + name);
       System.out.println("Phone Number: " + phoneNumber);
       System.out.println("Number of Calls: " + numCalls);
       System.out.println("Duration of Calls: " + duration + " minutes");
       System.out.println("Bill Amount: $" + bill);
       sc.close();
   }
}

// javac TelephoneBill.java
// java TelephoneBill
// Enter customer name: Abhijeet Jawale
// Enter phone number: 8888762195
// Enter number of calls made: 96
// Enter duration of calls (in minutes): 500
// Customer Name: Abhijeet Jawale
// Phone Number: 8888762195
// Number of Calls: 96
// Duration of Calls: 500 minutes
// Bill Amount: $108.0