package RecursionPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/*class ThreadEx implements Runnable{

	@Override
	public void run() {
		int x=10;
		for(int i=0;i<x;i++) {
			System.out.println("Thread no is: "+i);
		}
		
	}
	
}
*/
 
public class SubArray{
	
	 // int id; String name;
	 
	public static void main(String[] args) {
		Map<Integer,String>map=Map.of(101,"sonu",102,"rawan");
		map.forEach((id,name)->System.out.println("id:"+id+" "+"name:"+name));
		
		List<Emp> emp= Arrays.asList(new Emp(111,"ser",22000.0),
				new Emp(222,"samay",12000.00),
				new Emp(333,"rawan",450000.00));
	    emp.forEach(em->System.out.println(em.id+" "+em.name+" "+em.sal));
		
		//emp.add(111,"ser",22000.0);
		/*int arr[]= {1,2,4,2,4,5,4,2,3};
		int r=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]||r!=999999999) {
					r=999999999;
					arr[j]=r;
				}
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}*/
		/*}
		
			for(int i=0;i<arr.length;i++) {
				if(arr[i]!=r) {
					System.out.println(arr[i]);
				}
			}*/
		
		
		/*
		 * Thread th=new Thread(); th.start();
		 */
		
		// TODO Auto-generated method stub
		/*
		 * int []arr= {-1,4,7,2}; int larg=0; for(int i=0;i<arr.length;i++) {
		 * 
		 * for(int j=i;j<arr.length;j++) { int sum=0; for(int k=i;k<=j; k++) {
		 * System.out.print(arr[k]+" "); // sum+=arr[k]; }
		 * 
		 * if(sum>larg) { larg=sum; }
		 * 
		 * System.out.println(); }
		 * 
		 * }
		 */
	}

}
