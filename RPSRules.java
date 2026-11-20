public class RPSRules {
    public static boolean isValidChoice(String choice) {
        if (choice == null) {
            return false;
        }

        return (choice.equals("rock") || choice.equals("paper") || choice.equals("scissors"));
    }

    public static String randomChoice() {
        int choice = (int) (Math.random() * 3);

        if (choice == 0) {
            return "rock";
        } else if (choice == 1) {
            return "paper";
        } else {
            return "scissors";
        }
    }

    public static boolean beats(String mine, String theirs) {
        // if((mine.equals("rock") && theirs.equals("rock")) || (mine.equals("paper") &&
        // theirs.equals("paper")) || (mine.equals("scissors") &&
        // theirs.equals("scissors"))){
        // return false;
        // }

        return ((mine.equals("rock") && theirs.equals("scissors"))
                || (mine.equals("scissors") && theirs.equals("paper"))
                || (mine.equals("paper") && theirs.equals("rock")));
    }

    // stretch:

}
