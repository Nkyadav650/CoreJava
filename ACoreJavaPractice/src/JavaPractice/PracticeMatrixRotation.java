package JavaPractice;

import java.util.Scanner;

public class PracticeMatrixRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
System.out.print("Enter the size of Array");
int size=sc.nextInt();
int arr[][]=new int[size][size];

System.out.println("Arr.length"+arr.length);

for (int i=0; i<arr.length;i++) {
	for(int j=0;j<arr.length;j++) {
	System.out.print("Enter the"+i+","+j+" index value:");
		arr[i][j]=sc.nextInt();
	}
}
//for take the rotation input
System.out.print("Enter the nos of rotation:");
int rotation=sc.nextInt();
int arrs[][]=new int[size][size];
System.out.println("Arrs.length"+arrs.length);
for(int k=0;k<rotation;k++) {


for(int i=0;i<arrs.length;i++) {
	for(int j=0;j<arrs.length;j++) {
		arrs[size-j-1][i]=arr[i][j];
	}	
}

	}

// for printing purpose
for(int i=0;i<arrs.length;i++) {
	for(int j=0;j<arrs.length;j++) {
		System.out.print(arrs[i][j]);
	}
	System.out.println();
}
	}

}
