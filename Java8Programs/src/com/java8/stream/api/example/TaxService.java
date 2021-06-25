package com.java8.stream.api.example;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {
	
	
	public static  List<Employee> evaluatetaxusers(String input)
	{
		
		return (input.equalsIgnoreCase("tax"))?
				DataBase.getEmployees().stream()
		.filter(emp->emp.getSalary()> 800000).collect(Collectors.toList()):
			DataBase.getEmployees().stream()
			.filter(emp->emp.getSalary()<=800000).collect(Collectors.toList());
	}

	
	public static void main(String[] args) {
		System.out.println(evaluatetaxusers("ttax"));
	}
}
