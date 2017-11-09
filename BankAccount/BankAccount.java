public class BankAccount {
	//initialize the instance variables
	private double balance; int pin; 
	//most IMPORTANT method: constructor(s)
		//constructor(s) must be public and have the same name as the class
		//purpose is to create an object of the class and to initialize all the instance variables
	public BankAccount(int newPin)  {
		balance = 0;
		pin = newPin;
	}
	public void deposit(double amount) {
		//updates balance with addition of amount
		balance += amount;
	}
	public void withdraw(double amount) {
		//updates the balance with subtraction of amount
		if(balance >= amount) {
			balance -= amount;
		} else {
			System.out.println("Not enough money in your balance to make this transaction.");
		}
	}
	public double balance() {
		return balance;
	}
	public boolean matchPin(int userInputPin) {
		return (pin == userInputPin);
	}
	public void changePin(int newPin) {
		pin = newPin;
		System.out.println("Your changes have been saved.");
	}
}