package io.zipcoder.casino.Player;

import io.zipcoder.casino.GameClasses.CardGames.Card;

import java.util.ArrayList;

public class Hand {
    ArrayList<Card> handOfCards = new ArrayList<Card>();

    public Hand(){
    }

    public void addCardToHand(Card cardToBeAddedToHand){
         handOfCards.add(cardToBeAddedToHand);
    }


    public void removeCardToHand(Card cardToBeRemovedToHand){
        handOfCards.remove(cardToBeRemovedToHand);
    }


    @Override
    public String toString(){
        String cardsInHand = "";
        for (Card element: handOfCards) {
            cardsInHand+=element.getRank() +" of "+  element.getSuit();
        }
        return cardsInHand;
    }
}
