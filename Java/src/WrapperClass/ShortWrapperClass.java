package WrapperClass;

public class ShortWrapperClass {
public static void main(String[] args) {
	Short num1=-32768;//short	2 bytes	Stores whole numbers from -32,768 to 32,767
	Short num2=32767;

	if(num1==num2) {
		System.out.println("num1==num2");
	}
	else {
		System.out.println("num1 !=num2");
	}
}
}
