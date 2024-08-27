package com.practice;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args)
	{
		System.out.println("enter your string to reverse");
		Scanner scanner=new Scanner(System.in);
		String string=scanner.next();
		char[] charArray = string.toCharArray();
		for(int i=charArray.length-1;i>=0;i--)
		{
			System.out.print(charArray[i]);
		}

		
	}

}
