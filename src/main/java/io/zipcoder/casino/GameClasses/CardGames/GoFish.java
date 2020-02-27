package io.zipcoder.casino.GameClasses.CardGames;

import io.zipcoder.casino.GameClasses.Game;
import io.zipcoder.casino.Player.Player;
import io.zipcoder.casino.Player.Hand;
import io.zipcoder.casino.utilities.Console;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class GoFish implements Game {

    private Player player;
    private Hand playerHand;
    private Hand otherPlayerHand;
    private Card card;
    private Console console = new Console(System.in, System.out);


    private ArrayList<Integer> playerFile;
    private ArrayList<Integer> opponentFile;

    private boolean endGameCheck;
    private boolean win;
    private int turnOrder;

    private Deck deck;

    //Constructor
    public GoFish(Player player) {
        this.player = player;
        this.playerHand = new Hand();
        this.otherPlayerHand = new Hand();
       // playerFile = new ArrayList<Integer>(13);
       // opponentFile = new ArrayList<Integer>(13);
        endGameCheck = false;
        this.deck = new Deck();
        deck.shuffle();
        turnOrder = randomTurnOrder();
    }

    public int randomTurnOrder() {
        Random random = new Random();
        return random.nextInt(2);
    }

    // start the game
    public void startGame() {
        deck.shuffle();
        playerHand.addCardToHand(card);
        otherPlayerHand.addCardToHand(card);
    }

    public void playerTurn(Card cardInHand) {
        if (otherPlayerHand.checkIfCardIsInHand(cardInHand)) {
            playerHand.addCardToHand(cardInHand);
        } else
            console.println("Go fish! draw your card " + GoFish(playerHand,cardInHand));

    }


    // when any player says GoFish
    private String GoFish(Hand hands,Card cardToBeAddedToHand) {
        if(deck.isEmpty()){
            return "No Cards in Deck";
        }
        else {

            hands.addCardToHand(cardToBeAddedToHand);
            return card.toString();
        }
    }

    public Boolean quitGame() {
        return null;
    }

    public Boolean win() {
        return null;
    }

    public Boolean playAgain() {
        return null;
    }

    public Player playerBuilder() {
        return null;
    }


    public Boolean isTurn() {
        return null;
    }

}

