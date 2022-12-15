package assignments;

import java.util.Scanner;


public class GoFish {
    static Scanner in = new Scanner(System.in);

    private static final int NUM_SUITS = 4;
    private static final String HEARTS = "H";
    private static final String CLUBS = "C";
    private static final String SPADES = "S";
    private static final String DIAMONDS = "D";
    private static final int NUM_VALUES = 13;
    private static final String JACK = "J";
    private static final String ACE = "A";
    private static final String QUEEN = "Q";
    private static final String KING = "K";

    public static void main(String[] args) {
        boolean stillPlaying = true;
        String player = dealCards();
        String computer1 = dealCards();
        String computer2 = dealCards();
        String computer3 = dealCards();
        String temp = "";

        int scorePlayer = 0;
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;

        System.out.println("-------------GO FISH--------------");
        System.out.println("-- each player is dealt 5 cards --");
        System.out.println("-- automatic pairs get removed  --");

        while(stillPlaying) {

            if (scorePlayer >= 10 || score1 >= 10 || score2 >= 10 || score3 >= 10){
                stillPlaying = false;
            }
         
            //Removes the pair and returns the updated cards with score atached at the end
            player = checkCards(player);
            computer1 = checkCards(computer1);
            computer2 = checkCards(computer2);
            computer3 = checkCards(computer3);

            //Takes the string returned from checkCards and updates the score
            scorePlayer += getScore(player);
            score1 += getScore(computer1);
            score2 += getScore(computer2);
            score3 += getScore(computer3);

            //Takes the string returned from checkCards and updates it
            player = updateCards(player, true);
            computer1 = updateCards(computer1, true);
            computer2 = updateCards(computer2, true);
            computer3 = updateCards(computer3, true);

            //Displays the cards to the screen
            displayCards(player, scorePlayer, false, "player: ");
            displayCards(computer1, score1, true, "computer 1: "); //change back to true later
            displayCards(computer2, score2, true, "computer 2: ");
            displayCards(computer3, score3, true, "computer 3: ");

            //player turn
            temp = playHand(player, computer1, computer2, computer3, false, 0);
            player += " " + updateCards(temp, true); //remove card they gained if they got a match so other computers cant ask
            player = checkCards(player);
            scorePlayer += getScore(player);
            stillPlaying = checkScore(scorePlayer, "player ");
            player = updateCards(player, true);

            //find out which computer player the updated hand is for. 
            if(temp.substring(temp.length()-1, temp.length()).equals("1")){
                  computer1 = updateCards(temp, false);
            }
            else if(temp.substring(temp.length()-1, temp.length()).equals("2")){
                 computer2 = updateCards(temp, false);
            }
            else if(temp.substring(temp.length()-1, temp.length()).equals("3")){
                  computer3 = updateCards(temp, false);
            }

            if(stillPlaying){

            //computer 1 turn --> error occurs when i do not check if string is now empty
            temp = playHand(player, computer1, computer2, computer3, true, 1);
            computer1 += " " + updateCards(temp, true);
            computer1 = checkCards(computer1);
            score1 += getScore(computer1);
            stillPlaying = checkScore(score1, "computer1 ");
            computer1 = updateCards(computer1, true);

            // find out which player the updated hand is for. 
             if(temp.substring(temp.length()-1, temp.length()).equals("1")){
                 player = updateCards(temp, false);
            }
            else if(temp.substring(temp.length()-1, temp.length()).equals("2")){
                 computer2 = updateCards(temp, false);
            }
            else if(temp.substring(temp.length()-1, temp.length()).equals("3")){
                 computer3 = updateCards(temp, false);
            }

            if(stillPlaying){

            //computer 2 turn
            temp = playHand(player, computer1, computer2, computer3, true,2);
            computer2 += " " + updateCards(temp, true);
            computer2 = checkCards(computer2);
            score2 += getScore(computer2);
            stillPlaying = checkScore(score2, "computer2 ");
            computer2 = updateCards(computer2, true);

            // find out which player the updated hand is for. 
            if(temp.substring(temp.length()-1, temp.length()).equals("1")){
                 player = updateCards(temp, false);
            }
            else if(temp.substring(temp.length()-1, temp.length()).equals("2")){
                 computer1 = updateCards(temp, false);
            }
            else if(temp.substring(temp.length()-1, temp.length()).equals("3")){
                 computer3 = updateCards(temp, false);
            }
        }
        if(stillPlaying){
            
            //computer 3 turn 
            temp = playHand(player, computer1, computer2, computer3, true, 3);
            computer3 += " " + updateCards(temp, true);
            computer3 = checkCards(computer3);
            score3 += getScore(computer3);
            stillPlaying = checkScore(score3, "computer3 ");
            computer3 = updateCards(computer3, true);

            // find out which player the updated hand is for. 
            if(temp.substring(temp.length()-1, temp.length()).equals("1")){
                 player = updateCards(temp, false);
            }
            else if(temp.substring(temp.length()-1, temp.length()).equals("2")){
                 computer1 = updateCards(temp, false);
            }
            else if(temp.substring(temp.length()-1, temp.length()).equals("3")){
                 computer2 = updateCards(temp, false);
            }
        }
    }
    if(stillPlaying == false) {
    boolean reset = playAgain();
        if(reset){
            stillPlaying = true;
            player = dealCards();
            computer1 = dealCards();
            computer2 = dealCards();
            computer3 = dealCards();
            scorePlayer = 0;
            score1 = 0;
            score2 = 0;
            score3 = 0;
            temp = "";
            System.out.println("-------------GO FISH--------------");
            System.out.println("-- each player is dealt 5 cards --");
            System.out.println("-- automatic pairs get removed  --");
        }
    }
        }
    }

    private static boolean playAgain() {
        while (true) {
            System.out.print("Play Again ([Y]es/[N]o): ");
            String result = in.nextLine().toLowerCase();
   
            if (result.equals("y") || result.equals("yes"))
               return true;
            else if (result.equals("n") || result.equals("no"))
               return false;
         }
    }

    private static boolean checkScore(int score, String label) {
        if(score < 10){
            return true;
        }
        else {
            System.out.println(label + "has won the game!");
            System.out.println("--------------");
            System.out.println("|  CONGRATS! |");
            System.out.println("|     1st    |");
            System.out.println("|            |");
            System.out.println("--------------");


            return false;
            
        }

    }

    private static String playHand(String player, String computer1, String computer2, String computer3, boolean isComputer, int computerNum) {
        String newHand = "";
        if(!isComputer){
            String request = playerRequest(player);
            if(request.equals("1")){
                newHand = playerTurn(player, computer1, "player: ");
            }
            else if(request.equals("2")){
                newHand = playerTurn(player, computer2, "player: ");
            }
            else if(request.equals("3")){
                newHand = playerTurn(player, computer3, "player: ");
            }
            return newHand.trim() + "~" + request;

        } else {
        if (computerNum == 1) {
            newHand = computerTurn(computer1, player, computer2, computer3, "computer1: ");
        }

        else if (computerNum == 2){
            newHand = computerTurn(computer2, player, computer1, computer3, "computer2: ");
        }

        else if(computerNum == 3){
            newHand = computerTurn(computer3, player, computer1, computer2, "computer3: ");
        }
        return newHand.trim();
    }

    }

    private static String computerTurn(String hand, String player1, String player2, String player3, String label) {
      String cardRequest = hand.substring(0,1);
      if(cardRequest.equals("1")){
        cardRequest = "10";
      }
      int playerRequest = (int)(Math.random()*3) + 1;
      String player = "";
      String newCard = "";
      int index = 0;
      if(playerRequest == 1){
        System.out.println("--> " + label + "asks you for a " + cardRequest);
        index = player1.indexOf(cardRequest);
        newCard = checkRequest(index, cardRequest, player1, label);
        if(index >= 0){
            player1 = removeCard(player1, newCard); //the updated computer string
            if(player1.length() < 1){
                player1 = dealCards();
              }
            }
        player = player1;
      }
      else if(playerRequest == 2){
        System.out.println("--> " + label + "asks for a " + cardRequest);
        index = player2.indexOf(cardRequest);
        newCard = checkRequest(index, cardRequest, player2, label); //checkRequest gives extra suit
        if(index >= 0){
            player2 = removeCard(player2, newCard); //the updated computer string
            if(player2.length() < 1){
                player2 = dealCards();
              }
            }
        player = player2;
      }
      else if(playerRequest == 3){
        System.out.println("--> " + label + "asks for a " + cardRequest);
        index = player3.indexOf(cardRequest);
        newCard = checkRequest(index, cardRequest, player3, label);
        if(index >= 0){
            player3 = removeCard(player3, newCard); //the updated computer string
            if(player3.length() < 1){
                player3 = dealCards();
              }
            }
        player = player3;
      }


        return newCard + "~" + player + "~" + playerRequest;
    }

    private static String checkRequest(int index, String card, String asked, String label) {
        String result = "";
        String suit = "";
        if(index >= 0){
            if(card.equals("10")){
                suit = asked.substring(index + 1, index + 3);
            }
            else {
            suit = asked.substring(index + 1, index + 2);
            }
            result += card + suit;
        }
        else{
            result += goFish(label);
        }

        return result;
    }

    private static String playerTurn(String player, String computer, String label) {
        String requestedCard = cardRequest(player);
        int index = computer.indexOf(requestedCard);
        String newCard = checkRequest(index, requestedCard, computer, label);
        if(index >= 0){
        computer = removeCard(computer, newCard); //the updated computer string
        }

        System.out.println("--> You picked up an " + newCard);
            return " " + newCard + "~" + computer;

        }
        
        



    private static String removeCard(String hand, String card) {
        String compareCard = "";
        String result = "";
        hand = cleanTens(hand, true);
        for(int j = 0; j < hand.length() - 1; j += 3){
            compareCard = hand.substring(j, j+2);
            if(card.equals(compareCard))
                result = hand.substring(0,j).trim() + " " + hand.substring(j + 2).trim();
        }
        result = cleanTens(result, false);
        return result.trim();
    }



    private static String goFish(String label) {
        if(label.equals("player: ")){
        System.out.println("--> You had to GO FISH!");
        }
        else {
        System.out.println("--> " + label + "had to GO FISH!");
        }
        return getValue() + getSuit();
    }




    private static String cardRequest(String player){
        boolean validInput = false;
        String cardRequest = "";
        System.out.print("Please ask for a card: ");
        cardRequest = (in.nextLine()).toUpperCase();

        while(!validInput){
            cardRequest = cardRequest.substring(0,1);
            if(player.indexOf(cardRequest) >= 0) {
                validInput = true;
            } else{
            System.out.print("Please ask for a VALID card: ");
            cardRequest = (in.nextLine()).toUpperCase();
            }
            
        }

        return cardRequest;

    }
    //Gets what person the player wants to ask and the card they are looking for
    private static String playerRequest(String player) {
        boolean validPlayer = false;
        String playerNum = "";
        while(!validPlayer){
            System.out.print("Which computer (1, 2, or 3) would you like to ask? ");
            playerNum = in.nextLine();
            playerNum = playerNum.substring(0,1);
            if(!("123".indexOf(playerNum) < 0)){
                validPlayer = true;
            }
        }
        return playerNum;
    }

    private static String updateCards(String player, boolean atFront) {
        String result = "";
        int index = 0;
        index = player.indexOf("~");
        if(atFront){
            result = player.substring(0, index);
        }
        else {
            result = player.substring(index + 1, player.lastIndexOf("~")); //error occurs here things like 2C~2
        }
        if(result.length() < 1){
            result = dealCards();
        }
        return result;
    }

    private static int getScore(String player) {
        int score = 0;
        score = Integer.parseInt(player.substring(player.indexOf("~")+1));
        return (score/2); //1 point per match so need to divide by 2
    }

    private static String removeCards(String hand, String card) {
        String compareCard = "";
        int matches = 0;
        String result = "";
        for(int j = 0; j < hand.length() - 1; j += 3){
            compareCard = hand.substring(j, j+1);
            if(card.equals(compareCard) && matches != 2)
                matches++;
            else {
                result += hand.substring(j,j+2) + " ";

            }
        }
        if(result.length() > 1) {
        result = result.substring(0,result.length()-1); //remove last space
        }

        if (matches > 1)
            return result;
        else
            return hand;
       

    }

    //cleanTens will fix the string by taking out the 0 or adding the 0 as needed
    private static String cleanTens(String cards, boolean isRemove) {
        if(isRemove){
            for(int k = 0; k < cards.length(); k += 1){
                    if (cards.substring(k, k + 1).equals("0")){
                        cards = cards.substring(0, k) + cards.substring(k + 1, cards.length()); 
                    }
                }   

        } else{
            for(int k = 0; k < cards.length(); k += 1){
                if (cards.substring(k, k + 1).equals("1")){
                    cards = cards.substring(0, k) + "10" + cards.substring(k + 1, cards.length()); 
                }
            }
        }
        
        return cards;
}

    private static String checkCards(String cards) {
        String currCard = "";

        int points = 0;

        if(cards.length() < 1){
            return dealCards();
        }
        
        else {
        //take out the 0 in the 10s
        cards = cleanTens(cards, true); 

        for(int i = 0; i < cards.length() - 1; i += 3){
            currCard = cards.substring(i,i+1);
            String temp = removeCards(cards, currCard); 
            if (!(cards.length() == (temp.length()))) {
                points += ((cards.length() - temp.length())-2)/2;
                cards = temp;
                i-=3;
            }
            //check length that is the same, if not i-6 (bc it will add 3 at the end, so its like minusing 3), if it is increment by 3
        }

        //reinsert the 0 for the 10s
        cards = cleanTens(cards, false);

        return cards + "~" + points;
    }
}


    private static void displayCards(String cards, int points, boolean isHidden, String label) {
        String result = "";
        int count = 0;
        cards = cleanTens(cards, true);
        for(int i = 0; i < cards.length(); i += 3){
            count++; 
        }
        cards = cleanTens(cards, false);
        if (isHidden) { //returns the hidden cards (e.g. computer1: XX XX XX...)
            result += label + "(" + points + ") ";
            for(int i = 0; i < count; i ++) {
            result += "XX ";
            }
        }
        else
           result += label + "(" + points + ") " + cards;
  
        System.out.println(result);
    }

    private static String dealCards() {
        String cards = "";
        for (int i = 0; i < 5; i++) {
        cards += getValue() + getSuit();
        if(i < 4)
        cards += " ";
        }
        return cards;
    }

    private static String getSuit() {
        int iSuit = (int) (Math.random() * NUM_SUITS) + 1;
        if (iSuit == 1)
           return HEARTS;
        else if (iSuit == 2)
           return SPADES;
        else if (iSuit == 3)
           return CLUBS;
        else
           return DIAMONDS;
    }

    private static String getValue() {
        int iValue = (int) (Math.random() * NUM_VALUES) + 1;

        if (iValue == 1)
           return ACE;
        else if (iValue == 11)
           return JACK;
        else if (iValue == 12)
           return QUEEN;
        else if (iValue == 13)
           return KING;
        else
           return "" + iValue;
    }
    
}
