package RecursionPractice;
import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			System.out.print("Enter A Number: ");
			int num=sc.nextInt();
	Recursion.print(num);
	}int i;
	static void print(int num) {
		
		if(num>0) {
			
         	print(num-1);
         	System.out.println(num);
		}
		
	}
}
