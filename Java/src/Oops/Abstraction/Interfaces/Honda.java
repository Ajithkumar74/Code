package Oops.Abstraction.Interfaces;

public class Honda implements car {

	@Override
	public void go() {
		System.out.println("inside Hondas Go");
	}

	@Override
	public void stop() {
		System.out.println("Inside Hondas stop");
	}

}
