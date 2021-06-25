package com.java8.functionaldemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo  implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println("printing  "+t);
		
	}
	public static void main(String[] args) {
		
	//Consumer con=( t) ->System.out.println("printing  "+t);

	//con.accept(15);
	
	List<Integer> list=Arrays.asList(5,2,3,6,8);
	
	list.stream().forEach(( t) ->System.out.println("printing  "+t));
	}
	

}
