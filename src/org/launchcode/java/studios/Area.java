package org.launchcode.java.studios;
import java.util.Scanner;


public class Area {
    public static void main(String args[]) {
        Scanner in;
        in = new Scanner(System.in);
        System.out.print("What is the radius?");
        Double radius = in.nextDouble();
        while (radius <= 0) {
            System.out.print("Please enter a positive number. Try again");
            radius = in.nextDouble();
        }
        Double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of a circle with radius of " + radius + " is " + area);
    }
}
