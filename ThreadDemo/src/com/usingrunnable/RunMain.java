package com.usingrunnable;

public class RunMain {

	public static void main(String[] args) {
		
		RunThread r1=new RunThread();
		RunThread r2=new RunThread();
		RunThread r3=new RunThread();
		RunThread r4=new RunThread();
		RunThread r5=new RunThread();

		Thread t1=new Thread(r1, "run-1");
		Thread t2=new Thread(r2, "run-2");
		Thread t3=new Thread(r3, "run-3");
		Thread t4=new Thread(r4, "run-4");
		Thread t5=new Thread(r5, "run-5");
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
