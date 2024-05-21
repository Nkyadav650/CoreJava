package MethodReffernce;

public class MethodReffernce_1 {
public static void print() {
	System.out.println("This is print method");
}
	
	public static void main(String[] args) {
		Thread t1= new Thread(MethodReffernce_1::print);
t1.start();
	}

}
