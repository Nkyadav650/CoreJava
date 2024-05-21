package com.MatrixArray;

public class String42 {

	public static void main(String[] args) {
		int []arr= {0,0,1,0,0};
		int count=0;
		int k=2;
		for (int i = 0; i < arr.length; i++) {
			if(i==0) {if(arr[i]==0&& arr[i+1]==0) {
				arr[i]=1;
				count++;
			}}
			else if(i>0&&i<arr.length-1) {
				if(arr[i]==0&&arr[i+1]==0&&arr[i-1]==0) {
					
				
				arr[i]=1;
				count++;
			}
		}else if (arr[i]==0&&arr[i-1]==0){
			arr[i]=1;
			count++;
		}
			}
		if(count==k) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}

}
