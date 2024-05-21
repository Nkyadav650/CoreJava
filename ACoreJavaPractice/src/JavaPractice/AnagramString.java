package JavaPractice;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="the sohan is silent but sonah listen and drink the tea and it eat coffee";
String []arr=s.split(" ");
for(int i=0;i<arr.length;i++) {
	String s1=arr[i];
	for(int j=i+1;j<arr.length;j++) {
		String s2=arr[j];
		//for remove the all white spaces from the string
		String str1=s1.replaceAll("//s", "");
		String str2=s2.replaceAll("//s", "");
		
		boolean status=false;
		//check the length of both strings equal or not
		if(str1.length()!=str2.length()) {
			status=false;
		}else {
			//first convert string into lower case after that convert into character array
			
			char []arrS1=s1.toLowerCase().toCharArray();
			char []arrS2=s2.toLowerCase().toCharArray();
		//sort the array 
			Arrays.sort(arrS1);
			Arrays.sort(arrS2);
			
			//compare the array
			status=Arrays.equals(arrS1,arrS2);
			if(status) {
				System.out.println(s1+"="+s2);
			}
		}
		
		/*
		 * int count=0; for(int k=0;k<s1.length();k++) { char ch=s1.charAt(k); for(int
		 * m=0;m<s2.length();m++) { if(ch==s2.charAt(m)) { count++; } } }
		 * if(count==s2.length()) { System.out.println(s1); }
		 */
	}
}
	}

}
