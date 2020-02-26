package io.zipcoder.casino.Player;

import io.zipcoder.casino.CasinoClasses.Membership;

public class OU7Player extends Player{
    String playerName = "";
    Integer balance = 0;
    Integer age;
    Membership playerAccount;

    public OU7Player(Membership playerAccount){
        this.playerName = playerAccount.getName();
        this.balance = playerAccount.getBalance();
        this.age = playerAccount.getAge();
        this.playerAccount = playerAccount;
    }
<<<<<<< HEAD

    public Integer getBalance() {
        return balance;
    }


    public void setBalance(Integer amountToAdd) {
        this.balance += amountToAdd;
    }
}

=======
}
>>>>>>> e21ac28a99e8a8e9aa29a27d711519ff766529a7
