package com;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
	


public class Solution{

	public static void main(String[] args) {
		Student s1=new Student(100,23,"sid");
		Student s2 =new Student(200,22,"ravi");
		Student s3=new Student(300,21,"ram");
		
		Map<Integer,Student>map=new LinkedHashMap<Integer,Student>();
		
		map.put(s1.id, s1);
		map.put(s2.id, s2);
		map.put(s2.id, s3);
		//converting map in to a set
		Set<Integer>Keys=map.keySet();
		//reference variable of list & object of ArrayList Storing Stufdent objects
		List<Student>list=new ArrayList<Student>();
		//traversing using for each loop
		for(int key:Keys)
		{
		
			Student std=map.get(key);//getting Student object (value) ->get()
			list.add(std);//adding the values (student object) into the list
			System.out.println(std);//printing the three values(Student objects
		}
		
		
	}

}
