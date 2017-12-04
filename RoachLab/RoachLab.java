import java.util.Scanner;

public class RoachLab {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		System.out.println("Welcome to the Roach Laboratory.");
		
		while(true) {
			System.out.print("How many roaches would you like to begin with? ");
			int population = in.nextInt();
			if(population > 0) {
				RoachPopulation test = new RoachPopulation(population);
				boolean testing = true; 

				while(testing) {
					test.print();
					System.out.println("[1] Add");
					System.out.println("[2] Breed");
					System.out.println("[3] Spray");
					System.out.println("[4] Nuke");
					System.out.println("[5] Upgrade");
					System.out.println("[6] RESET");
					System.out.println("[7] QUIT");
					int input = in.nextInt();
					System.out.println();
					switch(input) { 
						case 1:
							while(true) {
								System.out.print("How many to add? ");
								int amount = in.nextInt();
								if(amount > 0) {
									test.add(amount);
									break;
								} else {
									System.out.println("Need to add at least one.");
								}
							}
							break;
						case 2:
							test.breed();
							break;
						case 3:
							test.spray();
							break;
						case 4:
							test.nuke();
							break;
						case 5:
							while(true) {
								System.out.print("Enhance breed or spray? ");
								String choice = in.next().toLowerCase();
								if(choice.startsWith("b")) {
									test.upgradeBreed();
									break;
								} else if(choice.startsWith("s")) {
									test.upgradeSpray();
									break;
								} else {
									System.out.println("Please choose one.");
								}
							}
							break;
						case 6:
							test.reset();
							break;
						case 7: 
							testing = false;
							break;
						default: 
							System.out.println("Invalid option. Try again.");
							continue;
					}
				}
				break;			
			} else { 
				System.out.println("Need more roaches.");
			}
		}
	}
}