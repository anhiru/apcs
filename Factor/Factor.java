import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.print("Enter a positive integer: ");
            long value = Math.abs(in.nextLong());
            long temp = value;
            System.out.print("Prime factors: ");
            for(long i = 2; i <= temp; i++) {
                while(temp % i == 0) {    // if temp is divisible by index i
                    System.out.print(i + " ");
                    temp /= i;
                }
            }
            System.out.println("");
            System.out.print("Continue? (Y/N) ");
            String answer = in.next().toLowerCase();
            if(answer.equals("n") || answer.equals("no") || answer.equals("nah")) {
                break;
            } else {
                continue;
            }
        }
    } 
}