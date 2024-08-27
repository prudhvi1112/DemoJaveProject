package com.practice;

import java.util.Scanner;

//program
public class FibonaciNumber 
{
	public static void main(String[] args) 
	{
		int a=0,b=1,c=0;
		System.out.println("enter serie number");
		Scanner scanner=new Scanner(System.in);
		int range = scanner.nextInt();
		System.out.print(a+" "+b+" ");
		for(int i=0;i<range;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			c=0;
			
		}
	}

}

//hello
