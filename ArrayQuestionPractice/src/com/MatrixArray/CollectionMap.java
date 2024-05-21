package com.MatrixArray;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CollectionMap {
	public String name;
public int id;

	public static void main(String[] args) {
		Map<Integer,String>sd=new HashMap<>();
		sd.put(1, "rawan");
		sd.put(2,"sona");
		sd.put(3, "manu");
		sd.put(4, "kumar");
		for(Map.Entry print:sd.entrySet()) {
			System.out.println(print.getKey()+" "+print.getValue());
		}
		System.out.println("======================");
		sd.putIfAbsent(5, "rajkumar");
		for(Map.Entry m1:sd.entrySet()) {
			System.out.println(m1.getKey()+" "+m1.getValue());
		}
		System.out.println("=======================");

		Map<Integer,String>rm=new HashMap<>();
		rm.put(6, "vishvash");
		rm.putAll(sd);
		for(Map.Entry s:rm.entrySet()) {
			System.out.println(s.getKey()+" "+s.getValue());
		}
		System.out.println("=====================");
		rm.remove(6);
		for(Map.Entry s1:rm.entrySet()) {
			System.out.println(s1.getKey()+" "+s1.getValue());
		}
		rm.replace(2,"ram");
		for(Map.Entry k:rm.entrySet()) {
			System.out.println(k.getKey()+" "+k.getValue());
		}
		
		/*
		 * Map<String,Integer>sd=new HashMap<String,Integer>(); sd.put("A", 1);
		 * sd.put("B", 2); sd.put("C", 3);
		 * 
		 * for (Map.Entry m: sd.entrySet()) {
		 * System.out.println(m.getKey()+" "+m.getValue()); }
		 */	}

}
