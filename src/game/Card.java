
package game;
/**
 *
 * @author jc198
 */
public class Card implements Comparable<Card> {

    private int suit;
    private int faceValue;
    
    String[] suits = {"Diamonds","Clubs", "Spades", "Hearts"};
    String[] faceValues = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    public Card(int suit, int faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }
    
    public String toString()
    {
        return faceValues[faceValue] + " of " + suits[suit];
    }
    
    public String getImage(){
        String imageName=faceValues[faceValue] + suits[suit] + ".png";
        return imageName;
    }
    
    public int getSuit(){
        return suit;
    }
    
    public int getValue(){
        return faceValue;
    }
    
    
    @Override
    public int compareTo(Card compareCard) {
        
        int compareSuit = ((Card)compareCard).getSuit();
        int compareValue=((Card)compareCard).getValue();
        if(this.suit == compareSuit)
        {
            /* For Ascending order of values */
            return this.faceValue-compareValue;
         }
        /* For Ascending order of suits */
        else return this.suit - compareSuit; 
     }

}

