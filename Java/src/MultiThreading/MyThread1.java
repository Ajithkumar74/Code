package MultiThreading;
//3) Using the Thread Class: Thread(String Name)

public class MyThread1 {

	public static void main(String[] args) {
		Thread t=new Thread("My first thread");
		t.start();
		String str=t.getName();
		System.out.println(str);
	}

}
