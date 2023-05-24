package section03.map.run;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Application01 {

	public static void main(String[] args) {
		/* Map 인터페이스의 특징
		 * 
		 * Collection 인터페이스와는 다른 저장 방식을 가진다.
		 * 키와 값을 하나의 쌍으로 저장하는 방식을 사용한다.
		 * 
		 * 키란?
		 * 값을 찾기 위한 이름 역할을 하는 객체를 의미한다.
		 * 1. 요소의 저장 순서를 유지하지는 않는다.
		 * 2. 키는 중복을 허용하지 않지만, 키가 다르면 중복되는 값은 저장이 가능하다.
		 * 
		 * HashMap, HashTable, TreeMap 등의 대표적인 클래스가 있따.
		 * HashMap이 가장 많이 사용되며 HashTable은 jdk1.0부터 제공되며
		 * HashMap과 동일하게 동작하낟. 하위 호환을 위해 남겨 놓았기 떄문이다. 가급적이면 HashMap을 사용하는 것이 좋다.
		 * 
		 * HashMap
		 * jdk1.2부터 제공되는 클래스로 해시 알고리즘을 사용하여 검색 속도가 매우 빠르다.*/

		HashMap hmap = new HashMap();
		hmap.put("one", new Date());
		hmap.put(12, "redApple");
		hmap.put(33, 123);
		
		System.out.println(hmap);
		
		hmap.put(12, "yellow banana");
		System.out.println("hmap : " + hmap);
		
		hmap.put(11,  "yellow banana");
		hmap.put(9,  "yellow banana");
		System.out.println("hmap : " + hmap);
		
		System.out.println("키 9에 대한 객체 : " + hmap.get(9));
		
		hmap.remove(9);
		System.out.println("hmap : " + hmap);
		
		System.out.println("hmap에 저장된 객체 수 : " + hmap.size());
		
		HashMap<String, String> hmap2 = new HashMap<>();
		hmap2.put("one",  "java 8");
		hmap2.put("two",  "oracle 11g");
		hmap2.put("three",  "jdbc");
		hmap2.put("four",  "html5");
		
		/* 1. keySet()을 이용해서 키만 따로 set으로 만들고
		 * iterator()로 키에 대한 목록 만듦*/
		
		Set<String> keys = hmap2.keySet();
		Iterator<String> keyIter = keys.iterator();
		
		Iterator<String> keyIter2 = hmap2.keySet().iterator();
		
		while(keyIter.hasNext()) {
			String key = (String)keyIter.next();
			String value = (String) hmap2.get(key);
			System.out.println(key + " = " + value);
		}
		
		/* 2. 저장된 value 객체들만 values()로 Collection으로 만듦*/
		Collection<String> values = hmap2.values();
		
		/* 2-1. Iterator()로 목록을 만들어서 처리*/
		Iterator<String> valueIter = values.iterator();
		
		while(valueIter.hasNext()) {
			System.out.println(valueIter.next());
		}
		
		
		/* 2-2. 배열로 만들어서 처리*/
		Object[] valueArr = values.toArray();
		for(int i=0; i<valueArr.length; i++) {
			System.out.println(i + " : " + valueArr[i]);
		}

		/* 3. Map의 내부클래스인 EntrySet을 이용 : entrySet();*/
		Set<Map.Entry<String, String>> set = hmap2.entrySet();
		/* Entry : 키와 객체와 값 객체를 한 싸으로 묶은 것*/
		Iterator<Map.Entry<String, String>> entryIter = set.iterator();
		while(entryIter.hasNext()) {
			Map.Entry<String, String> entry = entryIter.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
	}

}
