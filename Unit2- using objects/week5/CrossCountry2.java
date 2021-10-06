   import java.util.Scanner;

public class CrossCountry2 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      processRunner(in);
      processRunner(in);
      processRunner(in);
      in.close();
   }

   /**
    * 
    * @param in
    */
   private static void processRunner(Scanner in) {
      String firstName, lastName;
      String mileOne, mileTwo, finishTime;
      String splitTwo, splitThree;

      /**
       * get the name and mleOne, mileTwo, finishTime from the user
       */

      System.out.print("Enter your first name: "); 
      firstName = in.nextLine(); 
      System.out.print("Enter your last name: "); 
      lastName = in.nextLine(); 
      System.out.print("Enter your first mile: ");
      mileOne = in.nextLine(); 
      System.out.print("Enter your second mile: "); 
      mileTwo = in.nextLine(); 
      System.out.print("Enter your time finished: "); 
      finishTime = in.nextLine(); 

      splitTwo = subtractTimes(mileTwo, mileOne);
      splitThree = subtractTimes(finishTime, mileTwo);

      /**
       * Display a summary for the runner
       */

       System.out.println(firstName + lastName); 
       System.out.println("Split One: " + mileOne); 
       System.out.println("Split Two: " + splitTwo); 
       System.out.println("Split Three: "+ splitThree); 

   }

   private static String subtractTimes(String endTime, String startTime) {
      double endInSeconds = convertToSeconds(endTime);
      double startInSeconds = convertToSeconds(startTime);

      double diffInSeconds = endInSeconds - startInSeconds;

      return convertToTime(diffInSeconds);
   }

   private static String convertToTime(double diffInSeconds) {
        // return String.format("%d:%06.3f", minutes, seconds1);
        return String.format("%d:%06.3f", getMinutes(diffInSeconds), getSeconds(diffInSeconds));
      // create getMinutes and getSeconds functions to use
   }
   public static int getMinutes(double totalSecond){ 
       int min = (int)(totalSecond/60); 
        return min; 
   }

   public static double getSeconds(double totalSecond) {
       double sec = (totalSecond%60); 
       return sec; 
   }

   private static double convertToSeconds(String time) {
       int getColon = time.indexOf(":"); 
       double min = Double.valueOf(time.substring(0, getColon)); 
       double sec = Double.valueOf(time.substring(0, getColon));
       return (min * 60) + sec;
   }
    
}
