package com.java8.functionaldemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo  {

	public static void main(String[] args) {
		//<String> supplier= ()-> "hi java spring ";
		
		//System.out.println(supplier.get());
		List<String> list=Arrays.asList();
		
		System.out.println(list.stream().findFirst().orElseGet(()-> "hi java world  "));
	}
	
}
