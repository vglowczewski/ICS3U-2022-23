package day5;

import java.util.Scanner;

public class QuestionTen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please input the rectangle's length and width: ");
        double length = in.nextInt();
        double width = in.nextInt();

        double area = length*width;
        double perimeter = (length*2) + (width*2);

        System.out.println("The area is: " + area);
        System.out.println("The perimeter is: " + perimeter);

        in.close();
    }
}
