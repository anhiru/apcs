
/**
 * OddOrEven PROGRAM
   * An integer can be classified as either odd or even.
   * This depends on whether or not the integer is completely divisible by 2.
   * An even number is completely divisible by 2, and will have a remainder of 0.
   * An odd number is not completely divisble by 2, and will have a remainder of 1/2.
 * @author (AndrewTran)
 * @version (08/21/2017)
 */

import java.util.Scanner;

public class OddOrEven
{
   public static void main(String[] args)
   {
       boolean getOut = true; 
           
       while(getOut == true) {
           Scanner in = new Scanner(System.in);
           
           System.out.print("Enter a number: ");
           long number = in.nextLong();
           if(number % 2 == 0) {
               System.out.println("The number is even.");
           } else {
               System.out.println("The number is odd.");
           }
           
           System.out.print("Continue? (y/n) ");
           String cont = in.next().toLowerCase();
           if(cont.equals("n") || cont.equals("no") || cont.equals("nope") || cont.equals("nah")) {
               getOut = false;
           } 
       }
   }
}
