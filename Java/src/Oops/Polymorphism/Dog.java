package Oops.Polymorphism;
	//static binding
//When type of the object is determined at compiled time(by the compiler), it is known as static binding.

//If there is any private, final or static method in a class, there is static binding.
public class Dog {
	private void eat() {
		System.out.println("dog is eating");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1=new Dog();
		d1.eat();
	}

}
