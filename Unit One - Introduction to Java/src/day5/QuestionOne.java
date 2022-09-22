package day5;

public class QuestionOne {
    public static void main(String[] args) {
        double price = 985;
        double tax = 1.055;

        price *= tax;

        System.out.println("The total price is: $" + Math.round(price*100.0)/100.0);
    }
}
