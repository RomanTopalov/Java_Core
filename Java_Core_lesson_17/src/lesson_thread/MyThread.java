package lesson_thread;

public class MyThread extends Thread{

	@Override
	public void run() {

		
		System.out.println(Thread.currentThread().getName());
		
	for (int i = 0; i < 10; i++) {
		System.out.print(i+" ");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}
