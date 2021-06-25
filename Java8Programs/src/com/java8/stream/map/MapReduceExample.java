package com.java8.stream.map;

import java.util.*;

public class MapReduceExample {

	public static void main(String[] args) {
		
		
		List<Integer> num=Arrays.asList(5,3,2,15,1);
		List<String> word=Arrays.asList("akash","ravi krishna","manohar","sai ram");
		
		int sum=0;
		for(int i:num)
		{
			sum=sum+i;
		}
		System.out.println(" sum "+sum);
		
	int sum1=	num.stream().mapToInt(i->i).sum();System.out.println("map sum:"+sum1);
	
	int sum2=	num.stream().reduce(1, (a,b)->a*b);System.out.println("reduce sum:"+sum2);
	Optional<Integer> sum3=	num.stream().reduce(Integer::sum);System.out.println("reduce  method sum:"+sum3);
	
	int max=	num.stream().reduce(1, (a,b)->a>b?a:b);System.out.println("max value  :"+max);
	
	int maxValue=	num.stream().reduce(Integer::max).get();System.out.println("max value  with method reference :"+maxValue);
	
	
	String longstring=word.stream().reduce((word1,word2)->word1.length()>word2.length()?word1:word2).get();
	System.out.println("longest string :"+longstring);
	
	}

}
