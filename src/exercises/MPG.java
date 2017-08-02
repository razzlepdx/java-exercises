package exercises;
import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);
        System.out.print("How many miles have you driven?");
        Integer distance = in.nextInt();
        System.out.print("How much gas did you use (in gallons)?");
        Double gallons = in.nextDouble();
        Double MPG = distance/gallons;
        System.out.println("Since you used " + gallons + " gallons after driving " + distance + " miles, your miles per gallon for this trip is: " + MPG);
    }

}
