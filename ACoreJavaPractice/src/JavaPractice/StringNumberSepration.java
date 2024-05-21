package JavaPractice;

import java.util.Scanner;

public class StringNumberSepration {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner (System.in);
		String s=sc.nextLine();
	String number="";
	int count=0;
		for(int i =0;i<s.length();i++) {
			
			char ch=s.charAt(i);
			if(ch>='0'&& ch<='9') {
				number=number+ch;
			count++;
			}else if(count>0){
				number=number+' ';
				count=0;
			}
		}
		
		System.out.println(number.trim());
		

	}
	
	
}
