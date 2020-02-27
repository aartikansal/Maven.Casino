package io.zipcoder.casino.GameClasses.CardGames;

import io.zipcoder.casino.Player.Hand;

import java.util.Collections;
import java.util.Stack;
import java.util.ArrayList;

public class Deck {
    private Stack<Card> currentDeck = new Stack<Card>();
    private final String[] suits = {"D", "H", "S", "C"};
    private final Integer[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};


    public Deck(){
        for (int i = 0;i<13;i++) {
            EnumRank rank = EnumRank.values()[i];
            for (int j = 0; j < 4; j++) {
                Card newCard = new Card(rank, EnumSuit.values()[j]);
                this.currentDeck.push(newCard);
            }
        }
    }
    public Deck shuffle(){
        Collections.shuffle(this.currentDeck);
        return this;
    }

    public boolean isEmpty(){
        if(currentDeck.size() == 0){
            return true;
        }
        else{
            return false;
        }
    }


    public Card draw(){return currentDeck.pop();}

    public Hand Show(){return null;}

    public Stack<Card> getCurrentDeck() {
        return currentDeck;
    }


}
