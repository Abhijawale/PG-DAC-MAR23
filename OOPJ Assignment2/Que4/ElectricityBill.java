class ElectricityBill {

    private String customerName;
    private double unitsConsumed;
    private double billAmount;
    
    public ElectricityBill(String customerName, double unitsConsumed) {
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
    }
    
    public void calculateBillAmount() {
        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 5;
        } else if (unitsConsumed <= 300) {
            billAmount = 100 * 5 + (unitsConsumed - 100) * 7;
        } else {
            billAmount = 100 * 5 + 200 * 7 + (unitsConsumed - 300) * 10;
        }
    }
    
    public static void main(String[] args) {
        ElectricityBill bill = new ElectricityBill("Abhi Jawale", 250.5);
        bill.calculateBillAmount();
        System.out.println("Customer Name: " + bill.customerName);
        System.out.println("Units Consumed: " + bill.unitsConsumed);
        System.out.println("Bill Amount: Rs. " + bill.billAmount);
    }
}

// javac ElectricityBill.java

// java ElectricityBill
// Customer Name: Abhi Jawale
// Units Consumed: 250.5
// Bill Amount: Rs. 1553.5

