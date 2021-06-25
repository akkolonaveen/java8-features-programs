package com.java8.paralle.streams;

import java.util.*;
import java.util.stream.IntStream;

import com.java8.stream.api.example.DataBase;
import com.java8.stream.api.example.Employee;

public class ParallelStreamExample {

	public static void main(String[] args) {
		long start=0,end=0;
	/*	start=System.currentTimeMillis();
		IntStream.range(0, 100).forEach(System.out::print);
		end=System.currentTimeMillis();
	System.out.println(" normal stream time :"+(end-start));
	System.out.println("===========");
	start=System.currentTimeMillis();
	IntStream.range(0, 100).parallel().forEach(System.out::print);
	end=System.currentTimeMillis();
	
	System.out.println(" parallel stream time :"+(end-start));
	*/
	//IntStream.range(0,10).forEach(x->System.out.println("thread  :"+Thread.currentThread().getName()+" "+x));
	
	//IntStream.range(0,10).parallel().forEach(x->System.out.println("thread  :"+Thread.currentThread().getName()+" "+x));
	
	
	List<Employee> employees=DataBase.getAllEmployees();
	start=System.currentTimeMillis();
	double normalsal=employees.stream().map(Employee::getSalary).mapToDouble(i->i).average().getAsDouble();
	end=System.currentTimeMillis();
	System.out.println(" normal stream execution time :"+(end-start)+" :avg salary :"+normalsal);
	
	start=System.currentTimeMillis();
	double parallelsal=employees.parallelStream().map(Employee::getSalary).mapToDouble(i->i).average().getAsDouble();
	end=System.currentTimeMillis();
	System.out.println(" parallel stream execution time :"+(end-start)+" :avg salary :"+parallelsal);
	
	
	
	
	}
	
}