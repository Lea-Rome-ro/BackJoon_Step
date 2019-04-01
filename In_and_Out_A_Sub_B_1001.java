import java.util.Scanner;
public class In_and_Out_A_Sub_B_1001 {
	
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		A -= B;
		System.out.println(A);
	}
}