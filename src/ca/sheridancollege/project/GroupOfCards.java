
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GroupOfCards {
    
public static void main (String [] args){    

    Scanner Warinput = new Scanner(System.in);

    
    private ArrayList<Card> cards;
    private int decksize;

    public GroupOfCards(int decksize) {
        int[] size = {51};
        int[] cardvalues = {0,1,2,3,4,5,6,7,8,9,10,11,12,13};
        int player1score = 0;
        int player2score = 0;
        GroupOfCards End = new GroupOfCards();
        
        for(int player1draw = 0; player1hand < 27; player1hand++){
            
            System.out.printf("%2d", (int)(Math.random() * 13));
            
            if(player1hand > 0){   
            cardvalues[player1hand];
            
            if(player1hand > player2hand){
            player1score = player1score + 1;
            }
            }
            
        }
        
           for(int player2hand = 0; player2hand < 27; player2hand++){
           
            System.out.printf("%2d", (int)(Math.random() * 13));
               
            if(player2hand > 0){   
            cardvalues[player2hand];
            
            if(player2hand > player1hand){
            player2score = player2score + 1;
            }
            }
            
        } 
        
    }
           
    public int End(){
        if(player1hand < 27){
         
            System.out.println(player1score); 
        }
        
        if(player2hand < 27){
            
            System.out.println(player2score);
        }
        
            if(player1score > player2score){
                
                System.out.println("Congrats" + name1, "you have won the game!");
                
            }
            else(player2score > playey1score){
                
                System.out.println("Congrats" + name2, "you have won the game!");
        
            }
        
    }
}
        
}
