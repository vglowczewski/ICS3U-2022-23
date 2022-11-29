package projectexamples;

import java.util.Scanner;

public class Hangman {
    static Scanner in = new Scanner (System.in);
    static final String VALID_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static final int MAX_BODY_PARTS = 7;

    /*
     * Add the following:
     * 1. The ability to choose a letter or guess the answer
     * 2. If they guess wrong add 1 to numWrong
     * 3. If they get it write say they win
     */
    public static void main(String[] args) {
        String phrase = getPhrase();
        String guessedLetters = "";
        int numWrong = 0;
        boolean rightGuess = false;
        
        while(numWrong < MAX_BODY_PARTS && !rightGuess) {

        displayDecodedMessage(phrase,guessedLetters);

        boolean tryGuess = promptUser();

        if(tryGuess){
            String guess = getGuess();
            if(guess.equals(phrase)){
                System.out.println("You win! CONGRATS");
                rightGuess = true;
            }
            else {
                numWrong++;
                drawHangman(numWrong);
            }
        } 
        else {
            if(!tryGuess) {
            String letter = getLetter(guessedLetters);
            guessedLetters += letter;
            
            if(phrase.indexOf(letter) < 0) {
            numWrong++;
            drawHangman(numWrong);
            }
        }
    }

    }

    }

    private static String getGuess() {
        String guess = "";
        boolean validInput = false;

        while(!validInput) {
            System.out.println("Please enter your guess: ");
            guess = in.nextLine().toUpperCase();
            validInput = true;
            for (int i = 0; i < guess.length(); i++){
                String letter = guess.substring(i, i + 1);
                if ((VALID_LETTERS + " ").indexOf(letter) < 0)
                    validInput = false;
            } 
        }

        return guess;
        

    }

    private static boolean promptUser() {

        while (true) {
        System.out.println("Would you like to guess the answer? (y[es]/n[o])");
        String result = in.nextLine().toLowerCase();

        if (result.equals("y") || result.equals("yes"))
           return true;
        else if (result.equals("n") || result.equals("no"))
           return false;
        else
            System.out.println("Please enter a valid input");
        }
    }

    private static String getLetter(String guessedLetters) {

        while(true){
            System.out.println("Please enter a letter: ");
            String letter = in.nextLine().toUpperCase();

            if(VALID_LETTERS.indexOf(letter) < 0)
                System.out.println("Please enter a valid letter (A-Z)");

            else if(guessedLetters.indexOf(letter) >= 0)
                System.out.println("You have already entered that letter");

            else
                return letter;

        }
    }

    private static void displayDecodedMessage(String phrase, String guessedLetters) {
        String result = "";
        for (int i = 0; i < phrase.length(); i++) {
            String letter = phrase.substring(i, i + 1);
            if(letter.equals(" "))
                result += "/ ";
            else if (guessedLetters.indexOf(letter) >= 0)
                result += letter + " ";
            else
                result += "_ ";
        }

        System.out.println(result);
    }

    private static String getPhrase() {
        boolean validInput = false;
        String phrase = "";
        while(!validInput) {
            System.out.println("Please enter a phrase (letters and spaces only)");
            phrase = in.nextLine().toUpperCase();
            validInput = true;
            for (int i = 0; i < phrase.length(); i++){
                String letter = phrase.substring(i, i + 1);
                if ((VALID_LETTERS + " ").indexOf(letter) < 0)
                    validInput = false;
            } 
        }

        return phrase;
    }

    private static void drawHangman(int numBodyParts) {
        if (numBodyParts == 0){
            System.out.println("__________");
            System.out.println("|        |");
            System.out.println("|         ");
            System.out.println("|         ");
            System.out.println("|         ");
            System.out.println("|         ");
            System.out.println("|         ");
            System.out.println("----------------");
        }
        else if(numBodyParts == 1){
            System.out.println("__________");
            System.out.println("|        |");
            System.out.println("|        o");
            System.out.println("|         ");
            System.out.println("|         ");
            System.out.println("|         ");
            System.out.println("|         ");
            System.out.println("----------------");
        }
        else if(numBodyParts == 2){
            System.out.println("__________");
            System.out.println("|        |");
            System.out.println("|        o");
            System.out.println("|        |");
            System.out.println("|         ");
            System.out.println("|         ");
            System.out.println("|         ");
            System.out.println("----------------");
        }
        else if(numBodyParts == 3){
            System.out.println("__________");
            System.out.println("|        |");
            System.out.println("|        o");
            System.out.println("|       /|");
            System.out.println("|         ");
            System.out.println("|         ");
            System.out.println("|         ");
            System.out.println("----------------");
        }
        else if (numBodyParts == 4){
            System.out.println("__________");
            System.out.println("|        |");
            System.out.println("|        o");
            System.out.println("|       /|\\");
            System.out.println("|         ");
            System.out.println("|         ");
            System.out.println("|         ");
            System.out.println("----------------");
        }
        else if (numBodyParts == 5){
            System.out.println("__________");
            System.out.println("|        |");
            System.out.println("|        o");
            System.out.println("|       /|\\");
            System.out.println("|        |");
            System.out.println("|         ");
            System.out.println("|         ");
            System.out.println("----------------");
        }
        else if (numBodyParts == 6){
            System.out.println("__________");
            System.out.println("|        |");
            System.out.println("|        o");
            System.out.println("|       /|\\");
            System.out.println("|        |");
            System.out.println("|      _/");
            System.out.println("|         ");
            System.out.println("----------------");
        }
        else if (numBodyParts == 7){
            System.out.println("__________");
            System.out.println("|        |");
            System.out.println("|        o");
            System.out.println("|       /|\\");
            System.out.println("|        |");
            System.out.println("|      _/ \\_");
            System.out.println("|         ");
            System.out.println("----------------");
        }
    }
}
