public class WeeklyWage {
	private int[] hours;
	private double wage; 
	
	public WeeklyWage(int[] dailyHours, double hourlyWage) {
		hours = dailyHours;
		wage = hourlyWage;
	}
	public double getWage() {
		return wage;
	}
	public void raise(double raisePercent) {
		wage *= (1 + raisePercent/100);
	}
	public void cut(double cutPercent) {
		wage *= (1 - cutPercent/100);
	}
	public int getTotalHours() {
		int total = 0;
		for(int i = 0; i < hours.length; i++) {
			total += hours[i];
		}
		return total;
	} 
	public int getTotalOvertimeHours() {
		int overtime = 0;
		for(int i = 0; i < hours.length; i++) {
			if(i < hours.length - 2) {
				if(hours[i] > 8) {
					overtime += (hours[i] - 8);
				}
			} else {
				overtime += hours[i];
			}
		}
		return overtime;
	}
	public int getTotalUndertimeHours() {
		int undertime = 0;
		for(int i = 0; i < hours.length - 2; i++) {
			if(hours[i] < 8) {
				undertime += (8 - hours[i]);
			}
		}
		return undertime;
	}
	public double getWeeklyPay() {
		double pay = 0;
		for(int i = 0; i < hours.length; i++) {
			if(i == hours.length - 2) {
				pay += 2*wage*hours[i];
			} else if(i == hours.length - 1) {
				pay += 1.5*wage*hours[i];
			} else if(hours[i] > 8) {
				pay += 1.5*wage*(hours[i] - 8) + 8*wage;
			} else {
				pay += wage*hours[i];
			}
		}
		return pay;
	}
}
