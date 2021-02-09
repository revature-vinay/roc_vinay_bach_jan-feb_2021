package com.usingthread;

public class MyThread extends Thread {

	@Override
	public void run() {
	//	System.out.println("hello from "+Thread.currentThread().getName()+" id : "+Thread.currentThread().getId()+" priority is "+Thread.currentThread().getPriority());
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
