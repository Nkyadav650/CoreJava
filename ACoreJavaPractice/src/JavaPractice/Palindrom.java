package JavaPractice;

import java.util.Scanner;

public class Palindrom {

public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
int n=sc.nextInt();
int num=n;
int number=0;
while(num>0) {
	int r=num%10;
	number=(number*10)+r;
	num/=10;
	
}
if (n==number) {
	System.out.println("palindrom");
}else {
	System.out.println("not palindrom");

}
	}

}
