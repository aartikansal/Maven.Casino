package io.zipcoder.casino.GameClasses.DiceGames;

import io.zipcoder.casino.CasinoClasses.ConsoleInput;
import io.zipcoder.casino.CasinoClasses.ConsoleOutput;
import io.zipcoder.casino.CasinoClasses.Membership;
import io.zipcoder.casino.GameClasses.Game;
import io.zipcoder.casino.Player.OU7Player;
import io.zipcoder.casino.Player.Player;
import java.util.*;


    public class OU7 implements Game, ConsoleInput, ConsoleOutput {


            Dice pairOfDice = new Dice(2);
            OU7Player ou7Player1;

            Integer gameBalance = ou7Player1.getBalance();

            private static final Set<String> s = Collections.unmodifiableSet(new HashSet<String>(Arrays.asList("Y", "y", "N", "n")));
            private Integer betAmount;
            private String actualGuess;

            public Player playerBuilder(Membership accountDetails) {

                ou7Player1 = new OU7Player(accountDetails);
                return ou7Player1;
            }


            public void startGame(Membership membership) {
                playerBuilder(membership);
                do {
                    System.out.println("Welcome to Over/Under 7");
                    //  System.out.println("Your balance is: $%d" + ou7Player1.getBalance());
                    //  System.out.println("Enter your bet amount");
//                this.betAmount = betAmount;
                    Scanner in = new Scanner(System.in);
                    Integer betAmount = Integer.valueOf(in.nextLine());
                    System.out.println("Enter your bet type - Over/Under 7");
                    Scanner playerInput = new Scanner(System.in);
                    String playerGuess = playerInput.nextLine();
                    actualGuess = playerGuess;
                }while (!quitGame());
            }

            public Boolean evaluateGuessToRoll(Dice rolledDice, String playerGuess) {

                Integer thisTurnsRoll = rolledDice.rollAndSum(pairOfDice);
                if (actualGuess.equals("Over") && thisTurnsRoll > 7) {
                    System.out.println("Congrats! You win");
                   // gameBalance += betAmount;
                    return true;
                } else if (actualGuess.equals("Under") && thisTurnsRoll < 7) {
                    // gameBalance += betAmount;
                    System.out.println("Congrats! You win");
                    return true;
//                  }else if(actualGuess.equals("Equals")&&thisTurnsRoll==7){
//                  return true;
                } else {
                   // gameBalance -= betAmount;
                    System.out.println("Sorry. You lose");
                    return false;
                }
            }


        public Boolean quitGame() {

                System.out.println("Do you want to quit? Y/N");
                Scanner in = new Scanner(System.in);
                String res = in.nextLine().toUpperCase();
                if (res == "Y"){
                //  ou7Player1.setBalance(gameBalance);
                return true;
            }
                else
                    return false;
        }


            public Boolean win() {

////      return true if(this instance of balance is > balance before the game)
//
//                if (evaluateGuessToRoll(, String playerGuess)){
//                    return true;
//                } else
                    return null;

            }

            public Boolean playAgain() {

                System.out.println("Do you want to play again? Y/N");
                Scanner in =  new Scanner(System.in);
                String res = in.nextLine().toUpperCase();
                if (res == "Y")
                    return true;
                else
                    return false;
            }


        public Boolean isTurn() {
                return null;
            }

            public String getNextPlay() {

                System.out.println("Enter your bet type - Over/Under 7");
                Scanner playerGuess = new Scanner(System.in);
                return String.valueOf(playerGuess);
            }

            public String displayGameState() {
                return null;
            }

            public String displayNextAction() {
                return null;
            }
        }
