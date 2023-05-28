import card.Card;
import java.util.Random;
import java.util.Scanner;
//Student id = 991709597
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Jasleen
 * @since  27 May 2023
 */
public class CardTrick {

    
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i = 0; i< magicHand.length;i++) {
            var c = new Card();
            Random random = new Random();
            int value = random.nextInt((13) + 1);
            c.setValue(value);//c.setValue(insert call to random number generator here)
            int suit = random.nextInt(4);
            c.setSuit(Card.SUITS[suit]); //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            magicHand[i] = c;
        }
         Scanner scanner = new Scanner(System.in);
         
        System.out.println("Please enter the value between 1 and 13 = ");
       int value = scanner.nextInt();
       
       System.out.println("Now please enter the suit(\"Hearts\", \"Diamonds\", \"Spades\", \"Clubs\") = ");
       String suit = scanner.next();
       
       Card createdCard = new Card(value,suit);
       createdCard.setValue(value);
       createdCard.setSuit(suit);
       // and search magicHand here
        boolean found= false;
                
      for(Card card : magicHand){
          if (card.getValue()== createdCard.getValue()) {
                if (card.getSuit().equals(createdCard.getSuit())) {
                } else {
                   
              }
            }
          if(found){
              System.out.println("Yay! Your card is present in the magic Hand ");
          }
          else{
              System.out.println("Oops! Your card is not present in the magic hand") ;
          }
          Card luckyCard = new Card();
          luckyCard.setValue(13);
          luckycard.setSuits("Spades");
     
          boolean won = false;
          for(Card card : magicHand){
              id(card.getValue() == luckyCard.getValue() && card.getsSuits.equals(luckyCard.getSuit())){
               found = true;
                  break;
              }
          }
         
          if(won){
              System.out.println(Congratulations! You withdrew the lucky Card );
          }
          else{
          System.out.println(Sorry! Better luck next time)
              ;
          }
          }
    
        /* Results:
Please enter the value between 1 and 13 = 
3
Now please enter the suit("Hearts", "Diamonds", "Spades", "Clubs") = 
Hearts
Oops! Your card is not present in the magic hand
Oops! Your card is not present in the magic hand
Oops! Your card is not present in the magic hand
Oops! Your card is not present in the magic hand
Oops! Your card is not present in the magic hand
Oops! Your card is not present in the magic hand
Oops! Your card is not present in the magic hand
*/
    }
    
}
