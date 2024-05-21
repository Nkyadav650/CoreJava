package RecursionPractice;

import java.util.HashMap;
import java.util.Map;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Developer";
		int count=0;
		String ss="";
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			count=0;
			for(int j=0;j<s.length();j++) {
				
				if(ch==s.charAt(j)) {
					count++;
					
				
				}
			}
			map.put(ch, count);
		}
		for (Map.Entry<Character, Integer> set:map.entrySet() ) {
		System.out.println(set.getKey()+": "+set.getValue());
			
		}
		/*
		 * String newS=""; for(int i=s.length()-1;i>=0;i--) { char ch=s.charAt(i);
		 * newS+=ch; } System.out.println(newS);
		 */
		/*
		 * String[]arr=s.split(" "); int count=0,longest=0; String newword=""; for(int
		 * i=0;i<arr.length;i++) { String word=arr[i]; count=0; for (int
		 * j=0;j<word.length();j++) { char ch=word.charAt(j); count++; if(count>longest)
		 * { longest=count; newword=word; } } }
		 * System.out.println("longest word: "+newword+"\n And letter: "+longest);
		 */}

}
