/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author jc198
 */
public class Hand {
    

    
    public static final int numHand = 5;
    
    ArrayList<Card> cards = new ArrayList<Card>();
 //   ArrayList<Card> computer = new ArrayList<Card>();
    
    
    public Hand(){ 
    }
    
     public void sort(){
        Collections.sort(cards);
    }    
}