package com.java8.stream.api.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataBase {
	
	public static List<Employee> getEmployees()
	{
		List<Employee> list=new ArrayList<>();

		list.add(new Employee(112,"naveen","IT",800000));
		list.add(new Employee(123,"sai","IT",700000));
		list.add(new Employee(155,"arun","IT",900000));
		list.add(new Employee(160,"raj","IT",400000));
		return list;
		
	}
	
	public static List<Employee> getAllEmployees(){
	List<Employee> list1=new ArrayList<>();
	for(int i=1;i<1001;i++) {
		
		list1.add(new Employee(i,"employee "+i,"IT "+i,(int)Math.random()*100));
	}
	return list1;
	}
}
