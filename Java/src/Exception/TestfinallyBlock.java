package Exception;

public class TestfinallyBlock {

	public static void main(String[] args) {
		try {
			int data= 25/5;
			System.out.println(data);
		}catch(Exception e) {
		System.out.println(e);
	}
	finally {
		System.out.println("finally block is always executed");
	}
		System.out.println("rest of phe code...");    

	}
}
