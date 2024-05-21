package com.MatrixArray;

public class MathPerfactNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int start=4;
int end=44;
int sum=0;
for (int i = start; i <= end; i++) {
	int x=i;
	boolean flag=true;
	while(x!=0) {
		int r=x%10;
		//System.out.print("r value "+r);
	if(r==0) {
		flag=false;
	}
		if(r!=0 && i%r!=0) {
			flag=false;
		}
		x/=10;
		//System.out.println("x value "+x);
	}
	if(flag) {
		System.out.print(i+" ");
		sum+=i;
	}
	}
System.out.println();
System.out.println(sum);

	}

}
