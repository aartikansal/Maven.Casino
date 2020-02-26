package io.zipcoder.casino.CasinoClasses;


import io.zipcoder.casino.GameClasses.Game;
import io.zipcoder.casino.Player.Player;

import java.util.HashMap;

public class Casino implements Game {
    String CasinoName = "";
    //HashMap<String, Double> Players;

    public Casino(String CasinoName) {
        this.CasinoName = CasinoName;
    }

    public Game chooseGame(String strGame) {
        return null;
    }

    public void keepPlaying(String strKeepPlaying) {
    }

    public void exitCasino(String strExitCasino) {
    }

    public void cashOut(String strCashOut) {
    }

    public boolean checkMemberShip(Integer intMemberShip) {
        return true;
    }

    public Membership createMembership(String name, Integer idNumber, Integer balance, Integer age) {
        return null;
    }

    public Storage getMemberships(){
        return null;
    }

    public void setMemberShips() {

    }

    public void displayMemberships(){

    }

    public void startGame() {
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

    public static void main(String[] args) {
        // write your tests before you start fucking with this
    }

    public Integer checkPlayerAge(Player player) {
        return null;
    }




}
