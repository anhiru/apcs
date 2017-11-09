import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.print("Enter a positive integer: ");
            long value = Math.abs(in.nextLong());
            //check to see if the value is prime
            boolean prime = true;
            for(int i = 2; i <= Math.sqrt(value); i++) {
                if(value % i == 0) {
                    prime = false;
                }
            }
            //print its prime factors 
            System.out.print("Prime factors: ");
            if(prime == false) {
                for(long i = 2; i <= Math.sqrt(value); i++) {
                    while(value % i == 0) {    // if the value is divisible by index i
                        System.out.print(i + " ");
                        value /= i;
                    }
                }
            } else {
                System.out.print(1 + " " + value);
            }
            System.out.println("");
            System.out.print("Continue? (Y/N) ");
            String yn = in.next().toLowerCase();
            if(yn.startsWith("n")) {
                break;
            }
        }
    } 
}
