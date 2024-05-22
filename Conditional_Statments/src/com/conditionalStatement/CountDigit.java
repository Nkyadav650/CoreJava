package com.conditionalStatement;
import java.util.*;
class CountDigit
{
	public static void main(String[] args) 
	{
     int count=0;
		System.out.println("Hello World!");
Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");

int n=sc.nextInt();
while(n!=0)
{
n=n/10;
count=count+1;
}
System.out.println("no of digit is: "+count);
sc.close();
	}
	
}
