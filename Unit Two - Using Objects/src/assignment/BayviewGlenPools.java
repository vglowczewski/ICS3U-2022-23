package assignment;

import java.util.Scanner;

public class BayviewGlenPools {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //Prompt and take in values from user
        System.out.println("Please enter the pool length: ");
        int length = in.nextInt();
        System.out.println("Please enter the pool width: ");
        int width = in.nextInt();
        System.out.println("Please enter the depth of the shallow end: ");
        int heightShallow = in.nextInt();
        System.out.println("Please enter the depth of the deep end: ");
        int heightDeep = in.nextInt();
        System.out.println("Please enter the transition length: ");
        int transition = in.nextInt();
        System.out.println("Please enter the length of the shallow end: ");
        int lengthShallow = in.nextInt();
        System.out.println("Please enter the cost of the liner: ");
        double linerCost = in.nextInt();

        //Calculate unknown values
        double heightTransition = heightDeep - heightShallow;
        double lengthTransition = Math.sqrt((Math.pow(transition,2) - Math.pow(heightTransition,2)));
        double lengthDeep = length - lengthShallow - lengthTransition;

        //Surface area calculation
        double sideSurfaceArea = lengthDeep * heightDeep + ((heightDeep + heightShallow) * lengthTransition) / 2 + lengthShallow * heightShallow; 
        double shallowSurfaceArea = heightShallow * width;
        double deepSurfaceArea = heightDeep * width;
        double floorSurfaceArea = (lengthDeep + transition + lengthShallow) * width;
        double totalSurfaceArea = (sideSurfaceArea * 2) + shallowSurfaceArea + deepSurfaceArea + floorSurfaceArea;

        //Volume calculation
        double totalVolume = sideSurfaceArea * width;
        double finalVolume = totalVolume * 0.9;

        //Cost calculation
        double totalCost = Math.round((totalSurfaceArea * linerCost) * 100) / 100.0;

        //Print statements for surface area, volume, and cost
        System.out.println("The amount of water needed to keep the pool 90% full is: " + finalVolume + " cubic m");
        System.out.println("The total amount of liner needed to cover the pool is: " + totalSurfaceArea + " square m");
        System.out.println("The cost of the liner is: $" + totalCost);
  
        in.close();

     }

  }
    