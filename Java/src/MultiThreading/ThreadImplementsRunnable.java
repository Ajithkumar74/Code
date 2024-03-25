package MultiThreading;
//2) Java Thread Example by implementing Runnable interface

public class ThreadImplementsRunnable implements Runnable{
	
	public void run() {
		System.out.println("thread is running...");
	}
	public static void main(String[] args) {
		ThreadImplementsRunnable m1=new ThreadImplementsRunnable();
		Thread t1=new Thread(m1);//  // Using the constructor Thread(Runnable r)  
		t1.start();
	}

}
