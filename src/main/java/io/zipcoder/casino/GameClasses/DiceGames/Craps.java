package io.zipcoder.casino.GameClasses.DiceGames;

import io.zipcoder.casino.CasinoClasses.Membership;
import io.zipcoder.casino.GameClasses.GamblingGame;
import io.zipcoder.casino.GameClasses.Game;
import io.zipcoder.casino.Player.Player;

public class Craps implements GamblingGame, Game {

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

    public void startGame() { }

    @Override
    public void startGame(Membership membership) {

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

