package MultiThreading;

public class TestDeamon1 extends Thread {
	
	public void run() {
		System.out.println("Running thread is daemon....");
	}
	public static void main(String[] args) {
		TestDeamon1 td=new TestDeamon1();
		td.start();
	}
}
