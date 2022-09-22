package day5;

public class QuestionSeven {
    public static void main(String[] args) {
        double fahrenheit = 98.0;
        
        double celcius = (fahrenheit - 32)/1.8;

        System.out.println("The degrees in celcius is: " + Math.round(celcius*100)/100.0);
    }
}
