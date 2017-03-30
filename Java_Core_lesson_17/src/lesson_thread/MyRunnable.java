package lesson_thread;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		doSome();
		/*System.out.println(Thread.currentThread().getName());
		
		for (int i = 10; i >0; i--) {
			System.out.print(i+" ");
		}*/
		
	}
	public static synchronized void doSome(){

		for (int i = 0; i <10; i++) {
			System.out.print(i+" ");
		}
	}
	
	
	

	
}
