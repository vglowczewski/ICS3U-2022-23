package day5;

public class QuestionTwo {
    public static void main(String[] args) {
        double length = 4.5;
        double width = 2.3;

        double area = length*width;
        double perimeter = (length*2) + (width*2);

        System.out.println("The area is: " + (Math.round(area*10)/10.0));
        System.out.println("The perimeter is: " + (Math.round(perimeter*10)/10.0));
    }
}
