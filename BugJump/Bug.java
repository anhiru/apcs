public class Bug {
	private int[] position;
	private int jump;
	private boolean right, left, up, down;
	
	public Bug() {
		position = new int[] {0, 0};
		jump = 1;
		right = true;
		left = false;
		up = false;
		down = false;
	}
	public void turnAround() {
		if(right) {
			right = false;
			left = true;
		} else if(left) {
			right = true;
			left = false;
		} else if(up) {
			up = false;
			down = true;
		} else {
			up = true;
			down = false;
		}
	}
	public void turnSide(String direction) {
		if(direction.equals("right")) {
			if(right) {
				right = false;
				down = true;
			} else if(down) {
				down = false;
				left = true;
			} else if(left) {
				left = false;
				up = true;
			} else {
				up = false;
				right = true;
			}
		}
		if(direction.equals("left")) {
			if(right) {
				right = false;
				up = true;
			} else if(up) {
				up = false;
				left = true;
			} else if(left) {
				left = false;
				down = true;
			} else {
				down = false;
				right = true;
			}
		}
	}
	public void move() {
		if(right) {
			position[0] += jump;
		} else if(left) {
			position[0] -= jump;
		} else if(up) {
			position[1] += jump;
		} else {
			position[1] -= jump;
		}
	}
	public void increaseJump(boolean yes) {
		if(yes) {
			jump++;
		} else {
			jump--;
			if(jump < 0) {
				jump = 0;
			}
		}
		System.out.printf("Jump distance is now %d.%n%n", jump);
	}
	public int[] getPosition() {
		return position;
	}
	public void print() {
		System.out.printf("Position: (%d, %d) ", position[0], position[1]);
		if(right) {
			System.out.println("[>]");
		} else if(left) {
			System.out.println("[<]");
		} else if(up) {
			System.out.println("[^]");
		} else {
			System.out.println("[v]");
		}
	} 
}