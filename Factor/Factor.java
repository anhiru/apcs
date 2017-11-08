import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.print("Enter a positive integer: ");
            long value = Math.abs(in.nextLong());
            System.out.print("Prime factors: ");
            for(long i = 2; i <= value; i++) {
                while(value % i == 0) {    // if temp is divisible by index i
                    System.out.print(i + " ");
                    value /= i;
                }
            }
            System.out.println("");
            System.out.print("Continue? (Y/N) ");
            String answer = in.next().toLowerCase();
            if(answer.startsWith("n")) {
                break;
            }
        }
    } 
}
