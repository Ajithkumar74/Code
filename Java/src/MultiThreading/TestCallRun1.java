package MultiThreading;
//What if we call Java run() method directly instead start() method?

public class TestCallRun1 extends Thread{
	public void run() {
		System.out.println("running...");
		
	}
	public static void main(String[] args) {
		TestCallRun1 t1=new TestCallRun1();
		t1.run();
	}
}
