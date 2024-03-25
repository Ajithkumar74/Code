package Oops.Encapsulation;

public class MotorBike {
	// state
	private int speed;// memeber variable

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
		/*
		 * System.out.println(speed); System.out.println(this.speed);
		 */
	}

	void start() {
		System.out.println("Bike Started");
	}

}
