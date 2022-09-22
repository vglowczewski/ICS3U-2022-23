package day5;

public class QuestionFive {
    public static void main(String[] args) {
        int gamesWon = 110;
        int gamesLost = 44;
        int gamesTotal = gamesWon + gamesLost;

        double winPercentage = (double)gamesWon/gamesTotal;
        winPercentage = Math.round(winPercentage*1000.0)/1000.0;
    
        System.out.println("The win percentage is: " + winPercentage);
    }
}
