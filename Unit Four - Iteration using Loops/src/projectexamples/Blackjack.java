package projectexamples;

import java.util.Scanner;


public class Blackjack {

    static Scanner in = new Scanner(System.in);

    static final int STARTING_WALLET = 500;
    static final int MIN_BET = 5;
    static final int NUM_SUITS = 4;

    static final String HEARTS = "H";
    static final String CLUBS = "C";
    static final String SPADES = "S";
    static final String DIAMONDS = "D";

    static final double NUM_FACES = 13;

    static final String ACE = "A";
    static final String JACK = "J";
    static final String QUEEN = "Q";
    static final String KING = "K";
    
    public static void main(String[] args) {
        String playerHand;  // ex. AC 5D JS
        String dealerHand; // 7C (single card until they actually play)

        boolean isPlaying = true;
        int wallet = STARTING_WALLET;

        while (isPlaying) {
        int bet = getBet(MIN_BET, wallet); //minimum bet of 5
        playerHand = getCard() + " " + getCard();
        dealerHand = getCard();
        displayHand(playerHand, true);
        displayHand(dealerHand, false);
        
        wallet += playHand(playerHand, dealerHand, bet);

        if (wallet < MIN_BET) {
            System.out.println("Sorry you cannot play!");
            isPlaying = false;
        } else {
            isPlaying = promptPlayAgain();
        }
    }


    }
    private static boolean promptPlayAgain() {
        boolean validAnswer = false;

        while (!validAnswer){
            System.out.println("Play Again ([y]es/[n]o)?");
            String answer = in.nextLine().toLowerCase();
            if(answer.equals("yes") || answer.equals("y")){
                return true;
            }
            else if (answer.equals("no") || answer.equals("n"))
                return false;
        }

        return true;
    }

    // returns the amount the player won, negative value if they lost. 
    private static int playHand(String playerHand, String dealerHand, int bet) {
        return 0;
    }

    private static void displayHand(String cards, boolean isPlayer) {
        if (isPlayer) 
            System.out.println("Player Cards: " + cards);
        else 
            System.out.println("Dealer Cards: XX " + cards);
    }

    private static String getCard() {
        return getFace() + getSuit();
    }

    private static String getSuit() {
        int iSuit = (int)(Math.random() * NUM_SUITS) + 1;

        if(iSuit == 1)
            return HEARTS;
        else if (iSuit == 2)
            return CLUBS;
        else if (iSuit == 3)
            return SPADES;
        else 
            return DIAMONDS;
    }
    private static String getFace() {
        int iFace = (int) (Math.random() * NUM_FACES) + 1;

        if(iFace == 1)
            return ACE;
        else if(iFace == 11)
            return JACK;
        else if (iFace == 12)
            return QUEEN;
        else if (iFace == 13)
            return KING;
        else 
            return "" + iFace;
    }
    private static int getBet(int minBet, int maxBet) {
        int bet = 0;
        boolean validBet = false;
        while(!validBet) { //while loop will end (stop asking) when validBet is passed in
            System.out.print("Please enter a bet (Min: $" + minBet + "): ");
            try{ //try the code inside
                bet = Integer.parseInt(in.nextLine());
                if (bet >= minBet && bet <= maxBet)
                    validBet = true;
            } catch(NumberFormatException ex) { //catch the error and do something about it
                System.out.println("Invalid Input");
            }
        }

        return bet;
    }
}
