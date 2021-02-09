package com.usingrunnable;

public class RunThread implements Runnable{

	@Override
	public void run() {
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
