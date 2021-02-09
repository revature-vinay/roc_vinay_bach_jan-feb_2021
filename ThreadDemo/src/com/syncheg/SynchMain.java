package com.syncheg;

public class SynchMain {

	public static void main(String[] args) {
	
		new Pages("page1 from user1", "page2 from user1");
		new Pages("page1 from user7", "page2 from user7");
		new Pages("page1 from user2", "page2 from user2");
		new Pages("page1 from user3", "page2 from user3");
		new Pages("page1 from user4", "page2 from user4");
		new Pages("page1 from user5", "page2 from user5");
		new Pages("page1 from user6", "page2 from user6");

	}

}
/*
 * research on wait() notify() notifyAll()
 * look up for producer consumer problem.
 * 
 *  
 *  research on java8 feature of java's concurrent api
 */
