public class IfStatementExamples {

    public static void main(String[] args) {
        
        exampleOne(); 
        String letterGrade = getLetterGrade(87);
        exampleThree();  
    }
    private static void exampleThree() { 
        /* 
        == equals 
        > 
        <
        >=
        <= 
        !=   not equals
        ! not !(y>7) ==> y <=7 
        || or (x>7) || (y>7) either x or y is greater than 7 
        && and (x>7) && (y>7) x and y must be greater than 7
        */
    }

    private static String getLetterGrade(int mark) {
        if (mark>= 90) { 
            return "A+"; 
        } else if (mark >= 80) {
            return "A"; 
        } else if (mark >= 70) {
            return "B"; 
        } else if (mark >= 60) {
            return "C"; 
        } else if (mark >= 50) {
            return "D";
        } else {
            return "F"; 
        }
    }

    private static void exampleONe() {
        int x = 7; 

        // check if x is even 
        if(x%2==0) { // exectue what is in the brackets IF it is true 
            System.out.println(x + "is even."); 
        } else { // the previous condition was not true 
            System.out.println(x + "is odd.");
        }

        /*

        if(x%2==1) { // exectue what is in the brackets IF it is true 
            System.out.println(x + "is odd."); 
        }
        */
    }
    
}
