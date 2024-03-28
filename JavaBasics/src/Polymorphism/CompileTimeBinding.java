package Polymorphism;

public class CompileTimeBinding {
	void add(int a,int b) {
		int Result=a+b;
		System.out.println("Result is: "+Result);
	}
	void add(float a, float b) {
		float Result=a+b;
		System.out.println("Result is: "+Result);
	}
	void add(int a, int b,int c) {
		int Result=a+b+c;
		System.out.println("Result is: "+Result);
	}
	public static void main(String[] args) {
		CompileTimeBinding obj=new CompileTimeBinding();
		obj.add(20, 40);
		obj.add(10.6f, 11.9f);
		obj.add(23, 45 , 56);
		System.out.println();
	}
}
