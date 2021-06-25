package com.java8.stream.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.java8.stream.api.example.DataBase;
import com.java8.stream.api.example.Employee;

public class SortListDemo {
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(8);
		list.add(1);
		list.add(5);
		list.add(12);
		list.add(41);
		
		/*Collections.sort(list);
		Collections.reverse(list);
		System.out.print(list);
		list.stream().sorted(Comparator.reverseOrder()).forEach(i->System.out.println(i));
		*/
		
		List<Employee> employees=DataBase.getEmployees();
		Collections.sort(employees,( o1,  o2) ->{
			
			return o2.getSalary()-o1.getSalary();
		});
		
//employees.stream().sorted(( o1,  o2) -> o1.getSalary()-o2.getSalary()).forEach(System.out::println);
employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
		//System.out.print(employees);
	}

}
/*class Mycomparator implements Comparator<Employee>
{

	( o1,  o2) ->{
		
		return o1.getSalary()-o2.getSalary();
	}
	
}*/














