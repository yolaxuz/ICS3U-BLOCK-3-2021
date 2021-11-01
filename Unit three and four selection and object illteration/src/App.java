public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
/*

private static String playRound() {
    Scanner in = new Scanner (System.in);
    String playerHand = "";
    String c1Hand = "";
    String c2Hand = "";
    String topCard = "";
    String initialTopCard = ""; 

  for (int i = 0; i < NUM_CARDS_TO_START; i++){
        playerHand += getCard(); 
    }

    while(playerHand.length() >= 0 || c1Hand.length() >= 0 || c2Hand.length() >= 0){
      String temp = processPlayer(in, playerHand, initialTopCard);
      playerHand = temp.substring(0, temp.indexOf("-"));
      topCard = temp.substring(temp.indexOf("-") + 1);

      temp = processComputer(c1Hand, topCard, playerHand, c2Hand);
      c1Hand = temp.substring(0, temp.indexOf("-"));
      topCard = temp.substring(temp.indexOf("-") + 1);

      temp = processComputer(c2Hand, topCard, playerHand, c1Hand);
      c2Hand = temp.substring(0, temp.indexOf("-"));
      topCard = temp.substring(temp.indexOf("-") + 1);
    }

   
    return playerTotal(playerHand, initialTopCard) + "-" + playerTotal(c1Hand, initialTopCard) + playerTotal(c2Hand, initialTopCard); 

}


private static String processComputer(String cHand, String topCard, String c1Hand, String c2Hand) {
    cHand = validHand(cHand, topCard) + " "; 
    int index = 0; 
    String card = ""; 
    String suit = ""; 
    if (cHand.indexOf(topCard.substring(0, topCard.length() - 1)) != -1 || cHand.indexOf(topCard.substring(topCard.length() - 1)) != -1 || cHand.indexOf("8") != -1) {
        if (c1Hand.indexOf(" ") == -1 || c2Hand.indexOf(" ") == -1){
            while (cHand.indexOf(topCard.substring(0, topCard.length() - 1), index)!= -1){
                index = cHand.indexOf(topCard.substring(0, topCard.length() - 1), index); 
                card = cHand.substring(cHand.lastIndexOf(" ", index) + 1, cHand.indexOf(" ", index));
                if (!(card.substring(card.length() - 1).equals(topCard.substring(topCard.length() - 1)))){
                    return cHand.replaceFirst(card + " ", "").trim() + "-" + card;
                }
                index++;
            }if (cHand.indexOf("8")!= -1){
                suit = getHighSuit(cHand);
                return cHand.replaceFirst(cHand.substring(cHand.indexOf("8"), cHand.indexOf("8") + 2), "").trim() + "-8" + suit; 

            }
        }if (cHand.indexOf(topCard.substring(topCard.length() - 1)) != -1) {
            index = 0; 
            while (cHand.indexOf(topCard.substring(topCard.length() - 1), index) != -1){
                index = cHand.indexOf(topCard.substring(topCard.length() -1), index); 
                card = cHand.substring(cHand.lastIndexOf(" ", index) + 1, cHand.indexOf(" ", index));
                if (card.indexOf("8") == -1){
                    return cHand.replaceFirst(card + " ", "").trim() + "-" + card;
                } else {
                    index++; 
                }
            }
        } if (cHand.indexOf(topCard.substring(0, topCard.length() - 1)) != -1 && cHand.indexOf("8") == -1 ){
            index = 0; 
            index = cHand.indexOf(topCard.substring(0, topCard.length() - 1), index); 
            card = cHand.substring(index, cHand.indexOf(" ", index)); 

            return cHand.replaceFirst(card + " ", "").trim() + "-" + card; 
        } if (cHand.indexOf("8") != -1){
            suit = getHighSuit(cHand); 
            card = cHand.substring(cHand.indexOf("8"), cHand.indexOf("8") + 2);
            return cHand.replaceFirst(card + " ", "").trim() + "-" + card; 
        }
    } else {
        System.out.println("Computer skips");
        return cHand + "-" + topCard; 
    }
    return ""; 
}

private static String getHighSuit(String cHand) {
    return null;
}

private static int playerTotal(String hand, String topCard) {
    int score = 0;
    for (int i = 0; i < hand.length(); i += 3) {
       String face = hand.substring(i, i + 1);
       if ("10JQK".indexOf(face) >= 0)
          score += 10;
       else if (face.equals("A"))
          score += 1;
       else if ("2345679".indexOf(face) >= 0)
          score += Integer.parseInt(face);
       else
          score += 50;
    }
    return score;
 }

private static String processPlayer(Scanner in, String playerHand, String initialTopCard){
    boolean validInput = false; 
    playerHand += " ";
    String card = " "; 
    while (!validInput){
        System.out.println(playerHand);
        System.out.println("Pick a Card");
        card = in.nextLine(); 
        if(playerHand.indexOf(card) >  - 1 && card.indexOf(" ") == -1){
            validInput = true;
        } else {
            System.out.println("Invalid Input");
            System.out.println("Valid cards are: ");         
        }
    }
    return playerHand.replace(card + " ", "").trim(); 
}

private static String validHand(String playerHand, String topCard) {
    if (playerHand.length() == 0) {
        return "";
    } 
    int addedCards = 0; 
    while (playerHand.indexOf(topCard.substring(0, topCard.length() - 1)) == 1 && playerHand.indexOf(topCard.substring(topCard.length() - 1)) == -1 && playerHand.indexOf("8") == -1 ){
        playerHand += " " + getCard(); 
        addedCards ++; 
        if (addedCards == 5){
            return playerHand + " ";
        }
    }
    return playerHand + " ";
}

private static boolean gameOver(int playerPoints, int c1Points, int c2Points) {
    return playerPoints >= 100 || c1Points >= 100 || c2Points >= 100;
}


}
(main) 
int playerPoints = 0, c1Points = 0, c2Points = 0; 
          while (!gameOver(playerPoints, c1Points, c2Points)){
             String result = playRound();     
             int firstDash = result.indexOf("-"); 
             int secondDash = result.lastIndexOf("-");
             playerPoints += Integer.parseInt(result.substring(0, firstDash));
             c1Points += Integer.parseInt(result.substring(firstDash + 1, secondDash));
             c2Points += Integer.parseInt(result.substring(secondDash + 1));
  
             System.out.println("Current Score:" + playerPoints + " " + c1Points + " " + c2Points);
          }


private static String processComputer(String cHand, String topCard, String c1Hand, String c2Hand) {
    String topNum = topCard.substring(0, topCard.length()-1); 
    String topSuit = topCard.substring(topCard.length()-1);  
    String cardPlayed = "";
    int count = 0;
    int index = 0;
    String card = "";
    Boolean pickup = true;

    while(pickup && count <5){
       Boolean canPlay = (cHand.indexOf(topCard.substring(topCard.length()-1)) >=0) || (cHand.indexOf(topCard.substring(0,1))>=0)|| (cHand.indexOf(topCard.substring(0,2))>=0) || (cHand.indexOf("8")>=0);
       if(canPlay){
          pickup = false;
       }
       else{
        cHand += getCard() + " ";
          count++;
       }
    }
    if(count == 5){
       System.out.println("Skipped");
       return topCard + " " + cHand;
    }

       if(c1Hand.length() <= 4 || c2Hand.length() <= 4){ 
          while(cHand.indexOf(topNum, index) >= 0){
             index = cHand.indexOf(topNum, index);
             card = cHand.substring(index, cHand.indexOf(" ", index)); 
             if(!card.equals(topCard)){
                String cardReplace = card + " ";
                return card + " " +  cHand.replace(cardReplace, "");
             }
             index ++;   
          }
          if(cHand.indexOf("8") >= 0){
            cHand = cHand.substring(0, cHand.indexOf("8")) + cHand.substring(cHand.indexOf("8") + 3); 
             if(cHand.indexOf("H") >= 0 && !"H".equals(topSuit)){
                return "8H" + " " + cHand;
             }if(cHand.indexOf("C") >= 0 && !"C".equals(topSuit)){
                return "8C" + " " + cHand;
             }if(cHand.indexOf("D") >= 0 && !"D".equals(topSuit)){
                return "8D" + " " + cHand;
             }if(cHand.indexOf("S") >= 0 && !"S".equals(topSuit)){
                return "8S" + " " + cHand;
             }return "8" + topSuit + " " + cHand; 
     }
      if (cHand.indexOf(topSuit) >= 0){ 
         if(!cHand.substring(cHand.indexOf(topSuit) -1, cHand.indexOf(topSuit)).equals("8")){
            if(cHand.substring(cHand.indexOf(topSuit) - 1, cHand.indexOf(topSuit)).equals("0")){ 
               cardPlayed = cHand.substring(cHand.indexOf("10"), cHand.indexOf("10") + 3);
               cHand = cHand.substring(0, cHand.indexOf("10")) + cHand.substring(cHand.indexOf("10") + 4);
               return cardPlayed + " " + cHand;
            }
             cardPlayed = cHand.substring(cHand.indexOf(topSuit)-1, cHand.indexOf(topSuit)+1);
             cHand = cHand.substring(0, cHand.indexOf(cardPlayed)) + cHand.substring(cHand.indexOf(cardPlayed) + 3);
             return cardPlayed + " " + cHand;
        }
       }
       if(cHand.indexOf(topNum)>= 0){
          if(topNum.equals("10")){
            cardPlayed = cHand.substring(cHand.indexOf("10"), cHand.indexOf("10")+3);
            cHand = cHand.substring(0, cHand.indexOf("10")) + cHand.substring(cHand.indexOf("10") + 4);
            return cardPlayed + " " + cHand;
         }
          if (!cHand.substring(cHand.indexOf(topNum), cHand.indexOf(topNum) + 1).equals("8")){
           cardPlayed = cHand.substring(cHand.indexOf(topNum), cHand.indexOf(topNum) + 2);
           cHand = cHand.substring(0, cHand.indexOf(cardPlayed)) + cHand.substring(cHand.indexOf(cardPlayed) + 3);
           return cardPlayed + " " + cHand;
         }

      }
      if(cHand.indexOf("8") >= 0){
        cHand = cHand.substring(0, cHand.indexOf("8")) + cHand.substring(cHand.indexOf("8") + 3);
       if(cHand.indexOf("H") >= 0 && !"H".equals(topSuit)){
          return "8H" + " " + cHand;
       }if(cHand.indexOf("C") >= 0 && !"C".equals(topSuit)){
          return "8C" + " " + cHand;
       }if(cHand.indexOf("D") >= 0 && !"D".equals(topSuit)){
          return "8D" + " " + cHand;
       }if(cHand.indexOf("S") >= 0 && !"S".equals(topSuit)){
          return "8S" + " " + cHand;
       }return "8" + topSuit + " " + cHand;
    }


 return topCard + " " + cHand; 

}

*/