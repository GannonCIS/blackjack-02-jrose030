/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack_02;

import java.util.Scanner;

/**
 *
 * @author gubotdev
 */
public class Dealer {
    
    private Player[] myPlayers; 
    private Deck myDeck = new Deck();
    
    private Hand myHand = new Hand();
    
    Scanner scan = new Scanner(System.in);
    
    public Dealer (int numOfPlayers){
        System.out.println("How many want to play?");
        int num = scan.nextInt();
        initPlayers(num);
    }
    public void dealOutOpeningHand(){
        
    }
    
    public void playOutPlayerHands(){
        
    }
    
    public void playOutDealerHand(){
        
    }
    
    public void declareWinners(){
        
    }
    
    private void initPlayers(int numOfPlayers){
        myPlayers = new Player[numOfPlayers];
        for(int i = 0; i < myPlayers.length; i++){
            System.out.println("Player " + i+1 + " whats your name?");
            String name = scan.next();
            if(name.equals("")){
                myPlayers[i] = new Player(i+1);
            } else {
            myPlayers[i] = new Player(name);
            }
        }
    }
}
