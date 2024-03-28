package Oops.Encapsulation;

public class MoterBikeRunner {
	public static void main(String[] args) {
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();

		ducati.start();
		honda.start();

		ducati.setSpeed(100);
		System.out.println(ducati.getSpeed());
		//ducati.setSpeed(80);
		System.out.println(honda.getSpeed());
	}
}
