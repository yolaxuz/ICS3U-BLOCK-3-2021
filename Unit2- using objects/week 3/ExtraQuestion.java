public class ExtraQuestion {

    public static void main(String[] args) {
        questionOne(); 
        questionTwo(); 
        System.out.println(questionThree());
        System.out.println(questionFour(2,8));
        String str = questionFive("This is a Sentence.");
        System.out.println(str);
        str = questionSix("This is a Sentecne.", "ent");
        System.out.println(questionSeven("one", "two"));

        
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

     /*Create a function that accepts a String and returns a substring with the first "e" removed
     */
     public static String questionFive(String string) { 
         int index = string.indexOf("e");

         String first = string.substring(0, index);

         String last = string.substring(index + 1); 

         return first + last; 
     }
     
     /* Create a function that accepts a String and a substring and then 
     *returns a String with the second string removed from the first String. 
     */
     public static String questionSix(String str, String substr) {
         int index = str.indexOf(substr);
         String first1 = str.substring(0, index);
         String last = str.substring(index + str.length());

         return first1 + last; 
     }
    /*Create a function that accepts two Strings and returns the length of the two strings
    *added together.
    */
    public static int questionSeven(String str, String substr) {
        return str.length() + substr.length(); 
    }


    
     }




