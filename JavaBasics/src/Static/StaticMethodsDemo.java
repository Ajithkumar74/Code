package Static;

public class StaticMethodsDemo {

	public static void main(String[] args) {
		System.out.println("Inside main");
		StaticMethodsDemo.method1();
	}
	static void method1() {
		System.out.println("inside method1");
	}
	static {
		System.out.println("Inside the static block");
	}
}
