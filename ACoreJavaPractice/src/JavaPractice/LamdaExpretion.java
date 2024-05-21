package JavaPractice;

import java.util.Arrays;

interface Greeting{
	public void greet();
}
public class LamdaExpretion {

	public static void main(String[] args) {
		int x=3;
		int y=5;
		int [] arr= {1,2,3,4,5,6};
		/*
		 * Greeting g=new Greeting() {
		 * 
		 * @Override public void greet() { System.out.println(x+y);
		 * 
		 * }
		 * 
		 * }; g.greet();
		 */
		
		  Greeting g=()->{System.out.println(x+y);
		   }; g.greet();
		   Arrays.stream(arr).forEach(ar->System.out.println(ar));
			 
	}
}
