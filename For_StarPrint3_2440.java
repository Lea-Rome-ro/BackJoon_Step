import java.util.Scanner;
public class For_StarPrint3_2440 {
	public static void main(String[] args)throws Exception{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=N; i>0; i--) {
			for(int j = i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}
}