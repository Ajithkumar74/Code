package Polymorphism;

public class MACBookPro extends MACBook {
	@Override
	void start() {
		super.start();
		System.out.println("Inside MACBookPros start Method");
	}
	
	@Override
	void shutdown() {
		System.out.println("Inside MACBookPros shutdown  Method");

		super.shutdown();
	}
}
