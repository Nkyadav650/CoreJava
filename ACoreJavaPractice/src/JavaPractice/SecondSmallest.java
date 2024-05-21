package JavaPractice;

import java.util.Scanner;

public class SecondSmallest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array");
		int size=sc.nextInt();
		int []arr= new int[size];
		for(int i=0;i<size;i++) {
			System.out.print("Enter "+i+"th element:");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println(arr[0]);
	}

}
