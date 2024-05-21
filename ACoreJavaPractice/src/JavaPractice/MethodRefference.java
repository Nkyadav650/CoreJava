package JavaPractice;
interface Sayable{
	void say();
}
public class MethodRefference {
	static void talk() {
		System.out.println("Your are loud speaker");
	}

	public static void main(String[] args) {
		
Sayable sayable= MethodRefference::talk;
sayable.say();
	}

}
