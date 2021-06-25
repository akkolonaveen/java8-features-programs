package com.java8.stream.map;

import java.util.*;
import java.util.Optional;

public class OptionalDemo {
	
	public static  Customer getcustomerByEmailId(String email) throws Exception
	{
		
		List<Customer> customers=CustomerDataBase.getAll();
		
		return customers.stream().filter(cust->cust.getEmail().equalsIgnoreCase(email))
		         .findAny().orElseThrow(()->new Exception("no customer with given email found"));
		
	}

	public static void main(String[] args) throws Exception {
		Customer customer=new Customer(101, "raj", "naveen@gmail.com", Arrays.asList("111111","2222222"));
		System.out.println(getcustomerByEmailId("raj @gmail.com"));
		
		Optional<Object> opt=Optional.empty();
		System.out.println(customer.getEmail());
		
		Optional<String> email=Optional.of(customer.getEmail());
		System.out.println(email.orElse("raj"));
		
		
		System.out.println(email.map(String::toUpperCase).orElse("raj"));
	}

}
