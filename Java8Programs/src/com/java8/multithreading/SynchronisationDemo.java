package com.java8.multithreading;


class Counter{
	  int count;
	public synchronized void  increment()
	{
		count++;
		
	}
}
public class SynchronisationDemo {

	public static void main(String[] args) throws Exception {
	
		Counter c1=new Counter();
	
		
		Thread t1=new Thread (new Runnable()
				{
				public void run()
				{
					for(int i=1;i<1001;i++) {
						c1.count++;
					}
				}
				});
		
		Thread t2=new Thread (new Runnable()
		{
		public void run()
		{
			for(int i=1;i<1001;i++) {
				c1.count++;
			}
		}
		});
			t1.start();
			
			t2.start();
			t1.join();
			t2.join();
			
		
		System.out.println("count "+c1.count);
	}

}
