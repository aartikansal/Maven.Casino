package io.zipcoder.casino.Player;

<<<<<<< HEAD
public class BlackJackPlayer extends Player implements GamblerAttributes {

    public Integer placeBet() {
        return null;
=======
import io.zipcoder.casino.CasinoClasses.Membership;
import io.zipcoder.casino.GameClasses.GamblingGame;

public class BlackJackPlayer extends CardPlayer implements GamblerAttributes{
        String playerName = "";
        Integer balance = 0;
        Integer age;
        Membership playerAccount;

    public BlackJackPlayer(Membership playerAccount){
            this.playerName = playerAccount.getName();
            this.balance = playerAccount.getBalance();
            this.age = playerAccount.getAge();
            this.playerAccount = playerAccount;
    }

    public Integer placeBet(){
        Integer betPlaced = 0;

        return betPlaced;
>>>>>>> 3d89be157c459f0324f0deb2dd977a3df1e7c5ad
    }
}

