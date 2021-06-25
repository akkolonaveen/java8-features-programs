package com.java8.interfaces;


interface  Calculator
{
	//void switchOn();
	//void sum(int i);
	
	int sub(int i,int j);
	
}
public class CalculatorImpl   {
	
	public static void main(String[] args) {
		//Calculator cal= ()-> System.out.println("switch on");

		//cal.switchOn();
	
	
	
	//Calculator cal= (i)-> System.out.println("input sum "+i);
	//cal.sum(5);	
	
	Calculator cal1=  (i, j)-> {
		if(i>j)
		{
			return i-j;
		
		
		}
		else {
		return	j-i;
		}
	};
	 System.out.println(cal1.sub(11 , 5));
	}

	}
