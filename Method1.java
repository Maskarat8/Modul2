
public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The sum is " + xMethod(5));
		System.out.println("The sum is " + yMethod(5));
	}
	
	public static int xMethod(int n) {
		if (n == 1) {
			return 1;
		}else {
			return n + xMethod(n - 1);
		}
	}
	
	public static int yMethod(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}

}
