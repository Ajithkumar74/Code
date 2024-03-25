package program;

public class IntegerWrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer num1=100;
		Integer num2=100;
		Integer num3=500;//-128 to 127
		Integer num4=500;
		if(num1==num2) {
			System.out.println("num1==num2");
		}
		else {
			System.out.println("num1 !=num2");
		}
		if(num3==num4) {
			System.out.println("num3==num4");
		}
		else {
			System.out.println("num3!=num4");
		}
		
	}

}
