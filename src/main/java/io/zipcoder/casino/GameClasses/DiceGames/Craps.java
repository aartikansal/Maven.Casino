package io.zipcoder.casino.GameClasses.DiceGames;

import io.zipcoder.casino.CasinoClasses.Membership;
import io.zipcoder.casino.GameClasses.GamblingGame;
import io.zipcoder.casino.GameClasses.Game;
import io.zipcoder.casino.GameClasses.Games;
import io.zipcoder.casino.Player.CrapsPlayer;
import io.zipcoder.casino.Player.Dealer;
import io.zipcoder.casino.Player.Player;

import java.util.HashMap;

public class Craps extends Games implements GamblingGame{

    public Integer placeWager() {
        return null;
    }

    public Integer addWinnings() {
        return null;
    }

    public Integer subtractLoses() {
        return null;
    }

    public Boolean checkPlayerBalances() {
        return null;
    }

//    public void startGame(Membership membership) { }

    public void startGame(Membership membership) {
        CrapsPlayer currentPlayer = new CrapsPlayer(membership);
        Dice twoDice = new Dice(2);
        Dealer crapsDealer = new Dealer();
        HashMap<String, Integer> betsOnTable = new HashMap<>();
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

    @Override
    public Player playerBuilder(Membership membership) {
        return null;
    }

    public Player playerBuilder() {
        return null;
    }

    public Boolean isTurn() {
        return null;
    }


}

