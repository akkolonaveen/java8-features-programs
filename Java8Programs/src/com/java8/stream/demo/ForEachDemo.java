package com.java8.stream.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ForEachDemo {
	
	public static void main(String[] args) {
		
		
		//Predicate<String> predicate =ForEachDemo();
		List<String> list=new ArrayList<>();
		
		list.add("john");
		list.add("david");
		list.add("steve");
		list.add("cris");
		list.add("cris jordon");
		
		for(String s:list)
		{
			if(s.startsWith("cr")) {
			System.out.print(s+"  ");}
		}
		
		list.stream().filter(t->t.startsWith("s")).forEach(i->System.out.println(i+" "));
		
		//list.stream().forEach(i->System.out.println(i+" america"));
		
		Map<Integer,String> map=new HashMap<>();
		
		map.put(100,"aa")	;
		map.put(101,"bb")	;
		map.put(102,"cc")	;
		map.put(103,"dd")	;
		
		//map.forEach((key,value)->System.out.println(key+" "+value));
		
	
		map.entrySet().stream().filter(k->k.getKey()%2==0).
		forEach(obj->System.out.println(obj));
		Consumer<String> con=t->System.out.println(t);
		for(String s:list)
		{
			con.accept(s);
		}
		
	}

}
