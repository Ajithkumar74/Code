package MultiThreading.Threadclass;

public class Multi extends Thread {// extending Thread class
	public void run() {
		System.out.println("Thread is running...");
	}
	public static void main(String[] args) {
		Multi t1=new Multi();
		t1.start();
	}

}
