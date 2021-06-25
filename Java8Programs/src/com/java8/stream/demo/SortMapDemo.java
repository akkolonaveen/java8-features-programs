package com.java8.stream.demo;

import java.util.Map.Entry;

import com.java8.stream.api.example.Employee;

import java.util.*;

public class SortMapDemo {
	
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<>();
		
		map.put("eight", 8);
		map.put("four", 4);
		map.put("two", 2);
		map.put("nine", 9);
		
		
		List<Entry<String,Integer>> entries= new ArrayList<>(map.entrySet()) ;
		
		Collections.sort( entries,( o1,o2)->  o1.getValue()-o2.getValue()) ;
		
		/*for(Entry<String,Integer> entry:entries)
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}*/
		
		//map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		Map<Employee,Integer> emp=new TreeMap<>( ( o1,  o2)-> o2.getSalary()-o1.getSalary());
		
		emp.put(new Employee(112,"naveen","IT",800000),60);
		emp.put(new Employee(123,"sai","Cse",700000),90);
		emp.put(new Employee(155,"arun","EE",900000),40);
		emp.put(new Employee(160,"raj","MECH",400000),50);
		emp.put(new Employee(160,"raj","Civil",400000),120);
		
		emp.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDept ))).forEach(System.out::println);
		
		//System.out.println(emp);
		
	}

}
