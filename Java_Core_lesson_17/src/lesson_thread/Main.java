package lesson_thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
	//	System.out.println(Thread.currentThread().getName());
		
		
//		MyThread myThread = new MyThread();///	
//		myThread.start();    
		
		/*MyRunnable myRunnable = new MyRunnable();
		Thread thread1=new Thread(myRunnable);
 thread1.setPriority(10);
		thread1.start();
		
		System.out.println( " ");*/
		
		//////------------------
	/*	
		MyRunnable myRunnable1 = new MyRunnable();
		Thread thread2=new Thread(myRunnable1);
		thread2.start();*/
		
		
		////////////////////
//		Thread thread = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				System.out.println("sdfsdsdf");
//			}
//		});
//		thread.start();
		////////////////////
		
		/*(new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("pipa");
				
			}
		})).start();*/
		
		
		/*System.out.println(thread.getContextClassLoader());
		System.out.println(thread.getPriority());
		
		
		*/
		
		
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		service.schedule(new Runnable() {
			
			@Override
			public void run() {
			System.out.println("shedule");
				
			}
		}, 2, TimeUnit.SECONDS);
		
		service.shutdown();
		
		//////////
		
		ScheduledExecutorService service2 = Executors.newSingleThreadScheduledExecutor();
		service2.scheduleAtFixedRate(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("lala");
			}
		}, 2, 1, TimeUnit.SECONDS);
		
		ScheduledExecutorService service3 = Executors.newSingleThreadScheduledExecutor();
		service3.scheduleWithFixedDelay(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("fififif");
			}
		}, 3, 2, TimeUnit.SECONDS);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
