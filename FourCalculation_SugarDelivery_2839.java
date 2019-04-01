import java.util.Scanner;

public class FourCalculation_SugarDelivery_2839 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a=0,b=0;
		a = N/5;
		while(a>=0) {
			if((N-5*a)%3==0) {
				b = (N-5*a)/3;
				break;
			}
			else a--;
		}
		if(a<0) System.out.println("-1");
		else System.out.println(a+b);
		
	}
}