package com.MatrixArray;

public class EmployeeDetails {
int empId;
String empName;
double salary;
int deptNum;
String location;
public EmployeeDetails() {
	super();
}
public EmployeeDetails(int empId, String empName, double salary, int deptNum, String location) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.salary = salary;
	this.deptNum = deptNum;
	this.location = location;
}
@Override
public String toString() {
	return "EmployeeDetails [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", deptNum=" + deptNum
			+ ", location=" + location + "]";
}


}
