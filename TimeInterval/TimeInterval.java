
/**
 * TimeInterval PROGRAM
   * Military time, or the 24-hour clock, is the convention of time keeping in which the day runs from midnight to midnight and is divided into 24 hours.
   * The time is indicated by the hours passed since midnight.
   * This system is the most commonly used time notation in the world today. 
 * @author (AndrewTran)
 * @version (08/23/2017)
 */

import java.util.Scanner;

public class TimeInterval
{
    public static void main(String[] args)
    {
        boolean next = true;
        
        while(next == true) {
            Scanner input = new Scanner(System.in);
            
            System.out.print("Enter the first time: ");
            int a = input.nextInt();
            int aHour = a / 100;
            int aMin = a % 100;
            System.out.print("Enter the second time: ");
            int b = input.nextInt();
            int bHour = b / 100;
            int bMin = b % 100;
            
            /* if (a < b) {
                System.out.print((b-a) % 100);
            } */
            
            if(aMin < 60 && bMin < 60){
                if(a < b && a >= 0 && a <= 2400 && b >=0 && b <= 2400) {
                    if(bMin - aMin >= 0) {     // positive minutes, time #1 is before time #2
                        if(bHour - aHour == 1 && bMin - aMin == 1) {    // single hour, single minute
                            System.out.print("The difference in time is ");
                            System.out.print(bHour - aHour);
                            System.out.print(" hour and ");
                            System.out.print(bMin - aMin);
                            System.out.println(" minute.");
                            next = false;
                        } else if(bHour - aHour == 1) {   // single hour
                            System.out.print("The difference in time is ");
                            System.out.print(bHour - aHour);
                            System.out.print(" hour and ");
                            System.out.print(bMin - aMin);
                            System.out.println(" minutes.");
                            next = false;
                        } else if(bMin - aMin == 1) {     // single minute
                            System.out.print("The difference in time is ");
                            System.out.print(bHour - aHour);
                            System.out.print(" hours and ");
                            System.out.print(bMin - aMin);
                            System.out.println(" minute.");
                            next = false;
                        } else {    // multiple hours and minutes
                            System.out.print("The difference in time is ");
                            System.out.print(bHour - aHour);
                            System.out.print(" hours and ");
                            System.out.print(bMin - aMin);
                            System.out.println(" minutes.");
                            next = false;
                        }
                    } else if(bHour - aHour - 1 == 1 && bMin - aMin + 60 == 1) {    // carry over the minutes, no negatives allowed; single hour, single minute
                        System.out.print("The difference in time is ");
                        System.out.print(bHour - aHour - 1);
                        System.out.print(" hour and ");
                        System.out.print(bMin - aMin + 60);
                        System.out.println(" minute.");
                        next = false;
                    } else if(bHour - aHour - 1 == 1) {     // single hour
                        System.out.print("The difference in time is ");
                        System.out.print(bHour - aHour - 1);
                        System.out.print(" hour and ");
                        System.out.print(bMin - aMin + 60);
                        System.out.println(" minutes.");
                        next = false;
                    } else if(bMin - aMin + 60 == 1) {     // single minute
                        System.out.print("The difference in time is ");
                        System.out.print(bHour - aHour - 1);
                        System.out.print(" hours and ");
                        System.out.print(bMin - aMin + 60);
                        System.out.println(" minute.");
                        next = false;
                    } else {    // multiple hours and minutes
                        System.out.print("The difference in time is ");
                        System.out.print(bHour - aHour - 1);
                        System.out.print(" hours and ");
                        System.out.print(bMin - aMin + 60);
                        System.out.println(" minutes.");
                        next = false;
                    }
                } else if(a > b && a >= 0 && a<= 2400 && b >= 0 && b <= 2400) {     
                    if(bMin - aMin >=0) {      // positive minutes, time #1 is after time #2
                        if(bHour - aHour + 24 == 1 && bMin - aMin == 1) {   // single hour, single minute
                            System.out.print("The difference in time is ");
                            System.out.print(bHour - aHour + 24);
                            System.out.print(" hour and ");
                            System.out.print(bMin - aMin);
                            System.out.println(" minute.");
                            next = false;
                        } else if(bHour - aHour + 24 == 1) {    // single hour
                            System.out.print("The difference in time is ");
                            System.out.print(bHour - aHour + 24);
                            System.out.print(" hour and ");
                            System.out.print(bMin - aMin);
                            System.out.println(" minutes.");
                            next = false;
                        } else if(bMin - aMin == 1) {   // single minute
                            System.out.print("The difference in time is ");
                            System.out.print(bHour - aHour + 24);
                            System.out.print(" hours and ");
                            System.out.print(bMin - aMin);
                            System.out.println(" minute.");
                            next = false;
                        } else {    // multiple hours and minutes
                            System.out.print("The difference in time is ");
                            System.out.print(bHour - aHour + 24);
                            System.out.print(" hours and ");
                            System.out.print(bMin - aMin);
                            System.out.println(" minutes.");
                            next = false;
                        }
                    } else if(bHour - aHour + 24 - 1 == 1 && bMin - aMin + 60 == 1) {    // carry over the minutes, no negatives allowed; single hour, single minute
                        System.out.print("The difference in time is ");
                        System.out.print(bHour - aHour + 24 - 1);
                        System.out.print(" hour and ");
                        System.out.print(bMin - aMin + 60);
                        System.out.println(" minute.");
                        next = false;
                    } else if(bHour - aHour + 24 - 1 == 1) {    // single hour
                        System.out.print("The difference in time is ");
                        System.out.print(bHour - aHour + 24 - 1);
                        System.out.print(" hour and ");
                        System.out.print(bMin - aMin + 60);
                        System.out.println(" minutes.");
                        next = false;
                    } else if(bMin - aMin + 60 == 1) {     // single minute
                        System.out.print("The difference in time is ");
                        System.out.print(bHour - aHour + 24 - 1);
                        System.out.print(" hours and ");
                        System.out.print(bMin - aMin + 60);
                        System.out.println(" minute.");
                        next = false;
                    } else {    // multiple hours and minutes
                        System.out.print("The difference in time is ");
                        System.out.print(bHour - aHour + 24 - 1);
                        System.out.print(" hours and ");
                        System.out.print(bMin - aMin + 60);
                        System.out.println(" minutes.");
                        next = false;
                    }
                } else if(a == b && a >= 0 && a <= 2400 && b >= 0 && b <= 2400) {      // same time
                    System.out.println("The difference in time is 0 hours and 0 minutes.");
                    next = false;
                } else {    // user inputted negatives or values greater than 2400
                    System.out.println("Please enter times in between 0 and 2400.");
                }
            } else {    // user inputted minutes greater than or equal to 60
                System.out.println("Minutes must be less than 60. Please try again.");
            }
        }
    }
}
