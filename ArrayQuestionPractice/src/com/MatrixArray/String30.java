package com.MatrixArray;

import java.util.Arrays;

public class String30 {

	public static void main(String[] args) {

String s="xvz";
int k=2;
int count=0,res=0;
boolean []arr=new boolean[26];
for (int i=0;i<s.length();i++) {
	Arrays.fill(arr, false);
	count=0;
	for (int j = i; j < s.length(); j++) {
		char ch=s.charAt(j);
		int idx=ch-'a';
		if(arr[idx]==false) {
			arr[idx]=true;
			count++;
		}
		if(count==k) {
        System.out.println(s.substring(i,j+1));
		res++;
		}
	}
}
System.out.println(res);
	}

}
