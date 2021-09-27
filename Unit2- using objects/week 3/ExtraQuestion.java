public class ExtraQuestion {

    public static void main(String[] args) {
        questionOne(); 
        questionTwo(); 
        System.out.println(questionThree());
        System.out.println(questionFour(2,8));

        
    }

    /*Obtains and displays an integer between 1 and 100
    */
   public static void questionOne() {
       int num = (int)(Math.random()*100) + 1; // (int)(Math.random()*numPossibilities)+start; 
       
       System.out.println(num); 
   }
   
   /*Obtains and displays an integer between -50 and 50.
   */
   public static void questionTwo() { 
       int num1 = (int)(Math.random()*101) + -50; 

       System.out.println(num1); 
   }
   
   /*Simulate the roll of a die by obtaining and returning an integer from 1 to 6.
   */
    public static int questionThree() {
        int num3 = (int)(Math.random()*6)+1;

        return num3;
    }

    /*Create a function that accepts 2 ints (smaller and bigger) and return a 
    *random integer between those two numbers inclusive.
    */
     public static int questionFour(int lowest, int highest) {
         int num4 = (int)(Math.random()*(highest - lowest+1))+lowest;

         return num4;
     }

     
}
