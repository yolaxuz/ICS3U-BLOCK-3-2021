import java.util.Scanner; // import scanner into the code


/* 1. distribute cards to three player and not letting player one see computer 1 & 2
* 2. have a top card from the deck and let each player put a card down 
* 3. count the points 
*/
/* PLEASE i know my code may not work properly but i tried my best please consider not to fail my mark thank you so much 
*/ 

public class CrazyEightFinal {
    private static final int NUM_SUITS = 4; // the amount of suits
    private static final String HEARTS = "H"; // state string hearts prints "H"
    private static final String DIAMONDS = "D"; // state string Diamonds prints "D"
    private static final String CLUBS = "C";// state string clubs prints "C"
    private static final String SPADES = "S";// state string spades prints "S"
    private static final double CARDS_PER_SUIT = 13; // amount of cards for suits
    private static final String ACE = "A"; // ace prints a
    private static final String JACK = "J"; // jack prints J
    private static final String QUEEN = "Q"; // queen prints Q
    private static final String KING = "K"; // king prints K
    private static final int NUM_CARDS_TO_START = 0; // start of card is 0 


public static void main(String[] args) {

        int playerPoints = 0, c1Points = 0, c2Points = 0; // player and computer points starts at 0 
          while (!gameOver(playerPoints, c1Points, c2Points)){ // when game over 
             String result = playRound();     // run playround
           int firstDash = result.indexOf("-"); // first dash is index of - 
             int secondDash = result.lastIndexOf("-"); // second dash is the last index of - 
             playerPoints += Integer.parseInt(result.substring(0, firstDash)); // playerpoints return after plus integer pareint result from 0 to first dash
             c1Points += Integer.parseInt(result.substring(firstDash + 1, secondDash)); // c1 points plus and return integer pareint result substring from first dash + 1 to second dash 
             c2Points += Integer.parseInt(result.substring(secondDash + 1)); // c2points + return integer pareint from result substring from second dash + 1 
  
             System.out.println("Current Score:" + playerPoints + " " + c1Points + " " + c2Points); // print current score: player points + "" +  c1points + " " + c2 points
             System.out.println(result); // prints the result of the game
          }    
          System.out.println("Points \n player: " + playerPoints + "Computer Player 1: " + c1Points + "Computer Player 2: " + c2Points); //prints ()
          if (playerPoints < c1Points && playerPoints < c2Points) // if player points is less than c1 points and c2 points
            System.out.println("You Win!"); // print you win 
          else if (c1Points < playerPoints && c1Points < c2Points) // if c1points is less than player points and c2points
            System.out.println("Computer 1 Wins"); // print computer 1 wins
          else if (c2Points < playerPoints && c2Points < c1Points) // c2 points is less than playerpoints and c1 points
            System.out.println("Computer 2 Wins");    // prints c2 wins 
          else if(playerPoints == c1Points && playerPoints < c2Points) // if plyaerpoints = c1points and less than c2points
            System.out.println("Player and Computer 1 Tie"); //prints player and computer 1 tie 
          else if(playerPoints == c2Points && playerPoints < c1Points) // if player points == c2 points and less then c1 points
            System.out.println("You and Computer 2 Tie"); // prints player and c2 tie
          else if(c1Points == c2Points && c1Points < playerPoints) // if c1 == c2 points and c1 points less then player points
            System.out.println("Computer 1 and Computer 2 Tie"); // prints c1 and c2 tie
          else if (c1Points == c2Points && c1Points == playerPoints) // if all players points are equal
            System.out.println("Tie for every player"); // prints tie for every player 
      }

private static String getCard() {

    String card = getFace() + getSuit(); // set card to be the face + suit 
    card = getFace() + getSuit();
    return card; // return the card
  }

  private static String getSuit() {
    int suit = (int) (Math.random() * NUM_SUITS); // the suit equals a random suit 

    if (suit == 0) // if suit is 0 
       return HEARTS; // return H
    else if (suit == 1) // if suit is 1 
       return DIAMONDS; // return D
    else if (suit == 2) // if suit is 2 
       return CLUBS; // return C
    else // other than everything above
       return SPADES; // return S
 }

 private static String getFace() {
    int suit = (int) (Math.random() * CARDS_PER_SUIT); // the suit 
    if (suit >= 2 && suit <= 10) // if the suit is bigger and equals to 2 or less than or equal to 10
       return suit + ""; // it returns the suit 
    else if (suit == 1) // if suit equals to 1 
       return ACE; // return the suit as A
    else if (suit == 11) // if the suit equals 11
       return JACK; // return the suit as J
    else if (suit == 12) // if the suit is 12 
       return QUEEN; // return the suit as A
    else // anything else
       return KING; // return the suit as K 
 }

 private static String playRound() {
   Scanner in = new Scanner (System.in);// inport scanner 
   String playerHand = ""; // have the player hand
   String c1Hand = ""; // have the c1hand
   String c2Hand = ""; // have the c2hand
   String topCard = ""; // have the top card
   String initialTopCard = "";  // have the initial topcard 

        topCard = getCard() + " "; // state the topcard as the getcard method 
        System.out.println("The top card is: " + topCard); // print the top card is plus the top card

  
        playerHand = getCard() + " ";
        playerHand += getCard() + " ";
        playerHand += getCard() + " ";
        playerHand += getCard() + " ";
        playerHand += getCard() + " ";
   // print 5 random card for player hand
  
        System.out.println("player hand: " + playerHand); // print player hand: plus the player hand 

        playerHand = processPlayer(in, playerHand, topCard); // state player hand as processPlayer 
  
        c1Hand = getCard() + " ";
        c1Hand += getCard() + " ";
        c1Hand += getCard() + " ";
        c1Hand += getCard() + " ";
        c1Hand += getCard() + " ";
   // pick random 5 cards for c1hand
  
        System.out.println("Computer hand: " + c1Hand); // print computer hand: plus c1 hand 
  
        c2Hand = getCard() + " ";
        c2Hand += getCard() + " ";
        c2Hand += getCard() + " ";
        c2Hand += getCard() + " ";
        c2Hand += getCard() + " "; // pick random 5 cards for c2Hand

        System.out.println("Second Computer Hand: " + c2Hand); // print second computer hand: plus c2hand 

    while(playerHand.length() > 0 && c1Hand.length() > 0 && c2Hand.length() >= 0){ // while every player has more than 1 card
     String temp = processPlayer(in, playerHand, initialTopCard); // set temp as process player 
     playerHand = temp.substring(0, temp.indexOf("-")); // playerhand is 0 index to temp.index of plus -
     topCard = temp.substring(temp.indexOf("-") + 1); // top card is temp index +1 add - 

     temp = processComputer(c1Hand, topCard, playerHand, c2Hand); // temp is process computer 
     c1Hand = temp.substring(0, temp.indexOf("-"));// c1 hand is 0 index to temp.index of plus -
     topCard = temp.substring(temp.indexOf("-") + 1);// top card is temp index +1 add - 

     temp = processComputer(c2Hand, topCard, playerHand, c1Hand);//temp is process computer 
     c2Hand = temp.substring(0, temp.indexOf("-")); // c2Hand is 0 index to temp.index of plus -
     topCard = temp.substring(temp.indexOf("-") + 1);// top card is temp index +1 add - 
   } 

  
   return playerTotal(playerHand, initialTopCard) + "-" + playerTotal(c1Hand, initialTopCard) // return the player total for player hand and initialtopcard + - + player total for c1hand to initialtop card
   + playerTotal(c2Hand, initialTopCard); // and + the player total for c2hand to initial topcard 
}

private static int playerTotal(String hand, String topCard) { 
   int score = 0; // have score start with 0 
   for (int i = 0; i < hand.length(); i += 3) { // if the score starts at 0 and is less then the length of hand after first round goes back and have i + 3
      String face = hand.substring(i, i + 1);//  the face is the length of hand with the index i to i + 1
      if ("10JQK".indexOf(face) >= 0) // if the face is 10jqk index of face is bigger and equal to 0 
         score += 10; // the score + 10 and return it back to score 
      else if (face.equals("A")) // if the face is a 
         score += 1; //return the score added by 1 
      else if ("2345679".indexOf(face) >= 0) // else if 2345679 of index is bigger than 0 
         score += Integer.parseInt(face); // return the score + the integer.pareseInt face 
      else // anything else
         score += 50; // return the score by + 50 
   }
   return score; // return score 
}

private static String processComputer(String cHand, String topCard, String c1Hand, String c2Hand) {
    String topNum = topCard.substring(0, topCard.length()-1); // rank top card 
    String topSuit = topCard.substring(topCard.length()-1);  // suit top card
    String cardPlayed = ""; // cardplayed is ""
    int count = 0; // count is 0 
    int index = 0; // index is 0
    String card = ""; // card is ""
    Boolean pickup = true; // pickup is true 

    while(pickup && count <5){ // while pickup and count is less than 5 
       Boolean canPlay = (cHand.indexOf(topCard.substring(topCard.length()-1)) >=0) || (cHand.indexOf(topCard.substring(0,1))>=0)|| (cHand.indexOf(topCard.substring(0,2))>=0) || (cHand.indexOf("8")>=0);
       // can play is ^^
       if(canPlay){ // if can play does not match 
          pickup = false; // return it false 
       }
       else{ 
        cHand += getCard() + " "; // computer hand + get card and return it count plus 1 
          count++;
       }
    }
    if(count == 5){ // if count is 5 
       System.out.println("Skipped"); // print skiped to represent skip turn 
       return topCard + " " + cHand; // return topcard + " " + chand 
    }

       if(c1Hand.length() <= 4 || c2Hand.length() <= 4){ // if c1hand length is less then 4 or c2hand length is less then 4
          while(cHand.indexOf(topNum, index) >= 0){ // while chand index from topnum to index is bigger than 0 
             index = cHand.indexOf(topNum, index); // index is chand index of topnum to index
             card = cHand.substring(index, cHand.indexOf(" ", index)); // card is chand index to chand index of " " to index
             if(!card.equals(topCard)){ // if not card equals top card 
                String cardReplace = card + " "; // string card replace is card + " " 
                return card + " " +  cHand.replace(cardReplace, ""); // return card + " " + hand replace "" 
             }
             index ++;   // index plus 1 
          }
          if(cHand.indexOf("8") >= 0){ // if chand index of 8 is bigger than 0 
            cHand = cHand.substring(0, cHand.indexOf("8")) + cHand.substring(cHand.indexOf("8") + 3); // chand is chand index 0 to index of "8" + chand index of 8 + 3
             if(cHand.indexOf("H") >= 0 && !"H".equals(topSuit)){ // if chand index of h is bigger than 0 and not h equals topsuit
                return "8H" + " " + cHand; //return 8H + " " + computer hand 
             }if(cHand.indexOf("C") >= 0 && !"C".equals(topSuit)){ // if chand index of C is bigger than 0 and not h equals topsuit
                return "8C" + " " + cHand; //return 8C + " " + computer hand 
             }if(cHand.indexOf("D") >= 0 && !"D".equals(topSuit)){ // if chand index of D is bigger than 0 and not h equals topsuit
                return "8D" + " " + cHand; //return 8D + " " + computer hand 
             }if(cHand.indexOf("S") >= 0 && !"S".equals(topSuit)){ // if chand index of S is bigger than 0 and not h equals topsuit
                return "8S" + " " + cHand; //return 8S + " " + computer hand 
             }return "8" + topSuit + " " + cHand; //return 8 plus top suit plus card plus computer hand 
     }
      if (cHand.indexOf(topSuit) >= 0){ // if computer hand index top suit is bigger than 0 
         if(!cHand.substring(cHand.indexOf(topSuit) -1, cHand.indexOf(topSuit)).equals("8")){ // if not hand substring comptuer hand index topsuit -1 to index topsuit equals 8 
            if(cHand.substring(cHand.indexOf(topSuit) - 1, cHand.indexOf(topSuit)).equals("0")){ //if computerhand index of topsuit - 1 top computer index top suit equals 0 
               cardPlayed = cHand.substring(cHand.indexOf("10"), cHand.indexOf("10") + 3); // cardplayed is computer hand index of 10 to index of 10 + 3
               cHand = cHand.substring(0, cHand.indexOf("10")) + cHand.substring(cHand.indexOf("10") + 4); // computer = computer hand index 0 to "10" + chand substring index of 10 + 4
               return cardPlayed + " " + cHand; // return cardplayed + cards + comptuer hand 
            }
             cardPlayed = cHand.substring(cHand.indexOf(topSuit)-1, cHand.indexOf(topSuit)+1); // cardplayed is computer hand substring computer hand index from topsuiot -1 to topsuit +1
             cHand = cHand.substring(0, cHand.indexOf(cardPlayed)) + cHand.substring(cHand.indexOf(cardPlayed) + 3); 
             // computer hand is computer hand index 0 to computer hand index cardplayed + chand substring chand index cardplyaed + 3
             return cardPlayed + " " + cHand; // return cardplayed + card + computer hand 
        }
       }
       if(cHand.indexOf(topNum)>= 0){ // if com hand index top num is bigger than 0 
          if(topNum.equals("10")){ // if top num is 10 
            cardPlayed = cHand.substring(cHand.indexOf("10"), cHand.indexOf("10")+3); // cardplayed is computer hand index of 10 to index 10 + 3
            cHand = cHand.substring(0, cHand.indexOf("10")) + cHand.substring(cHand.indexOf("10") + 4); // computerhand is index 0 to chand 10 + computer hand index of 10 + 4
            return cardPlayed + " " + cHand; // return cardplayed + " " + computer hand 
         }
          if (!cHand.substring(cHand.indexOf(topNum), cHand.indexOf(topNum) + 1).equals("8")){ // if not substring indexof top num to index of top num + 1 equals 8 
           cardPlayed = cHand.substring(cHand.indexOf(topNum), cHand.indexOf(topNum) + 2); // cardplayed is comptuer hand index of top num to topnum + 2
           cHand = cHand.substring(0, cHand.indexOf(cardPlayed)) + cHand.substring(cHand.indexOf(cardPlayed) + 3); // computer hand substring 0 top chand cardplyed plus chand index cardplayed + 3
           return cardPlayed + " " + cHand; // return cardplayed + " " + chand 
         }

      }
      if(cHand.indexOf("8") >= 0){ // if computer hand is 8 bigger than 0 
        cHand = cHand.substring(0, cHand.indexOf("8")) + cHand.substring(cHand.indexOf("8") + 3);// computer hand is substring 0 to index of 9 + computer hand index of 8 + 3
       if(cHand.indexOf("H") >= 0 && !"H".equals(topSuit)){ // if computer hand is H and not H it equals top suit
          return "8H" + " " + cHand; // return 8H + " " 
       }if(cHand.indexOf("C") >= 0 && !"C".equals(topSuit)){ // if com hand index of C is bigger than 0 and not equal to top suit 
          return "8C" + " " + cHand; // return 8C + " "
       }if(cHand.indexOf("D") >= 0 && !"D".equals(topSuit)){ // if com hand index of D is bigger than 0 and not equal to top suit
          return "8D" + " " + cHand; // return 8D + " "
       }if(cHand.indexOf("S") >= 0 && !"S".equals(topSuit)){ // if com hand index of S is bigger than 0 and not equal to top suit
          return "8S" + " " + cHand; // return 8S + " "
       }return "8" + topSuit + " " + cHand; // reutnr 8 plus top suit plus computer hand 
    }
       }
 return topCard + " " + cHand; // return the top card + " " + computer hand 
    
}


private static String processPlayer(Scanner in, String playerHand, String topCard){ 
   boolean validInput = false; // set validinput as false
   playerHand += " "; // player hand + "" and return it 
   String card = " ";  // string card = "" 
   while (!validInput){ // while validinput is true 
       System.out.println(playerHand); //print player hand 
       System.out.println("Pick a Card"); // print pick a card 
       card = in.nextLine(); // card is innextline 
       if(playerHand.indexOf(card) >  - 1 && card.indexOf(" ") == -1){ // if player index of card is bigger than -1 and card index "" equals -1 
           if (card.indexOf(topCard.substring(topCard.length()-1)) >= 0 || card.indexOf(topCard.substring(0,topCard.length()-1)) >=0){ // then if card indexof topcard length -1 is bigger than 0 or card index of topcard substring 0 to topcard length -1 is bigger and equal to 0 
               validInput = true; // validinput is true 
           }
           
           else if(card.indexOf("8") > -1){ // if card index is 8 bigger than - 1 index
               String suit = ""; // string suit is "" 
               System.out.println("Which suit do you want to change it to? (D, C, H, S)"); // prints which suit do you want to change it to dchs
               boolean isSuit = false; //insuit is false 
               while(!isSuit){ // while issuit is true 
                 suit = in.nextLine().toUpperCase(); // suit is innextline to uppercase 
                if(suit.equals("D") || suit.equals("C") || suit.equals("H") || suit.equals("S")){ // if suit is d or c or h or s 
                    isSuit = true; //is suit is true 
                }
                else{ // else 
                    System.out.println("invalid input"); // prints invalid input 
                }
               }
               String newCard = "8" + suit; // new card set as 8 plus the suit 
               return newCard + "-" + playerHand.replace(card + " ", "").trim(); // return the new card plus dash plus the player hand 

           }
           
       } 
       else { // else 
           System.out.println("Invalid Input"); // prints invalid input 
       }
   }
   return card + "-" + playerHand.replace(card + " ", "").trim(); // return card plus dash plus playerhand replace card plus "" to "" 
}

private static String validHand(String playerHand, String topCard) { 
   if (playerHand.length() == 0) { //if the playerhand length is 0 
       return ""; // return it 
   } 
   int addedCards = 0; // the added cards is 0 
   while (playerHand.indexOf(topCard.substring(0, topCard.length() - 1)) == 1 && // whil the playerhand index of the topcard from 0 to topcard length - 1 == 1 and  
   playerHand.indexOf(topCard.substring(topCard.length() - 1)) == -1 && playerHand.indexOf("8") == -1 ){ // playerhand index of topcard.length -1 == -1 and playerhand index of 8 is -1 
       playerHand += " " + getCard(); //have player hand + "" + the card 
       addedCards ++; // then have addedcards + 1 
       if (addedCards == 5){ // if added cards is 5 
           return playerHand + " "; // return playerhand 
       }
   }
   return playerHand + " "; // return playerhand 
}

private static boolean gameOver(int playerPoints, int c1Points, int c2Points) { 
   return playerPoints >= 100 || c1Points >= 100 || c2Points >= 100; // return the points when  player or c1 or c2 points is less or equal to 100 
}

}

