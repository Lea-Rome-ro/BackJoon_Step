import java.util.Scanner;
public class For_StarPrint2_2439 {
	public static void main(String[] args)throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 1;
		
		for (int i=1; i<=n; i++) {
			for(int j=n-k; j>0; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=k;j++ ) {
				System.out.print("*");
			}
			k++;
			System.out.println();
		}
	}
}