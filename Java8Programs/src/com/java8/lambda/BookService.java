package com.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

	
	public List<Book> getBookInsort()
	{
		List<Book> books=new BookDAO().getBooks();
		Collections.sort(books,( o1,  o2)-> { return o2.getName().compareTo(o1.getName());
		}
			);
		return books;
	}
	public static void main(String[] args) {
		
		System.out.println(new BookService().getBookInsort());
	}
}

/*class MyComparator implements Comparator<Book>
{

	@Override
	public int compare(Book o1, Book o2) {

		
		
		return o2.getName().compareTo(o1.getName());
	}
	
	
}*/