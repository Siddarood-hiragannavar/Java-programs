package com;

public class Student {

	int id;
	int age;
	String name;
	public Student(int id, int age, String name) {

		this.id = id;
		this.age = age;
		this.name = name;
	}


	@Override
	public String toString()
	{
		return "Id is :"+id+"Age is :"+age+"Name is :"+name;//if we dont want default values we want some custome implemantation so we 
		//we override
	}



}
