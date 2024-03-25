package Oops.Abstraction;
/*Abstarction:
 * Hide internal implementation and just highlight the set of services,is called abstraction.
 * By using abstract classes and interfaces we can implement abstraction.
 * Example:
 * By using ATM GUI screen bank people are highlighting the set of services what they offering without highlighting internal implementation.*/
abstract class Demo{
	//abstract method
	abstract void display();
	
}
//extends the abstract class
	public class Abstraction extends Demo {
		void display()
		{
			System.out.println("Abstract method called.");
}
		public static void main(String[] args) {
			Abstraction obj=new Abstraction();
			obj.display();
		}

}
