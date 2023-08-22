package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double circleArea;
        double radius;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = input.nextDouble();

        //circleArea = 3.14 * radius * radius; // original calc.

        circleArea = Circle.getArea(radius); // new calc by calling Circle method.

        System.out.println("The area of a circle of radius " + radius + " " + "is: " + circleArea);

        input.close();

    }
}
