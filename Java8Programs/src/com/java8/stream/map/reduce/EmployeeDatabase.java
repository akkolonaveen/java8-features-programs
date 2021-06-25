package com.java8.stream.map.reduce;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDatabase {
	
	
	public static List<Employee> getAllemployees()
	{
	  
		
		return Stream.of(
				new Employee(101, "raj", "A", 150000),
				new Employee(103, "sam", "A", 180000),
				new Employee(104, "kiran", "D", 250000),
				new Employee(102, "john", "C", 300500)
			
				).collect(Collectors.toList());
				
	}

}
