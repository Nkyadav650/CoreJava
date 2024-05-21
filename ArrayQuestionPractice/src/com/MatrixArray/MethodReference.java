package com.MatrixArray;
@FunctionalInterface
interface Greating{
	void great();
}

public class MethodReference {
 static void atmanirbhar() {
	System.out.println("In india every people togather to make india atmanirbhar");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Greating gr=MethodReference::atmanirbhar;
gr.great();
	}

}
