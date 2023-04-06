class ArgumentName {
     public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("Please enter your full name as a single argument.");
            return;
        }
        System.out.println("Your full name is: " + args[0]);
    }
}

// javac ArgumentName.java

// java ArgumentName "Abhijeet Jawale"
// Your full name is: Abhijeet Jawale

