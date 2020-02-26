package io.zipcoder.casino.GameClasses.CardGames;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

public class DeckTest {
    @Test
    public void shuffleTest(){
        Deck newDeck = new Deck();
        Deck shuffled = newDeck.shuffle(newDeck);
        Card expected = newDeck.currentDeck.pop();
        Card actual = shuffled.currentDeck.pop();

        Assert.assertFalse(expected==actual);

    }

}