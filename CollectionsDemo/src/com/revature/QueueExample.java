package com.revature;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		// Queues are like a line, in which we can insert elements at the back, and remove elements from the front
		// LinkedList, although it also implements List, also implements Deque, which extends from Queue
		Queue<String> myQueue = new LinkedList<>();
		
		myQueue.add("Peaches");
		myQueue.add("Avocados");
		myQueue.add("Apples");
		
		String element;
		while(!myQueue.isEmpty()) {
			element = myQueue.poll();
			System.out.println(element);
		}
		
		System.out.println("======");
		
		// Java for whatever reason allows us to iterate over the Queue, which ideally is not what we would
		// really want to do because you really should ideally want to only be able to look at whoever is in the front of 
		// the line
		for (String i : myQueue) {
			System.out.println(i);
		}
		System.out.println("It's empty!");
		
	}

}
