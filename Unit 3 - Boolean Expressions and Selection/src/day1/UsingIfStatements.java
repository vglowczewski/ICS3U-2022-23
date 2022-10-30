package day1;

public class UsingIfStatements {
    public static void main(String[] args) {
        int num = 72;

        if(num % 2 == 0) {
            System.out.println(num + " is even.");
        }

        // if the boolean expression in the (round bracket is true) we do what is in the body of the {curly braces}

        if (num % 2 == 0)
            System.out.println("A"); //no curly braces then only the next line is executed if true
        System.out.println("B");


        int score = 81;

       /* if (score >= 90) {
            System.out.println("A+");
        }else {
            System.out.println("Not an A+");
        }
        */

        if (score >= 90){
            System.out.println("A+");
        } else if(score >= 80){
            System.out.println("A");
        } else if(score >= 70){
            System.out.println("B");
        } else if(score >= 60){
            System.out.println("C");
        } else if (score >= 50){
            System.out.println("D");
        } else{
            System.out.println("F");
        }
    }
}
