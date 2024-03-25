package Oops.Abstraction;

abstract class car{
	//abstract method
	abstract void start();
	
	//non-abstract method
	public void stop() {   
		System.out.println("The car engine is not started.");
	}
}
//inherit abstract class
public class Owner extends car{
	void start() {
		System.out.println("The car engine has been started.");  

	}

	public static void main(String[] args) {
		Owner obj=new Owner();
		//calling abstract method
		obj.start();
		//calling non abstract method
		obj.stop();
	}

}
