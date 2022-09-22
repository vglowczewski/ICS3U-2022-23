package day5;

import java.util.Scanner;

public class QuestionEleven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please input the mass: ");
        double mass = in.nextDouble();

        System.out.print("Please input the speed: ");
        double speed = in.nextDouble();

        double kineticEnergy = (mass*speed*speed)/2;

        System.out.println("The kinetic energy of the object is: " + kineticEnergy);

        in.close();

    }
}
