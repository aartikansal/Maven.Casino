package io.zipcoder.casino.GameClasses;

import io.zipcoder.casino.CasinoClasses.Membership;
import io.zipcoder.casino.Player.Player;

public interface Game {

    public void startGame(Membership membership);

    public Boolean quitGame();

    public Boolean win();

    public Boolean playAgain();

    public Player playerBuilder();

    public Boolean isTurn();
}
