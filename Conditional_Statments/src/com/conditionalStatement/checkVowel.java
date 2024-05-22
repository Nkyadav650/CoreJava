package com.conditionalStatement;
import java.util.Scanner;
class checkVowel
{
checkVowel()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the Character: ");
 char ch=sc.next().charAt(0);
}
 checkVowel(char ch)
{

this();


 System.out.println("I am the boss");
} }
class Logic extends checkVowel
{

Logic(int x)
{
super('c');
switch(ch){
case 'A':
case 'a':
case 'E':
case 'e':
case 'I':
case 'i':
case 'O':
case 'o':
case 'U':
case 'u':
System.out.println("Given Character is vowel: "+ch);
break;
default:System.out.println("Given Character is constent: "+ch);
}
}
}
