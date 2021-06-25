package com.java8.multithreading;



/*class Hi implements Runnable{
	
	public void run() {
		for(int i=1;i<5;i++)
		{
			System.out.println("hi ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Hello implements Runnable{
	
	public void run() {
		for(int i=1;i<5;i++)
		{
			System.out.println("hello ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}*/
public class ThreadDemo {

	public static void main(String[] args) throws Exception {
		// 
		
	
		
	Thread t1=new Thread(()-> {
		for(int i=1;i<5;i++)
		{
			System.out.println("hi "+Thread.currentThread().getPriority());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	},"hi thread");
	Thread t2=new Thread(()-> {
		for(int i=1;i<5;i++)
		{
			System.out.println("hello "+Thread.currentThread().getPriority());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	},"hello  thread");
	t1.setPriority(Thread.MAX_PRIORITY);
t2.setPriority(Thread.MIN_PRIORITY);
System.out.println(t1.getPriority());
System.out.println(t2.getPriority());
	
	System.out.println(t1.getName());
	System.out.println(t2.getName());
	
		
		//System.out.println(t1.isAlive());
		t1.start();
		//System.out.println(t1.isAlive());
		t2.start();
		t1.join();
		t2.join();
		System.out.println(t1.isAlive());
		System.out.println(" byee ");
	}

}
