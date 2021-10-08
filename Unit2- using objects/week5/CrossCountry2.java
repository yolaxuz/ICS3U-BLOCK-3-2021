   import java.util.Scanner; // imports the java scanner 

public class CrossCountry2 {
   public static void main(String[] args) { // the main 
      Scanner in = new Scanner(System.in); // input 
      processRunner(in); // runs processRunner with the input 
      processRunner(in);// runs processRunner with the input 
      processRunner(in);// runs processRunner with the input 
      in.close(); // ends the input 
   }

   /**
    * 
    * @param in
    */
   private static void processRunner(Scanner in) {
      String firstName, lastName; // setting the first namd and last name as a string 
      String mileOne, mileTwo, finishTime; // setting the mile one mile two and finish time as a string
      String splitTwo, splitThree; // setting splittwo and split three as a string

      /**
       * get the name and mleOne, mileTwo, finishTime from the user
       */

      System.out.print("Enter your first name: "); // print "Enter your first name: "ask input for firstName
      firstName = in.nextLine(); // set the input as firstName
      System.out.print("Enter your last name: "); // print "Enter your last name: " ask input for lastName
      lastName = in.nextLine(); // set the input as lastName 
      System.out.print("Enter your first mile: "); // print "Enter your first mile: " ask input for mileOne
      mileOne = in.nextLine(); // set the input as mileOne
      System.out.print("Enter your second mile: "); // print "Enter your second mile: " ask input for mileTwo
      mileTwo = in.nextLine(); // set input as mileTwo 
      System.out.print("Enter your time finished: "); // print "Enter your time finished: " ask input for finishTime
      finishTime = in.nextLine(); // set input as finishTime 

      splitTwo = subtractTimes(mileTwo, mileOne); // set splitTwo to substractTIme 
      splitThree = subtractTimes(finishTime, mileTwo); // set splitThree to subtractTime 

      /**
       * Display a summary for the runner
       */

       System.out.println(firstName + " " + lastName); // display firstName and lastName and enter to next line
       System.out.println("Split One: " + mileOne); // display "Split One: " and mileOne and enter to next line
       System.out.println("Split Two: " + splitTwo); // display "Split Two: " and splitTwo and enter to next line
       System.out.println("Split Three: "+ splitThree); // display "Split Three: " and splitTHree and enter to next line

   }

   private static String subtractTimes(String endTime, String startTime) {
      double endInSeconds = convertToSeconds(endTime); // sets endInSeconds equal to convertToSeconds insert with endTime
      double startInSeconds = convertToSeconds(startTime); // sets startInSeconds to convertTOSeconds inert with startTime 

      double diffInSeconds = endInSeconds - startInSeconds; // set diffInSeconds as startInSeconds subtracted from endInSeconds 

      return convertToTime(diffInSeconds); // return converToTime and insert by diffInSeconds 
   }

   private static String convertToTime(double diffInSeconds) {
        // return String.format("%d:%06.3f", minutes, seconds1);
        return String.format("%d:%06.3f", getMinutes(diffInSeconds), getSeconds(diffInSeconds)); 
        // return the format of %d:%06.3f with minutes having the input of diffInseconds and seconds with theinput of diffInSeconds
      // create getMinutes and getSeconds functions to use
   }
   public static int getMinutes(double totalSecond){ 
       int min = (int)(totalSecond/60); // set min as the totalSecond divided by 60
        return min; // return min
   }

   public static double getSeconds(double totalSecond) {
       double sec = (totalSecond%60); // set sec as double and se it as totalSecond module by 60
       return sec; // return sec 
   }

   private static double convertToSeconds(String time) {
       int getColon = time.indexOf(":"); // set getColon as ":" 
       double min = Double.valueOf(time.substring(0, getColon)); // Setting min as a double and giving it as time and having a parameter from 0 to colon
       double sec = Double.valueOf(time.substring(0, getColon)); //Setting sec as a double and giving it as time  and having a parameter from 0 to colon
       return (min * 60) + sec; // returns mim into sec plus sec 
   }
    
}
