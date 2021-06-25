package com.java8.lambda;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
	
	
	public List<Book> getBooks()
	{
		List<Book> books=new ArrayList<>();
		
		books.add(new Book(101,"adv java",400));
		books.add(new Book(102,"hibernate",100));
		books.add(new Book(103,"spring",200));
		books.add(new Book(104,"webservice",300));
		return books;
	}

}
