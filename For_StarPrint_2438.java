import java.util.Scanner;
public class For_StarPrint_2438 {
	public static void main(String[] args)throws Exception{
		Scanner sc = new Scanner(System.in);
		int tmp,n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			tmp = i;
			while(tmp>0) {
				System.out.print("*");
				tmp--;
			}
			System.out.println();
		}
	}
}