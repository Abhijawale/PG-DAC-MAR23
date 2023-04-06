class Solution{
    public static void main(String args[]){
        //The number of bits used to represent a char value 
        char a = Character.SIZE;
        System.out.println("The number of bits used to represent a char value: "+(int)a);

        //The number of bytes used to represent a char value
        char b = Character.BYTES;
        System.out.println("The number of bytes used to represent a char value: "+(int)b);

        //The minimum value a char
        char min = Character.MIN_VALUE;
        System.out.println("The minimum value of char: "+(int)min);

        //The maximum value a char
        char max = Character.MAX_VALUE;
        System.out.println("The maximum value a char: "+(int)max);

    }
}
// javac Solution.java

// java Solution
// The number of bits used to represent a char value: 16
// The number of bytes used to represent a char value: 2
// The minimum value of char: 0
// The maximum value a char: 65535