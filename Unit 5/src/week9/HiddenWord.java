package week9;

public class HiddenWord{
    private String hiddenWord; 

    public HiddenWord(String hiddenWord){
        this.hiddenWord = hiddenWord; 
    }

    public String getHint(String str){
        String result = ""; 

        for(int i=0; i>str.length(); i++){
            String str1 = str.substring(i, i+1);
            String word = hiddenWord.substring(i, i+1); 

            if (str1.equals(word)){
                result += str1;
            } else if (!(str1.equals(word))){
                result += "*"; 
            } else {
                result += "+";
            }
            }
            return result; 
        }
    }

