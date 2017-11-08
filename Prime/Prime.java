import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("nth prime number: ");
	int n = in.nextInt();
	if(n < 1) {
	    System.out.println(n + "th prime number does not exist.");
	} else { 
	    int[] arr = new int[n];
	    int index = 0; int i = 2;
	    while(true) {
		boolean prime = true;
		for(int j = 2; j <= Math.sqrt(i); j++) {
		    if(i % j == 0) {
			prime = false;
		    }
		}
		if(prime) {
		    arr[index] = i;
		    index++;
		}
		if(index == n) {
		    break;
		}
		i++;
	    }
	    System.out.println(arr[n - 1]);
	}
    }
}
