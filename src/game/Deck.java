
package game;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author jc198
 */
public class Deck {
    

   public static final int NumCards = 52;
   
   ArrayList<Card> deck = new ArrayList<Card>();   
   
   public Deck()
   {
       for(int i = 0 ; i <= 3; i++)
        for( int j = 0; j < 13; j++)
        {
            Card c = new Card(i,j);
            deck.add(c);
        }    
       
   }
   public void shuffle(){
        Collections.shuffle(deck);
   }
       public void sort(){
        Collections.sort(deck);
    }        
    public void printCards(){
    System.out.println(deck);
}

}
