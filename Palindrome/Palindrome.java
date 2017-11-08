
/**
 * Palindrome PROGRAM
   * A palindrome is a word in which the first letter is the same as the last, the second letter is the same as the second-to-last, etc.
   * Determines whether or not an inputted word is a palindrome. 
 * @author (AndrewTran)
 * @version (09/15/17)
 */

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type in a word! I'll check to see if it's a palindrome.");
        String str = in.next().toLowerCase();
        boolean palindrome = true;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                palindrome = false;
                break;
            }
        }
        System.out.println(palindrome);
    }
}
