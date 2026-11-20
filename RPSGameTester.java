// REQ 13: answer after REQ 12
/*
 * In this lab, main makes one Scanner for the keyboard and passes it
 * to each method that reads. Why not have each method make its own
 * new Scanner(System.in)?
 * Answer:
 */

import java.util.Scanner;

public class RPSGameTester {
        public static void main(String[] args) {
                // TEST 02
                System.out.println("isValidChoice(\"rock\") (expect true): "
                                + RPSRules.isValidChoice("rock"));
                System.out.println("isValidChoice(\"Rock\") (expect false): "
                                + RPSRules.isValidChoice("Rock"));

                // TEST 03

                System.out.println("randomChoice (expect rock, paper, or scissors): "
                                + RPSRules.randomChoice());

                // TEST 04

                System.out.println("beats rock scissors (expect true): "
                                + RPSRules.beats("rock", "scissors"));

                System.out.println("beats rock paper (expect false): "
                                + RPSRules.beats("rock", "paper"));

                // TEST 05
                Player jordan = new Player("Jordan");
                Player computer = new Player("Computer");

                System.out.println("getName (expect Jordan): " + jordan.getName());
                System.out.println("getChoice (expect valid choice): " + computer.getChoice());

                // TEST 06
                System.out.println("choose PAPER (expect true): " + jordan.choose("paper"));
                System.out.println("getChoice (expect paper): " + jordan.getChoice());

                System.out.println("choose lizard (expect false): " + jordan.choose("lizard"));
                System.out.println("getChoice (expect paper): " + jordan.getChoice());

                // TEST 07
                jordan.choose("rock");
                System.out.println("toString (expect \"Jordan chose rock.\"): " + jordan);
                computer.choose("scissors");
                System.out.println("toString (expect \"Computer chose scissors.\"): " + jordan);

                // TEST 08
                RPSGame game = new RPSGame(jordan, computer);
                System.out.println("getPlayer (expect true): "
                                + (game.getPlayer() == jordan));
                System.out.println("getComputer (expect true): "
                                + (game.getComputer() == computer));

                // TEST 09
                jordan.choose("rock");
                computer.choose("scissors");

                System.out.println("winner (expect jordan): " + game.winner());

                jordan.choose("paper");
                computer.choose("paper");

                System.out.println("winner (expect tie): " + game.winner());

                // TEST 10
                Scanner roundsInput = new Scanner("3/n");

                System.out.println("readRounds() (expect 3): "
                                + RPSGame.readRounds(roundsInput)); // update

                // TEST 11
                Scanner choiceInput = new Scanner("lizard\n\nSCISSORS\nrock\n");

                game.readChoice(choiceInput);

                System.out.println("getChoice() (expect scissors): " + jordan.getChoice());
                System.out.println("nextLine() (expect rock): " + choiceInput.nextLine());

        }
}