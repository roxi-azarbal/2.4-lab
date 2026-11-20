import java.util.Scanner;

public class RPSGame {
    private Player player;
    private Player computer;

    public RPSGame(Player player, Player computer) {
        this.player = player;
        this.computer = computer;
    }

    public Player getPlayer() {
        return player;
    }

    public Player getComputer() {
        return computer;
    }

    public String winner() {
        if (player.getChoice().equals(computer.getChoice())) {
            return "tie";
        }

        if (RPSRules.beats(player.getChoice(), computer.getChoice())) {
            return player.getName();
        }

        return computer.getName();
    }

    public static int readRounds(Scanner input) {
        System.out.println("How many rounds?");
        String rounds = input.nextLine();
        return Integer.parseInt(rounds);
    }

    public void readChoice(Scanner input) {
        boolean valid = false;

        while (!valid) {
            System.out.println("Rock, paper, or scissors?");
            String typed = input.nextLine();
            valid = player.choose(typed);
        }
    }

    // stretch:

    public String describeOutcome() {
        String mine = player.getChoice();
        String theirs = computer.getChoice();

        if (RPSRules.beats(mine, theirs)) {
            return mine + " beats " + theirs + ", you win!";
        }

        if (RPSRules.beats(theirs, mine)) {
            return theirs + " beats " + mine + ", you lose!";
        }

        return "both chose " + mine + ", tied!";

    }

    public static int readRoundsChecked(Scanner input) {
        while (!input.hasNextInt()) {
            input.next();
        }

        int rounds = input.nextInt();
        input.nextLine();

        return rounds;
    }
}
