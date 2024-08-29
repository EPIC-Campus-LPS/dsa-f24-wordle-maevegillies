# Lab 2

## Objective

1. Complete a programming project using Java. You may choose to complete **Wordle or Game of Life** based on the briefs below.
2. Use IntelliJ to upload your project to GitHub

---
## Option 1: Wordle

### Objective

1. Complete the program to implement your own version Wordle that runs in the terminal
2. Practice creating classes and objects, utilizing a `main` method to run your program, and leverage input/output functions to implement your game
3. Use industry tools like IDEs and Git to develop your code
### Getting Started

1. Create a GitHub account using your personal mail address and connect it to IntelliJ under the VCS menu. 
2. Connect your GitHub account to the GitHub Classroom via the Git & GitHub assignment in Google Classroom.
3. Pull the GitHub Repository from GitHub Classroom for the starter code.
4. Upload your assignment to GitHub when you are done and mark 'As Complete' on Google Classroom.
### Game Implementation

1. Consider a guessing game in which a player tries to guess a hidden 5-letter word. This hidden word is guessable by the player using the terminal. A guess contains only lowercase letters and has 5 letters. 
2. After each guess is made, the player is given a hint that is based on a comparison between the hidden word and the guess. Each position in the hint contains a character that corresponds to the letter in the same position as the guess. The following rules determine the characters that appear in the hint.
	1. If the letter in the guess is in the same position in the hidden word, the corresponding character in the hint is the matching letter
	2. If the letter in the guess is in the hidden word but a different position, the corresponding character in the hint is a `+`
	2. If the letter in the guess is not the hidden work, the corresponding character in the hint is a  `*`
3. The player is also given a list of possible letters than may be in the word.  When a letter is guessed that does not appear in the word, it will be removed from the list of possible letters.
4. The player will have 6 opportunities to guess the hidden word. If the player does not correctly guess the word after 6 guesses, the hidden word will be revealed.
5. This game will be playable via the terminal. The details of the terminal program will be explained below.

### Project Details

This project will consist of two files, `PlayWordle.java` and `Wordle.java`. You will complete the `PlayWordle` and `Wordle` classes and the methods detailed below.

#### `PlayWordle` Class

**Methods**

- ```public static void main(String[] args)```
	- Gets a list of words using `getWords()` and randomly selects one to be the hidden word.
	- Creates an instance of `Wordle`. This is the instance of `Wordle` you will interact with to manage the game.
	- Runs the terminal program to take user input for each of the guesses and prints out the resulting hints.
	- This method will end the game after 6 guesses
	- *Hint: you will need to use the `Scanner` and `Math` classes*
- ```public static String[] getWords()```
	- Reads in a list of words from the file `words1000.txt`
		- `words1000.txt` contains a list of 1000 five letter words. Each word is on its own line.
	- Returns the contents of the file as an array of `Strings`
		- Each `String` should be a 5 letter word
	- *Hint: you will need to use the `Scanner` and `File` classes*
#### `Wordle` Class

**Variables**

- ```private String secretWord```
	- The secret word for this game of Wordle
- ```private String letters```
	- A list of possible letters that could be in the secret word. As guesses are made using incorrect letters, letters are removed from this `String`.

**Methods**

- ```public Wordle(String word)```
	- Initializes a Wordle object, and all of the class instance variables
	- Takes a parameter ```word``` which is the secret word for this game
- ```public boolean guessCorrect(String guess)```
	- Compares the user's guess with the `secretWord`
	- Takes a parameter  which is the user's guess
	- Returns true if the guess matches the secret word and false if not
- ```public String getHint(String guess)```
	- Takes the user's guess and compares it with the `secretWord`. Creates a new `String` indicating correct letters, out of place letters and incorrect letters
	- This method returns the hint `String`
	- This method also updates the list of possible letters 
- ```public getSecretWord()```
	- Returns the secret word
- ```public getLetters()```
	- Returns the list of letters

### Sample Terminal Output

![Pasted image 20230821122642](https://github.com/user-attachments/assets/10d5018e-f9f2-4a69-98a6-9dbbf8a065e2)

### Deliverables

- Your Java project with a completed `PlayWordle.java` and `Wordle.java` file. Include in-line comments to explain your work
- If you use outside resources, cite them in your code. Add a comment explaining how you used the resource and a link. Consult the [MIT Code Citation Guidelines](https://integrity.mit.edu/handbook/writing-code) for examples.


### Rubric

*Course Content*

- 6 points - All required items are present. 
- 5 points - Task was completed, but supplementary materials are weak or missing.
	- Code was uncommented. 
	- Solution is correct but is significantly difficult to read, highly inefficient, very clumsy, very difficult to extend etc. From the original Jargon File, we would refer to solutions like this as *kluge*.
	- Project succeeded on most test cases, but failed in some edge cases.
	- Reflection questions related to content were incorrect.
- 4 points - Task was attempted, but is missing major components. 
	- Coding prompt was only partially completed.
	- Project does not perform solution as described and failed multiple test cases.
	- Some deliverables are missing.
- 3 points - Did not attempt or student should reattempt. 
	- Inappropriate use of AI tools
