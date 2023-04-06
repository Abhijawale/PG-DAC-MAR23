import java.util.Scanner;

class TollBoothBill {
    private String vehicleType;
    private int numAxles;
    private double distanceTraveled;
    private double tollFee;
    private double totalAmountDue;

    public void calculateTollFee() {
        double baseRate;
        if (vehicleType.equalsIgnoreCase("car") || vehicleType.equalsIgnoreCase("van") || vehicleType.equalsIgnoreCase("bus")) {
            baseRate = 0.25;
        } else if (vehicleType.equalsIgnoreCase("truck")) {
            baseRate = 0.5;
        } else {
            System.out.println("Invalid vehicle type!");
            return;
        }
        tollFee = baseRate * numAxles * distanceTraveled;
    }

    public void generateBill() {
        totalAmountDue = tollFee + 2.00;
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Number of Axles: " + numAxles);
        System.out.println("Distance Traveled: " + distanceTraveled + " miles");
        System.out.println("Toll Fee: $" + String.format("%.2f", tollFee));
        System.out.println("Total Amount Due: $" + String.format("%.2f", totalAmountDue));
    }

    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please select an option:");
            System.out.println("1. Enter vehicle type (car, van, bus, or truck)");
            System.out.println("2. Enter number of axles");
            System.out.println("3. Enter distance traveled");
            System.out.println("4. Calculate toll fee");
            System.out.println("5. Generate bill");
            System.out.println("6. Exit");

            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter vehicle type:");
                    vehicleType = sc.next();
                    break;
                case 2:
                    System.out.println("Enter number of axles:");
                    numAxles = sc.nextInt();
                    break;
                case 3:
                    System.out.println("Enter distance traveled (in miles):");
                    distanceTraveled = sc.nextDouble();                    
                    break;
                case 4:
                    calculateTollFee();
                    System.out.println("Toll fee calculated!");
                    break;
                case 5:
                    if (tollFee == 0) {
                        System.out.println("Please calculate toll fee first!");
                    } else {
                        generateBill();
                    }
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid option! Please try again.");
            } sc.close();
        }
    }

    public static void main(String[] args) {
        TollBoothBill tollBooth = new TollBoothBill();
        tollBooth.showMenu();
    }
   
}
