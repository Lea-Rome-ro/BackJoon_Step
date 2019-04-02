//import java.lang.String;
import java.util.Scanner;
public class For_InputSum_11720 {
	public static void main(String[] args)throws Exception{
		Scanner sc = new Scanner(System.in);
		int tmp,sum=0,n=sc.nextInt();
		String val = sc.next();
		for(int i=1;i<=n;i++) {
			tmp= val.charAt(i-1)-'0';
			sum += tmp;
		}		
		System.out.println(sum);		
	}
}