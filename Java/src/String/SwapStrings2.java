package String;

public class SwapStrings2 {

	public static void main(String[] args) {
	
		String a="good",b="morning";
		a=a+b;
		b=a.substring(0,(a.length()-(b.length())));
		a=a.substring(b.length());
		
		System.out.println("strings after swapping= "+a+" " +b);
	}
	

}
