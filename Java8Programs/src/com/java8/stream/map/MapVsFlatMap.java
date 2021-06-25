package com.java8.stream.map;
import java.util.*;
import java.util.stream.Collectors;

public class MapVsFlatMap {

	public static void main(String[] args) {
	
		
		List<Customer> customers=CustomerDataBase.getAll();
		
		//list of customer to list of string=>data transfornation
		//customer->customer.getEmail()-one to one mapping 
		
		List<String> emails=customers.stream().map(customer->customer.getEmail()).collect(Collectors.toList());
		System.out.println(emails);
		List<List<String>> phones=customers.stream().map(customer->customer.getPhoneNumbers()).collect(Collectors.toList());
		System.out.println(phones);
		//customer->customer.getPhoneNumbers()-one to many mapping
		
		List<String> phonenumbers=customers.stream().flatMap(customer->customer.getPhoneNumbers().stream()).collect(Collectors.toList());
		System.out.println(phonenumbers);
	}

}
