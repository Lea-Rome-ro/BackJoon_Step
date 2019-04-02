import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class For_Sum_Repeat_15552 {
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int tmp1,tmp2,n = Integer.parseInt(st.nextToken());
		for(int i=1; i<=n; i++) {
			st = new StringTokenizer(br.readLine());
			//tmp1 = Integer.parseInt(st.nextToken());
			//tmp2 = Integer.parseInt(st.nextToken());
			bw.write(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()) + "\n");
			//System.out.println(tmp1+tmp2);
		}
		bw.flush();
		bw.close();
	}
}