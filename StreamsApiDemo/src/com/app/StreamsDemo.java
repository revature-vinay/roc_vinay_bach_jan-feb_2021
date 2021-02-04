package com.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1, 23, 31, 1, 1, 2, 3, 22, 44, 4, 55);
		System.out.println(li);

		
		//Java 7
		List<Integer> oddList = new ArrayList<>();
		List<Integer> evenList = new ArrayList<>();
		for (Integer i : li) {
			if (i % 2 == 0) {
				evenList.add(i);
			} else {
				oddList.add(i);
			}
		}
		
		System.out.println("oddlist : "+oddList);
		System.out.println("evenlist : "+evenList);

		
		//Java8
		List<Integer> oddStream=li.stream().filter(i->i%2!=0).collect(Collectors.toList());
		System.out.println("oddStream : "+oddStream);
		List<Integer> evenStream=li.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("evenStream : "+evenStream);
		
		
		
		List<String> fruits=Arrays.asList("Apple","Banana","Watermelon","MuskMelon","Mango","Kiwi","Pomogranate");
		List<String> lengh5andabovefruits=fruits.stream().filter(x->x.length()>=5).map(x->x.toUpperCase()).sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("lengh5andabovefruits : "+lengh5andabovefruits);
		
		//Terminal and Intermediate Operations
		
	}

}
