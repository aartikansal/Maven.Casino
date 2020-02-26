package io.zipcoder.casino.Player;

import io.zipcoder.casino.GameClasses.CardGames.Card;
import io.zipcoder.casino.GameClasses.CardGames.Deck;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HandTest {

    @Test
    public void addCardToHand() {
        Hand handOfCards = new Hand();
        Hand handOfCards2 = new Hand();
        Deck deckOfCards = new Deck();
        Deck deckOfCards2 = new Deck();

        handOfCards.addCardToHand(deckOfCards.Draw());
        handOfCards2.addCardToHand(deckOfCards2.Draw());
        Assert.assertEquals(handOfCards,handOfCards2);
    }

    @Test
    public void removeCardFromHand() {
    }
}