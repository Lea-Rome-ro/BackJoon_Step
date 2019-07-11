import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.StringTokenizer;

public class IF_AlarmClock_2884 {
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h,m;
		h = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		if(m<45) {
			if(h==0)
				h=23;
			else 
				h--;
			m += 15;
		}
		else m -= 45;
		
		bw.append(String.valueOf(h)+" "+String.valueOf(m));
		bw.flush();
	}

}
