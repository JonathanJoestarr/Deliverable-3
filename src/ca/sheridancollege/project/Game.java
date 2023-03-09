
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    private final String name;//the title of the game
    private ArrayList<Player> players;// the players of the game
    
    Scanner Warinput = new Scanner(System.in);
    
    Game End = new Game();
    End.winner();

    public Game(String name) {
        this.name = name;
        players = new ArrayList(1);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }   
    
    public int End(int finaltally){
  

    }
    
}
