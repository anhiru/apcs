public class RoachPopulation {
	private int population;
	private double bMultiplier, sMultiplier;
	
	public RoachPopulation(int initialPopulation) {
		population = initialPopulation;
		bMultiplier = 2;
		sMultiplier = 0.9;
	}
	public int getRoaches() {
		return population;
	}
	public void add(int amount) {
		population += amount;
	}
	public void breed() {
		population *= bMultiplier;
		System.out.println("Completed.");
	}
	public void upgradeBreed() {
		bMultiplier++; 
		if(bMultiplier < 8) {
			System.out.println("Breeding has been upgraded.");
		} else {
			System.out.println("Breeding has been maxed out.");
			bMultiplier = 8;
		}
	}
	public void spray() {
		population *= sMultiplier;
		System.out.println("Success!");
	}
	public void upgradeSpray() {
		sMultiplier -= 0.15;
		if(sMultiplier > 0) {
			System.out.println("Spray has been upgraded.");
		} else {
			System.out.println("Spray has been maxed out.");
			sMultiplier = 0;
		}
	}
	public void nuke() {
		population = 0;
		System.out.println("R.I.P.");
	}
	public void reset() {
		population = 100;
		bMultiplier = 2;
		sMultiplier = 0.9;
		System.out.println("Experiment set to default conditions.");
	}
	public void print() {
		System.out.printf("%nCurrent population: %d%n", getRoaches());
	}
}