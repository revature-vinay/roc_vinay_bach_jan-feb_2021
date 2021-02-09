package com.usingthread;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println(Thread.currentThread());//{thread_name, thread_priority, thread_group}
		Thread t=Thread.currentThread();
		t.setName("myMain");
		t.setPriority(7);
		System.out.println(Thread.currentThread());
//		System.out.println(10/0);
		
		MyThread m1=new MyThread();
		m1.setName("my-1");
		MyThread m2=new MyThread();
		m2.setName("my-2");
		MyThread m3=new MyThread();
		m3.setName("my-3");
		m3.setPriority(9);
		MyThread m4=new MyThread();
		m4.setName("my-4");
		MyThread m5=new MyThread();
		m5.setName("my-5");

		
		m1.start();
		m2.start();
		m3.start();
		m4.start();
		m5.start();
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Printing from "+Thread.currentThread().getName()+" value of i : "+i);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
