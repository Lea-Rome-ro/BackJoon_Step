import java.util.Scanner;
public class For_StarPrint4_2441 {
	public static void main(String[] args)throws Exception{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int k=N;
		for(int i=N; i>0; i--) {
			for(int j=N-k; j>0; j--) {
				System.out.print(" ");
			}
			for(int j=k; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
			k--;
		}
	}
}