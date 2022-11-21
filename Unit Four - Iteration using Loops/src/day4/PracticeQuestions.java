package day4;

public class PracticeQuestions {
    public static void main(String[] args) {
        // boolean rsvp = true;
        // String option1 = "";
        // int selection = 2;
        String str = "CERRAR";

    str = str.toUpperCase();
    String currStreak = " ";
    String longestStreak = "";
    if(str.length() == 1){
        System.out.println(str + 1);
    }
    
    for(int i = 0; i < str.length() - 1 && str.length() > 1; i++){
        if(i > 0 && str.substring(i, i + 1).equals(str.substring(i-1,i))){
            currStreak += str.substring(i, i + 1);
        }
        else if (i > 0 && !(str.substring(i, i + 1).equals(str.substring(i-1,i)))){
            currStreak = str.substring(i, i + 1);
        }
        if (currStreak.length() > longestStreak.length()){
            longestStreak = currStreak;
        }
    }
    System.out.println(longestStreak.substring(0,1) + " " + longestStreak.length());


}

}


