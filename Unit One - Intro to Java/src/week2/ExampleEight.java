package week2; 

/**
 * Type Casting
 */

public class ExampleEight {

    public static void main(String[] args) {

        final int NUM_MARKS = 5;

        int markOne = 78, markTwo = 98, markThree = 64, markFour = 96, markFive = 62; 

        double average = (double)(markOne+markTwo+markThree+markFour+markFive) / NUM_MARKS;

        System.out.println("The average is: " + average);

        int x = (int)3.2;  // narroring converstion (lossing precision) // becomes 3 - truncates the decimal 

        double y = (double) 3; 
        double z = 3; 
        
    }
    
}
