package day5;

public class QuestionFour {
    public static void main(String[] args) {
        double light = 3*Math.pow(10,8);
        int second = 1;
        int min = second * 60;
        int hour = min * 60;
        int day = hour * 24;
        int year = day * 365;

        double lightyear = light*year;

        System.out.println("The lightyear is: " + lightyear);
    
    }
}
