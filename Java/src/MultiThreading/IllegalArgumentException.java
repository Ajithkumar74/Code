package MultiThreading;

public class IllegalArgumentException extends Thread{

	public static void main(String[] args) {
		Thread.currentThread().setPriority(17);
		System.out.println("Priority of thee main Thread is:"+Thread.currentThread().getPriority());
	}
}
