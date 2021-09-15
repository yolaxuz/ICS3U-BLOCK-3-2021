package week2;


/**
 * Question 1. 
 * Write a program that takes a decimal number then displays the number and the 
 * square to the console in a presentable way. 
 */


public class HW1 {

    public static void main(String[] args) {
        double number = 7.3;

        double numSqrd = number + number;

        System.out.println(number + "+" + number + "=" + numSqrd); 
/**
 * Question 2
 * Create a program that obtains two integers, one for the amount a test is out of and
 * another indicating what a student received. Display what percentage the student received
 * on the test.
 */

 int numOutof = 100;
 int numScore = 85; 

 double numAverage =  ((double)numScore / numOutof)*100;

 System.out.println(numAverage + "%"); 

 /**
  * Question 3
  * Write a program that uses a five digit number and calculates the product 
  * of the 2nd and 4th digit. Use the modulus and division operators.
  */

  int num = 35748;

  int num2 = num / 1000 % 10;
  int num4 = (num/10)%10;


  /**
   * Question 4
   * Create a program that can be used to calculate the final velocity of a car 
   * given the initial velocity, the acceleration of the car and the time that has 
   * elapsed using the following equation: v_f= v_i+at
   */

   double vi = 6.5;
   double at = 8;

   double vf =vi+at; 

   System.out.println(vf+"is the final velocity");

/**
 * Question 5
 * Write program that can calculate the area of circle. You will need to create 
 * variables for the radius and the area.
 */

 final double numPI = 3.14159;  
 int radius = 5;

 double circleArea = (double) numPI * radius * radius;

 System.out.println(circleArea);

 /**
  * Question 6
  * Write a program that can calculate the volume of a sphere
  */

  final double numPI2 = 3.14159;
  double radius2 = 3;

  double volume =(double) 4/3*(double)numPI2*(double)radius2*(double)radius2*(double)radius2;

  System.out.println(volume);


  /**
   * Question 7 
   * Create a program that can solve the equation y = ax2+bx+c given a, b, c and x.
   */

   int x = 4;
   int a = 2;
   int b = 7;
   int c = 6;

   int y = ((a*x*2) + (b*x) + c);

   System.out.println(y);

   /**
    * Question 8
    * Write a program to calculate the slope of a line give (x1, y1) and (x2,y2).
    */

    int x1 = 3;
    int y1 = 4;

    int x2 = 7;
    int y2 = 2;
    double slope = (double)(y2-y1)/(x2-x1);

    System.out.println(slope);

   /**
    * Question 9 
    * Write a program that given the number of pennies, nickels, dimes, quarters, 
    * loonies and toonies calculates how much money the user has.
    */

    int x3=2;

    double pennies = 0.01*x3;
    double nickels = 0.05*x3;
    double dimes = 0.10*x3;
    double quarters = 0.25*x3;
    double loonies = 1.00*x3;
    double toonies = 2.00*x3;

    double total = (double) pennies + (double)nickels + (double)dimes + (double)quarters + (double)loonies + (double)+toonies;
    System.out.println(total+"$");

    /**
     * Question 10 
     * Math.sqrt(x), where x is a value can be used to calculate the square root. 
     * Given an equation in the format from question 7.  Obtain the two roots. Given a, b, and c.
     */

     int a1 = 2;
     int b2 = 7;
     int c3 = 6;
     int equation = (b2*b2) - 4 * a1 * c3;
     double root1 = (-b2 + Math.sqrt(equation)) / 2 *a1;
     double root2 = (+b2 + Math.sqrt(equation)) / 2 *a1;

     System.out.println(root1 + "or" + root2); 


    }




 }
    

