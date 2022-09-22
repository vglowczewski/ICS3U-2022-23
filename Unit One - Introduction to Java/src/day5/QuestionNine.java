package day5;

import java.util.Scanner;

public class QuestionNine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please input number of items sold: ");
        int items = in.nextInt();

        double pay = items * 0.27;

        System.out.println("The total pay due is: $" + Math.round(pay*100)/100.0);

        in.close();

    }
}
