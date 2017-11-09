import java.util.Scanner;

public class SimplifyRadical { 
    public static void main(String[] args) {
	while(true) {
	    Scanner in = new Scanner(System.in);
	    System.out.print("nth root = ");
	    int n = in.nextInt();
	    if(n < 1) {
		System.out.println("nth root must be 1 or higher.");
	    } else {
		System.out.print("Enter a value inside the radical: ");
		int store = in.nextInt();
		int inside = store;
		int outside = 1;
		if(store < 0) {
		System.out.println("Values inside the radical must be positive.");
	        } else {
		    for(int i = inside; i > 1; i--) {
		        double power = Math.pow(i, n);
		        if(inside % power == 0) {
			    inside /= power;
			    outside *= i;
		        }
		    }
	            if(store == 0) {
		        System.out.println("rt(0) simplifies to 0");
		    } else if(outside == 1) {
		        System.out.println("rt(" + store + ") cannot be simplified any further.");
		    } else if(inside == 1) {
	    	        System.out.println("rt(" + store + ") simplifies to " + outside);
	            } else {
		        System.out.println("rt(" + store + ") simplifies to " + outside + "*rt(" + inside + ")");
		    }
		    System.out.print("Continue? (Y/N) ");
		    String yn = in.next().toLowerCase();
		    if(yn.startsWith("n")) {
		        break;
		    }
	        }
            }
        }
    }
}
