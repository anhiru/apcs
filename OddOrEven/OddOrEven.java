/**
 * OddOrEven PROGRAM
 * @author (AndrewTran)
 * @version (08/21/2017)
 */

import java.util.Scanner;

public class OddOrEven {
   public static void main(String[] args) {
       while(true) {
           Scanner in = new Scanner(System.in);
           System.out.print("Enter a number: ");
           long number = in.nextLong();
           if(number % 2 == 0) {
               System.out.println("The number is even.");
           } else {
               System.out.println("The number is odd.");
           }
           System.out.print("Continue? (Y/N) ");
           String yn = in.next().toLowerCase();
           if(yn.startsWith("n") {
               break;
           } 
       }
   }
}
