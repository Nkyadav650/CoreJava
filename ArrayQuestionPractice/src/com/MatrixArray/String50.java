package com.MatrixArray;
 /* class Nk{
	private int id;
	private String name;
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return  name;
	}

public void show (){
System.out.println(id);
System.out.println(name);

}}*/
public class String50{

	public static void main(String[] args) {
		/*Nk s1=new Nk();
		s1.setId(101);
		s1.setName("Rawan");
		s1.show();
	}
}*/
String s="jamochattechpvt";
char ch='9';
for (int i = 0; i < s.length(); i++) {
	int count=0;
	for (int j = i+1; j<s.length(); j++) {
		
		if(s.charAt(i)==s.charAt(j)&&ch!=s.charAt(j)) {
			count++;
			ch=s.charAt(i);
		}
	}
	if(count==0) {
	 System.out.println(s.charAt(i));
	}
}
	}

}