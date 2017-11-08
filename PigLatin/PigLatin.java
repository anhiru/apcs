import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("ENGLISH --> PIGLATIN ENCODER");
	while(true) {
	    System.out.print("Enter a sentence: ");
	    String str = in.nextLine().toLowerCase(); 
	    String[] arr = str.split("\\s+");
	    String result = "";
	    for(int i = 0; i < arr.length; i++) {
		if(arr[i].startsWith("a") || arr[i].startsWith("e") || arr[i].startsWith("i") || arr[i].startsWith("o") || arr[i].startsWith("u")) {
		    arr[i] += "way";
		} else {
		    char first = arr[i].charAt(0);
		    arr[i] = arr[i].substring(1) + first + "ay";
		}
		result += arr[i] + " ";
	    }
	    System.out.println(result);
	    System.out.println();
	    System.out.print("Again? (Y/N) ");
	    String yn = in.nextLine().toLowerCase();
	    if(yn.startsWith("n")) {
		break;
	    }
	}
    }
}
