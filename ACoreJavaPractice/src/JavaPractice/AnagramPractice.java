package JavaPractice;

import java.util.Arrays;

public class AnagramPractice {

	public static void main(String[] args) {
		String s="the sohan is silent but sonah listen and drink the tea and it eat coffee";
		String []arr=s.split(" ");
		for (int i=0;i<arr.length; i++) {
			String s1=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				String s2=arr[j];
				//first remove the white spaces from the string
				String str1=s1.replaceAll("//s", "");
				String str2=s2.replaceAll("//s", "");
				
				boolean status=false;
				//check the length of String equal or not
				if(str1.length()!=str2.length()) {
					status=false;
					
				}else {
					//for convert into the String to character array
					char []arr1=str1.toLowerCase().toCharArray();
					char[] arr2=str2.toLowerCase().toCharArray();
					
					//short the arrays
					Arrays.sort(arr1);
					Arrays.sort(arr2);
					//compare the two string are equal or not
					status=Arrays.equals(arr1, arr2);
				}
				if(status) {
					System.out.println(s1);
				}
			}
		}
		
	}

}
