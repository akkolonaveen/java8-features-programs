package com.java8.stream.map;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDataBase {
	
	public static List<Customer> getAll()
	{
		return Stream.of(new Customer(101, "raj", "raj@gmail.com", Arrays.asList("111111","2222222")),
		new Customer(102, "sam", "sam@gnail.com", Arrays.asList("3333333","4444444")),
		new Customer(103, "zoya", "zoya@gnail.com", Arrays.asList("5555555","666666")),
		new Customer(104, "kiran", "kiran@gnail.com", Arrays.asList("7777777","888888"))
		).collect(Collectors.toList());
	}

}
