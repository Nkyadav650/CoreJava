package com.MatrixArray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class EmployeeCollection {

	public static void main(String[] args) {

		List<EmployeeDetails> emp = new ArrayList<>();
		emp.add(new EmployeeDetails(101, "sathya", 20000.00, 20, "hyderabad"));
		emp.add(new EmployeeDetails(102, "sharma", 10000.00, 10, "ameerpet"));
		emp.add(new EmployeeDetails(103, "sona", 50000.00, 30, "chennai"));
		emp.add(new EmployeeDetails(104, "rawan", 100000.00, 40, "madhyapradesh"));
		emp.add(new EmployeeDetails(105, "shubham", 40000.00, 50, "Maharastra"));
		emp.add(new EmployeeDetails(106, "rajesh", 45000.00, 60, "chennai"));

		Scanner sc=new Scanner(System.in);
		// System.out.println(emp);
		
		 // for(EmployeeDetails ed:emp) {
		 /* 
		 * if(ed.empId==102) { System.err.println(ed); } if(ed.deptNum==20) {
		 * System.out.println(ed); } if(ed.salary>=40000.00&&ed.salary<=45000.00) {
		 * System.out.println(ed); } System.out.println("------------------");
		 * if(ed.salary>40000.00) { System.out.println(ed); }
		 * 
		 * 
		 * if(ed.empId==102 || ed.empId==103) { System.out.println(ed); }
		 * 
		 * 
		 * }
		 */
		/*
		 * Collections.sort(emp,(e1 ,e2)->e2.empId-e1.empId);
		 * emp.stream().forEach(System.out::println);
		 */
		/*if(ed.location.equalsIgnoreCase("hyderabad")||ed.location.equalsIgnoreCase("chennai")||ed.deptNum==20) {
			System.out.println(ed);
		}
*/	
	char ch='y';
	while(ch=='y') {
		System.out.println("Enter empId: ");
		int empId=sc.nextInt();
		for(EmployeeDetails em:emp) {
		if(empId==em.empId) {
			System.out.println(em);
		}
		
	}
		System.out.println("Do you want to continue(y/n): ");
		char c=sc.next().charAt(0);
		ch=c;
	}
	sc.close();
	}
}
