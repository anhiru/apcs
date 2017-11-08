import java.util.Scanner;

public class WordCount {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.print("Enter your text: ");
			String words = in.nextLine();
			String[] arr = words.split("\\s+");
			int count = 0;
			for(int i = 0; i < arr.length; i++) {
				if(arr[i].matches(".*[a-zA-Z]+.*")) {
					count++;
				}
			}
			System.out.println();
			if(count == 1) {
				System.out.println("You used " + count + " word.");
			} else {
				System.out.println("You used " + count + " words.");
			}
			System.out.print("Again? (Y/N) ");
			String yn = in.nextLine();
			if(yn.startsWith("n")) {
				break;
			}
		}
	}
}