/*import java.util.Scanner;

public class HangMan {
    public static void main(String[] args) {
        boolean playAgain = true; 
        Scanner in = new Scanner(System.in); 

        while (playAgain) {
            play("READY TO USE SURFACE CLEANER", in);
        }
    }

    // _ _ _ _ _ / _ _ / _ _ _ / _ _ _ _ _ _ _ / _ _ _ _ _ _ _ 
    private static void play(String string, Scanner in) {
        String usedLetters = "";
        String encryptedHInt = encryptHint(hint, usedLetters); 
    }
    /*
    private static String encryptHInt(String hint, String usedLEtters){
        String result = ""; 

       / for (int i = 0; i < hint.length(); i++){
            String letter = hint.substring(i, i+1); 
            //if (usedLetters.indexOf(letter)<0){
                result += "_"; 
            } else {
                result += letter; 
            }
        }

        return result; 
    }
    */