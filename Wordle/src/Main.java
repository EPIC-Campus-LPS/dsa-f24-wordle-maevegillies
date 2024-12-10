
public class Main {
    public static void main(String[] args) {
        /**
         * This creates a new instance of PlayWordle and sets that to game
         * The program first asks the user for input then print out the user guess
         * after that, the guesses go into a loop anc main checks whether the output equals "*****" (because that means the user's answer is right)
         */
        PlayWordle game = new PlayWordle();
        game.stepGame();
        String userAnswer = game.checkGuess();
        System.out.println(userAnswer);

        int counter = 0;
        int i = 0;
        for (i = 0; i < 6; i++){
            counter ++;
            if (game.checkGuess().equals("*****")) {
                System.out.println("yay! you won");
                break;
            } else if (counter == 6) {
                System.out.print("you lost!!!! The word was ");
                System.out.print(game.DisplaySecretWord());
                break;
            } else {
                game.stepGame();
                System.out.println(game.checkGuess());
            }
        }
    }
}