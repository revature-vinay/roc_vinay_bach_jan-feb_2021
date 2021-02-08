package eg1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Demo {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<>();
		map.put(121, "hey");
		map.put(126, null);
		map.put(123, "java");
		map.put(152, "jee");
		map.put(102, "hey");
		map.put(1200, "jme");
		map.put(120, "hibernate");
		map.put(1100, "spring");
		map.put(10, null);
		map.put(22, "graphql");
		map.put(42, "java");
		
		System.out.println("Before Deletion");
		System.out.println(map);
		//delete all K,V pairs if any key is multiples of 10 or if any value is null
		
//		for (Entry<Integer, String> e:map.entrySet()) {
//			if(e.getKey()%10==0 || e.getValue()==null) {
//				map.remove(e.getKey());
//			}
//		}
		
		Iterator<Entry<Integer, String>> i=map.entrySet().iterator();   //if it is list or set or queue then directly assign object.iterator()
		while(i.hasNext()) {
			Entry<Integer, String> e=i.next();  //read and increment the pointer to the next record, use this only wonce in your loop
			if(e.getKey()%10==0 || e.getValue()==null) {
				i.remove();
			}
		}
		
		System.out.println("\nAfter Deletion");
		System.out.println(map);
		
		//Enumerator -> Read -> top to bottom
		//Iterator ->Read and Remove -> from top to bottom
		//ListIterator ->Add, Read, Remove-> bidirectional but it is applicable only and only on List interface.
		
		List<String> list=Arrays.asList("hello","hii","java","jme","django","python");
		Iterator<String> i2=list.iterator();
		while(i2.hasNext()) {
			String s=i2.next();
			System.out.println(s.toUpperCase());
		}

	}

}
