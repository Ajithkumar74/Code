package MultiThreading;
//What if we call Java run() method directly instead start() method?

import java.util.Iterator;

public class TestCallRun2 extends Thread{
	public void run() {
		for(int i=1;i<5;i++) {
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		System.out.println(i);
		}
		
	}
	public static void main(String[] args) {
		TestCallRun2 t1=new TestCallRun2();
		TestCallRun2 t2=new TestCallRun2();

		t1.run();
		t1.run();
	}
}
