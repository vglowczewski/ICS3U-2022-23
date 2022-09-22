package day5;

import java.util.Scanner;

public class QuestionEight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please input a positive integer: ");
        int num = in.nextInt();

        int square = num*num;

        double squareRoot = Math.sqrt(num);

        System.out.println("The square of " + num + " is: " + square);
        System.out.println("The square root of " + num + " is: " + squareRoot);

        in.close();
        
    }
}
