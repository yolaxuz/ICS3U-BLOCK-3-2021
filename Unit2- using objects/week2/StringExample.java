package week2;
public class StringExample {
    
    public static void main(String[] args) {
        String s1 = "This is a String LIteral";
        String s2 = "This is a String Literal";
        String s3 = new String ("This is a String LIteral"); // it is not a String literal but a string object 

        System.out.println(s1.length());

        System.out.println(s1.equals(s2));

        System.out.println(s1.indexOF("in"));

        System.out.println(s1.indexOF("ins")); // returns -1 if not there 

        String s4 = "0123456789";
        System.out.println(s4.subtring(3));
        System.out.println(s4.subtring(3, 7));
    }
}
