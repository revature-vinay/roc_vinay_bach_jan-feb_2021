package com.syncheg;

public class Printer {

	
	public synchronized static void printPages(Pages page) {
		System.out.print(page.getPage1());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("  "+page.getPage2());
	}
}
