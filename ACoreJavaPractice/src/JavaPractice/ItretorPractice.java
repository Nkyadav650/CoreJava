package JavaPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ItretorPractice {

	public static void main(String[] args) {
		List<String>v=new Vector<>();
		v.add("sona");
		v.add("raj");
		v.add("jk");
		v.add("vidyant");
		
		Iterator <String>itr=v.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		/*
		 * List<String>li=new LinkedList<>(); li.add("AKSHAY"); li.add("SAURABH");
		 * li.add("CHARAN"); li.add("SONAL"); Iterator<String>itr=li.iterator();
		 * while(itr.hasNext()) { System.out.println(itr.next()); }
		 */
		/*
		 * // TODO Auto-generated method stub List<Integer>list=new ArrayList<>();
		 * list.add(10); list.add(20); list.add(30); list.add(40);
		 * Iterator<Integer>itr=list.iterator(); while(itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 */
	}

}
