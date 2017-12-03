
/**
 * CirclesOverlap PROGRAM
   * Determine if two circles overlap, given their radii and center coordinates, respectively.
   * The radii must always be positive, so any negative user inputs will automatically be placed through the absolute value function.
   * Find the number of points of intersection (zero, one, two, infinite).
 * @author (AndrewTran)
 * @version (08/25/2017)
 */

import java.util.Scanner;
import java.lang.Math;

public class IntersectingCircles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("CIRCLE #1");
            System.out.print("Enter the radius: ");
            double aRadius = Math.abs(input.nextDouble());
            System.out.print("Enter the x-coordinate of the center: ");
            double aX = input.nextDouble();
            System.out.print("Enter the y-coordinate of the center: ");
            double aY = input.nextDouble();

            System.out.println("CIRCLE #2");
            System.out.print("Enter the radius: ");
            double bRadius = Math.abs(input.nextDouble());
            System.out.print("Enter the x-coordinate of the center: ");
            double bX = input.nextDouble();
            System.out.print("Enter the y-coordinate of the center: ");
            double bY = input.nextDouble();

            double abRadius = aRadius + bRadius;
            double distX = Math.pow((bX - aX), 2); 
            double distY = Math.pow((bY - aY), 2);
            double distance = Math.sqrt(distX + distY);
                    
            System.out.println();
            if(distance == 0 && aRadius == bRadius) {
                System.out.println("The circles intersect infinitely many times.");
            } else if(abRadius < distance || aRadius - bRadius > distance || bRadius - aRadius > distance) {
                System.out.println("The circles do not intersect.");
            } else if(abRadius > distance && aRadius - bRadius != distance && bRadius - aRadius != distance) {
                System.out.println("The circles intersect at two points.");
            } else {
                System.out.println("The circles intersect at one point.");
            }
                    
            System.out.print("Again? [0 for no] "); 
            int repeat = input.nextInt();
            if(repeat == 0) {
                break;
            } else {
                System.out.println();
            }
        }
    }
}
