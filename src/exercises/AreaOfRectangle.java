package exercises;
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);
        System.out.print("What is the length of the long side?");
        Double length = in.nextDouble();
        System.out.print("What is the length of the short side?");
        Double width = in.nextDouble();
        Double area = length * width;
        System.out.println("The area of a rectangle with a length of " + length + " and a width of " + width + " is " + area);
    }
}
