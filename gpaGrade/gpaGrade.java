
/**
 * gpaGrade PROGRAM 
   * Colleges report GPA (grade point average) on a 4.0 scale. 
   * The top grade is an A, which equals 4.0.
   * The lowest grade is an F, which bottoms out at 0.0.
   * This is the standard scale at most colleges, and many high schools use it. 
 * @author (AndrewTran)
 * @version (08/22/2017)
 */

import java.util.Scanner;

public class gpaGrade
{
    public static void main(String[] args)
    {
        boolean value = true;
        
        while(value == true) {
            System.out.print("Enter a GPA: ");
            Scanner input = new Scanner(System.in);
            
            double number = input.nextDouble();
            if(number == 4.0) {
                System.out.println("You have an A! ");
                value = false;
            } else if(number >= 3.3 && number < 4.0) {
                System.out.println("You have a B+. ");
                value = false;
            } else if(number >= 3.0 && number < 3.3) {
                System.out.println("You have a B. ");
                value = false;
            } else if(number >= 2.7 && number < 3.0) {
                System.out.println("You have a B-. ");
                value = false;
            } else if(number >= 2.3 && number < 2.7) {
                System.out.println("You have a C+. ");
                value = false;
            } else if(number >= 2.0 && number < 2.3) {
                System.out.println("You have a C. "); 
                value = false;
            } else if(number >= 1.7 && number < 2.0) {
                System.out.println("You have a C-. ");
                value = false;
            } else if(number >= 1.3 && number < 1.7) {
                System.out.println("You have a D+. ");
                value = false;
            } else if(number >= 1.0 && number < 1.3) {
                System.out.println("You have a D. ");
                value = false;
            } else if(number >= 0.0 && number < 1.0) {
                System.out.println("You have an F... ");
                value = false;
            } else {
                System.out.println("Please enter a GPA in between 0.0 and 4.0. " );
            }
            /*
            if(input.nextDouble() >= 0.0 && input.nextDouble() <= 4.0) {
                value = false;
            }
            */
        }
    }
}

