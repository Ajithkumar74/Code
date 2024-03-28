package Polymorphism;

public class MACBookAir extends MACBook {
	@Override
	void start() {
		super.start();
		System.out.println("Inside MACBookAir start Method");
	}
	
	@Override
	void shutdown() {
		System.out.println("Inside MACBookAir shutdown  Method");

		super.shutdown();
	}

}
