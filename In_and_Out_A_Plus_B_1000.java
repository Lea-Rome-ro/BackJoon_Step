import java.util.Scanner;
public class In_and_Out_A_Plus_B_1000 {
	
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		A += B;
		System.out.println(A);
	}
}
