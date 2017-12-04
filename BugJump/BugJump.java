import java.util.Scanner;

public class BugJump {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("What is your name? ");
		String name = in.next(); 
		System.out.printf("Welcome, %s! You are now a bug. Feel free to roam around.%n%n", name);
		Bug user = new Bug(); 
		boolean run = true;

		while(run) {
			user.print();
			System.out.println("[1] Move");
			System.out.println("[2] Turn right");
			System.out.println("[3] Turn left");
			System.out.println("[4] Turn around");
			System.out.println("[5] Increase jump");
			System.out.println("[6] Decrease jump");
			System.out.println("[7] RESET");
			System.out.println("[8] QUIT");
			int input = in.nextInt();
			System.out.println();
			switch(input) {
				case 1:
					user.move();
					break;
				case 2:
					user.turnSide("right");
					break;
				case 3:
					user.turnSide("left");
					break;
				case 4:
					user.turnAround();
					break;
				case 5:
					user.increaseJump(true);
					break;
				case 6:
					user.increaseJump(false);
					break;
				case 7:
					user = new Bug();
					System.out.printf("%s has been reset to default position.%n%n", name);
					break;
				case 8:
					run = false;
					break;
				default:
					System.out.println("Invalid option. Try again.");
					continue;
			}
		}
	}
}