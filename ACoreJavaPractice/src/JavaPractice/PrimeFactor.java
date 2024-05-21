package JavaPractice;

public class PrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=15;
for(int i=2;i<n;i++) {
	if(n%i==0) {
		int count=0;
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println(i);
		}
	}
}
	}

}
