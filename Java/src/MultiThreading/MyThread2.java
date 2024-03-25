package MultiThreading;
//3) Using the Thread Class: Thread(String Name)

public class MyThread2 implements Runnable{
 public void run() {
	 System.out.println("Now the thread is running....");
 }
	public static void main(String[] args) {
		
		Runnable r1=new MyThread2();
		Thread th1=new Thread(r1,"My New thread");
		th1.start();
		String str=th1.getName();
		System.out.println(str);
	}

}
