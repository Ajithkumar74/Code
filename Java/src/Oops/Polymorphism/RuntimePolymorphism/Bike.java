package Oops.Polymorphism.RuntimePolymorphism;

public class Bike {
 
	 void run() {
		 System.out.println("running");
}
}
	 class splendor extends Bike{
		 void run() {
			 System.out.println("running safety with 60km");
	}
	 
	public static void main(String[] args) {
		Bike b=new splendor();//upcating
		b.run();
	}

}
