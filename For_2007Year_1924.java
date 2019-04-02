import java.util.Scanner;
public class For_2007Year_1924 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int k=0;
		for(int i=x-1; i>0; i--) {
			if(i==2) k+=28;
			else if(i%2==0&&i<7 || i%2!=0&&i>8) k+=30;
			else k+=31;
		}
		k= (k+y)%7;
		
		switch(k){
		
		case 0:System.out.println("SUN"); break;
		case 1:System.out.println("MON"); break;
		case 2:System.out.println("TUE"); break;
		case 3:System.out.println("WED"); break;
		case 4:System.out.println("THU"); break;
		case 5:System.out.println("FRI"); break;
		case 6:System.out.println("SAT"); break;
		default : break;
		
		}
	}
}