package MultiThreading;

//Example of the sleep() Method in Java : on the main thread
public class TestSleepMethod3   {
	//main method
	
	public static void main(String[] args) {
		try {
			for(int j=0;j<5;j++) {
				Thread.sleep(1000);
				System.out.println(j);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
