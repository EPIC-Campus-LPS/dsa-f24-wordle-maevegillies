/**
 * The PlayWordle class holds the logic and different aspects of the game, like the user input and the secret word
 */

/**
 * import libraries
 */
import java.util.Scanner;
import java.util.Random;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.IOException;

public class PlayWordle {
    /**
     * Declares userInput and secretWord as private objects so they aren't used outside the class
     */
    private String secretWord;
    private String userInput;

    /**
     * PlayWordle method reads the file "words1000.txt" using BufferedReader
     * The file reads in line by line and is stored in the array words
     */
    public PlayWordle() {
        try (BufferedReader br = new BufferedReader(new FileReader("words1000.txt"))) {
            ArrayList<String> phrases = new ArrayList<>();
            while (br.ready()) {
                phrases.add(br.readLine());
            } String[] words = phrases.toArray(new String[0]);

            /**
             * PlayWordle uses the Random class to randomly choose an index in words
             * Stores the word at that index to secretWord
             */
            Random random = new Random();
            int randomIndex = random.nextInt(words.length); //
            secretWord = words[randomIndex];
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This is used because secretWord is not directly accessible, so it needs to be returned in a new object so it can be used in main
     * @return secretWord to be used in main
     */
    public String DisplaySecretWord() {
        return secretWord;
    }

    /**
     * stepGame takes in the user's input and sets it to the userInput variable
     */
    public void stepGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter guess: ");
        userInput = scanner.nextLine();
        }

    /**
     * checkGuess compares each letter in secretWord to the userInput
     * The output of each comparison is stored in the output variable
     * @return output returns the final comparison of all 5 letters
     */
    public String checkGuess() {
        String output = "";

        for (int i = 0; i < 5; i++) {
            String letterC = secretWord.substring(i, i + 1);
            String letterU = userInput.substring(i, i + 1);
            if (letterC.equals(letterU)) {
                output = output + "*";
            } else if (secretWord.contains(letterU)) {
                output = output + "-";
            } else {
                output = output + "_";
            }
        }
        return output;
    }
}
