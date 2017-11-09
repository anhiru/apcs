import java.util.Scanner;

public class BankAccountInterface {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("What is your name? ");
		String name = in.nextLine();
		System.out.print("Please create a 4-digit pin number: ");
		int pin = in.nextInt();
		System.out.printf("Welcome to your new bank account, %s!", name);
		BankAccount andrew = new BankAccount(pin);
		double amount; int check; int newPin;
		while(true) {
			System.out.println();
			System.out.println("Enter [1] to deposit money.");
			System.out.println("Enter [2] to withdraw money.");
			System.out.println("Enter [3] to view your current balance.");
			System.out.println("Enter [4] to change your pin.");
			int input = in.nextInt();
			System.out.println();
			if(input == 1) {
				System.out.print("How much would you like to deposit? ");
				amount = in.nextDouble();
				andrew.deposit(amount); 
			} else if(input == 2) {
				System.out.print("How much would you like to withdraw? ");
				amount = in.nextDouble();
				andrew.withdraw(amount);
			} else if(input == 3) {
				System.out.println("$" + andrew.balance());
			} else if(input == 4) {
				System.out.print("Current pin: ");
				check = in.nextInt();
				if(andrew.matchPin(check)) {
					System.out.print("New pin: ");
					newPin = in.nextInt();
					andrew.changePin(newPin);
				} else {
					System.out.println("Pin does not match.");
				}
			} else {
				break;
			}
		}
	}
}