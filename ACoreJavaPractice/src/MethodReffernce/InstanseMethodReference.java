package MethodReffernce;
interface Sayable{
	void say();
}
public class InstanseMethodReference {
public void print() {
	System.out.println(" It is a best printer");
}
	public static void main(String[] args) {
		//Referring non-static method using Reference
		InstanseMethodReference method= new InstanseMethodReference();
		Sayable s1=method::print;
		s1.say();
	
		
		//Referring Non-static method using anonymous object
		Sayable s2=new InstanseMethodReference()::print;
		//calling the Interface method
		s2.say();

	}

}
