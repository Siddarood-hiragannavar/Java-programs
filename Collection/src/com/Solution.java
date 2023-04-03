package com;
import java.util.LinkedHashMap;
import java.util.Set;

public class Solution {
	
	public static void main(String[] args) {
		
		LinkedHashMap<Integer,String>map=new LinkedHashMap<Integer,String>();
		
		map.put(10, "Apple");
		map.put(20, "mango");
		map.put(30,"Banana");

		//convert map into  set-->keySet()
		Set<Integer>keys= map.keySet();//10,20,30
		
		for(int key:keys){
			
			System.out.println(key+" ->"+map.get(key));
		}

	}

}

/**
 1.* Collection is used to store  group og objects;
2. *2 List->AL,LL,S,V 3. Set->HS,LHS,TS 4>Queue->LL,PQ
 3.*Map->HM,LHM,TM,HT
4. *Map is used  to store objects in the form of key value pair ,(Entry)
5. * Gernerics->Element Type_->,<>
 6.* Wrapper class -->Non premitive Version of primitive Datataype.
 7.* int-->Integer double-->Double Char-->Character
 */
