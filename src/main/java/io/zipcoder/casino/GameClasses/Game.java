package io.zipcoder.casino.GameClasses;

import io.zipcoder.casino.CasinoClasses.Membership;
import io.zipcoder.casino.Player.Player;

import java.util.ArrayList;

public interface Game {

<<<<<<< HEAD

=======
    public void startGame(Membership membership);
>>>>>>> a32b9744b4357bb5e00558d5eaf200f62921b865

    public Boolean quitGame();

    public Boolean win();

    public Boolean playAgain();

    public Player playerBuilder(Membership membership);

    public Boolean isTurn();
}
