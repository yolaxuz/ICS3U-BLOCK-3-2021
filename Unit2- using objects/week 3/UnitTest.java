public class UnitTest {

    public static void main(String[] args) {
        System.out.println(threeCopies("Happy",1));
        System.out.println(threeCopies("Computer", 3)); 
        System.out.println(removeChars("happy", 1, 2));
        //System.out.println(sqrt.Sum(9999)); 

    }

    /**
     * Write a function that accepts a string and an int that represents an index. Obtain 2 characters 
     * at that indext and return 3 copies of that string. 
     */
    public static String threeCopies(String str, int index) {
        String s = str.substring(index, index + 2); // gets 2 characters starting at index 
        return s + s + s;

    }

    public static String removeChars(String str, int index, int n) {
        String front = str.substring(0, index);
        String last = str.substring(index + n); 

        return front + last; 
    }

    public static double sqrtSum(int number) {
        int n1 = number / 1000;     // ex 6384 / 1000 = 6 
        int n2 = number / 100 % 10;   // 6384 / 100 = 63 % 10 = 3
        int n3 = number / 10 % 10; //6384 / 10 = 638 % 10 = 8 
        int n4 = number % 10; // 6385 % 10 = 4

        int sum = n1 +n2 + n3 +n4;
        return Math.sqrt(sum); 
    }
}
