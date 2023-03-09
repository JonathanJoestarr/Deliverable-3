package ca.sheridancollege.project;

import java.util.Scanner;

public abstract class Player {

    Scanner Warinput = new Scanner(System.in);

    
    private String name;

    public Player(String name) {
        User name = new User();
        name.player1();
        name.player2();
        
    }

    public String player1(String name1) {
       
        String name1 = Warinput.nextLine();

       System.out.println("Enter your name player 1");
    }

    public String player2(String name2) {
        
        String name2 = Warinput.nextLine();
        
       System.out.println("Enter your name player 2"); 
        
    }
    public abstract void play();

}

public abstract void player();

}