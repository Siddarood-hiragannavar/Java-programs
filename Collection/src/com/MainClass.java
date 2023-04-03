package com;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {
	
		Map<Integer,Employee> map=new LinkedHashMap<Integer,Employee>();

		map.put(100,new Employee("Ravi",2.4));
		map.put(200, new Employee("Scahin",2.8));
		
		
		Set<Integer>Keys=map.keySet();
		for(int key:Keys) {
			System.out.println("id:"+key+" "+map.get(key));
		}



	}

}
