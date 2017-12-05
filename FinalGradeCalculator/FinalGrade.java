public class FinalGrade {
	private double grade, goal, weight, need;

	public FinalGrade(double currentGrade, double endGrade, double finalWeight) {
		grade = currentGrade/100;
		goal = endGrade/100;
		weight = finalWeight/100;
		need = (goal-(1-weight)*grade)/weight;
	}
	public double overall() {
		return goal*100;
	}
	public double least() {
		return need*100;
	}
}