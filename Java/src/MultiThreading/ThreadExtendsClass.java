package MultiThreading;
//1) Java Thread Example by extending Thread class

public class ThreadExtendsClass extends Thread {

	public void run() {
		System.out.println("thread is running...");
	}
	
	public static void main(String[] args) {
		ThreadExtendsClass t1=new ThreadExtendsClass();
		t1.start();
	}
}
