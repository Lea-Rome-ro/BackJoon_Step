import java.util.Scanner;
public class For_Sum_8393 {
	public static void main(String[] args)throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k=0;
		for(int i=1; i<=n; i++) {
			k+=i;
		}
		System.out.println(k);
	}
}