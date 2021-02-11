import java.util.Scanner;
public class Method4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("x=?");
		int x=sc.nextInt();
		System.out.println("n=?");
		int n=sc.nextInt();
		System.out.println(pow(x, n));
	}
	public static long pow(int x, int n) {
		long result=1;
		for(int i=1;i<=n;i++) {
			result*=x;
		}
		return result;
	}

}
