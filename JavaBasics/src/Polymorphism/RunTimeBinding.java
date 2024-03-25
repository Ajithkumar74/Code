package Polymorphism;

public class RunTimeBinding {

	public static void main(String[] args) {
		MACBook m1=new MACBookPro();
		MACBook m2=new MACBookAir();
		m1.start();
		m1.shutdown();
		m2.start();
		m2.shutdown();
	}

}
