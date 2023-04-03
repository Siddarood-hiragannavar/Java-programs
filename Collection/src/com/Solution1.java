package com;
import java.util.Map;
import java.util.Set;
import java.util.LinkedHashMap;

public class Solution1 {
	
	public static void main(String[] args) {
		
		Map<String,Integer> map=new LinkedHashMap<String,Integer>();
		map.put("Tom", 50);
		map.put("Jack", 60);
		map.put("Jerry", 70);
		
		Set<String>Keys=map.keySet();//Tom,Jack,Jerry
		for(String key:Keys)
		{
			System.out.println(key+" has Scored "+map.get(key)+" marks.");
		}
	}

}
