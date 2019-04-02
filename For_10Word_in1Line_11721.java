import java.util.Scanner;
public class For_10Word_in1Line_11721 {
	public static void main(String[] args)throws Exception{
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int n = input.length();
		for(int i=1;i<=(n/10); i++) {
			System.out.println(input.substring((i-1)*10, i*10));
		}
		System.out.println(input.substring((n/10)*10,n));
	}
}