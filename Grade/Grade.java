/**
 * Grade PROGRAM 
   * Colleges report GPA (grade point average) on a 4.0 scale. 
   * The top grade is an A, which equals 4.0.
   * The lowest grade is an F, which bottoms out at 0.0. 
 * @author (AndrewTran)
 * @version (08/22/2017)
 */

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.print("Enter a GPA: ");
            double gpa = in.nextDouble();
            if(gpa == 4.0) {
                System.out.println("You have an A!");
            } else if(gpa >= 3.3 && gpa < 4.0) {
                System.out.println("You have a B+.");
            } else if(gpa >= 3.0 && gpa < 3.3) {
                System.out.println("You have a B.");
            } else if(gpa >= 2.7 && gpa < 3.0) {
                System.out.println("You have a B-.");
            } else if(gpa >= 2.3 && gpa < 2.7) {
                System.out.println("You have a C+.");
            } else if(gpa >= 2.0 && gpa < 2.3) {
                System.out.println("You have a C."); 
            } else if(gpa >= 1.7 && gpa < 2.0) {
                System.out.println("You have a C-.");
            } else if(gpa >= 1.3 && gpa < 1.7) {
                System.out.println("You have a D+.");
            } else if(gpa >= 1.0 && gpa < 1.3) {
                System.out.println("You have a D.");
            } else if(gpa >= 0.0 && gpa < 1.0) {
                System.out.println("You have an F...");
            } else {
                System.out.println("Please enter a GPA in between 0.0 and 4.0.");
                System.out.println();
            }
            if(gpa >= 0 && gpa <= 4) {
                System.out.print("Continue? (Y/N) ");
                if(in.next().toLowerCase().startsWith("n")) {
                    break;
                }
                System.out.println();
            }
        }
    }
}