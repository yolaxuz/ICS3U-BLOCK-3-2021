public class RandomNumberExamples {
    


    public static void main(String[] args) {
        

        
        System.out.println(Math.random());  // [ 0.0, 0.99999999999]


        double r = Math.random(); 

        int lower = -5;
        int upper = 5;

        int rand = (int)(upper-lower+1) + lower; 
    }
}
