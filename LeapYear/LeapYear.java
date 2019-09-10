
/**
 * LeapYear PROGRAM
   * A year is a leap year if it is divisible by 4 (1980), except that it is not a leap year if it is divisible by 100 (1900).
   * However, it is a leap year if it is divisible by 400 (2000). 
   * There were no exceptions before the introduction of the Gregorian calender on October 15, 1582 (for example, 1500 was a leap year).
 * @author (AndrewTran)
 * @version (08/18/2017)
 */

import java.util.Scanner; 

public class LeapYear {
    public static void main(String[] args) {
        while(true) {
            System.out.print("Enter a year: ");
            Scanner in = new Scanner(System.in);
            int year = in.nextInt();
            boolean leap_year = false;
          
            // before 1582 we only care about if the year is divisible by 4 
            if(year > 1582) {
                if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                    leap_year = true;
                }
            } else if(year % 4 == 0) {
                leap_year = true;
            }
          
            if(leap_year) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
          
            System.out.print("Continue? [0 for no, any # for yes] " );    // zero stops the program
            if(in.nextInt() == 0) {                                       // accepts only integer values
                break;
            }
        }
    }
}
