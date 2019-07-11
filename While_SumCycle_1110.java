import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class While_SumCycle_1110 {
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String a = br.readLine();
		int cnt=0,x,y,tmp,tmp1,tmp2;
		if(a.length()==1) {
			x = 0;
			y = a.charAt(0)-48;			
		}
		else {
			x = a.charAt(0)-48;
			y = a.charAt(1)-48;
		}
		tmp2 = 10*x+y;//¿ø·¡°ª
		tmp1=x;
		while(true) {
			cnt++;
			tmp1 = (tmp1+y)%10;
/*			try {
			System.out.println("y : "+y + ", tmp1 = "+ tmp1);
			Thread.sleep(1000);
			}catch(Exception e) {} */
			if(tmp2==(y*10+tmp1)) break;
			tmp = y;
			y = tmp1;
			tmp1 = tmp;
		}
		bw.append(String.valueOf(cnt));
		bw.flush();
	}
}
