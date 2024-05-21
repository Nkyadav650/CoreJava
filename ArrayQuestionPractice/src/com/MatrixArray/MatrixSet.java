package com.MatrixArray;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@FunctionalInterface
 interface A{
	 void name(int x);
}
public class MatrixSet {
	// static int count=0;
	public static void main(String[] args) {
		 List<String> names=List.of("Sonu","monu","anu","vidyant");
       names.forEach(null);
	
	
	}
}
		/*
	 * List<Integer> generate = MatrixSet.generate(10);
	 * System.out.println(generate); } public static List<Integer> generate(int
	 * series) { Set<Integer> set = new TreeSet<>(); return Stream.iterate(1, i ->
	 * ++i) .filter(i -> i %2 != 0) // lambda expression .filter(i -> { set.add(i);
	 * return 0 == set.stream() .filter(p -> p != 1) .filter(p -> !Objects.equals(p,
	 * i)) .filter(p -> i % p == 0) .count(); }) .limit(series)
	 * .collect(Collectors.toList()); } }
	 */

	/*
	 * A obj=(e1)->{for (int i = 2; i < e1; i++) { if(e1%i==0) { count++; } }
	 * if(count==0)System.out.println("prim number: "+e1); else
	 * System.out.println("Not prim number"); }; obj.name(6); } }
	 */		/*
	 * String s="sathya"; A a1=(e1,e2)-> {int e3=e1+e2; System.out.println(e3);
	 * System.out.println(s);}; a1.name(15,20); System.out.println("hello");
	 * List<String> names=List.of("Sonu","monu","anu","vidyant");
	 * names.forEach((String n)->System.out.println(n));
	 * System.out.println("xxxxxxcxxxxx");
	 * names.forEach(nv->System.out.println(nv));
	 * 
	 * } }
	 *//*String s="helloworld";
	String s1="";
		for (int i = 0; i < s.length(); i++) {
			String ch=""+s.charAt(i);
			if(!s1.contains(ch)) {
				s1+=ch;
			}
		}
		System.out.println(s1);
	}
	}*/
/*String s="cjss technologies is awesome";
String []rs=s.split(" ");
String newstring="";
for (int i = rs.length-1; i >=0 ; i--) {
	newstring+=rs[i]+" ";
}
System.out.println(newstring);
	}
}*//*String s1="abc";
String s2="abc";
System.out.println(s1==s2);
	}
}*/
		/*String s="aaaabbbcdddd";
	
	for (int i = 0; i <s.length(); i++) {
		int count=1;
		for (int j = i+1; j <s.length(); j++) {	
		if(s.charAt(j)==s.charAt(i)) {
			count++;
			i=j;
		}}
		int cn=0;
		for(int k=2;k<count;k++ ) {
			if(count%k==0) {
				cn++;
			}
		}
		if(cn==0) {
			System.out.println(s.charAt(i)+"-->"+count);
		}
		
	}
	}
	}
	*/	/*String s="ak2b3r";
		String s1="";
		for (int i = 0; i < s.length(); i++) {
		char ch=s.charAt(i);
		if(ch>='0'&&ch<='9') {
			int n=ch-48;
			for (int j = 1; j <n; j++) {
				s1=s1+s.charAt(i-1);
			
			}}else {
				s1+=ch;
			}		
		}
		System.out.println(s1);
	}
}
		
*/	/*int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
	boolean flag = true;
	for (int i = 0; i < arr.length/2; i++) {// changing the elements positions
		for (int j = 0; j < arr[i].length; j++) {
			int temp=arr[i][j];
		arr[i][j]= arr[j][i];
		arr[j][i]=temp;
		//System.out.print(a);
		
		System.out.println();
	}
		while(flag) {//changing the two pair of element position
			int temp1;
			temp1 = arr[1][2];
			arr[1][2] = arr[2][1];
			arr[2]
					[1] = temp1;
			flag = false;
			}
	for (int k = 0; k < arr.length; k++) {//displaying elements
		for (int j = 0; j < arr[i].length; j++) {
			System.out.print(arr[k][j]);
		}
		System.out.println();
	 }
	*/	/*int[][]arr= {{1,2,3,},{4,5,6}};
//int[][]arr1= {{9,8,7},{6,4,5}};
int sum=0;
for (int i = 0; i < arr.length; i++) {
	for (int j = 0; j < arr[i].length; j++) {
		
	
sum+=arr[i][j];	
}
	}
System.out.println(sum);
	}

}	


	}
}
}*/