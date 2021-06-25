package com.java8.stream.map.reduce;

public class EmployeeMain {

	public static void main(String[] args) {
	
		
		double avgsalary=EmployeeDatabase.getAllemployees().stream().filter(emp->emp.getGrade().equalsIgnoreCase("A"))
		.map(emp->emp.getSalary())
		.mapToDouble(i->i)
		.average().getAsDouble();
System.out.println(avgsalary);


double sumsalary=EmployeeDatabase.getAllemployees().stream().filter(emp->emp.getGrade().equalsIgnoreCase("A"))
.map(emp->emp.getSalary())
.mapToDouble(i->i)
.sum();
System.out.println(sumsalary);
	}

}
