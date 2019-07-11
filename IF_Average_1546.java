import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.StringTokenizer;

public class IF_Average_1546 {
	public static void main (String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		double MAX=0, sum=0, avg=0;
		double[] Arr = new double[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			Arr[i] = Integer.parseInt(st.nextToken());
			if(Arr[i]>MAX) MAX = Arr[i];
		}
		for(int i=0; i<N; i++) {
			Arr[i] = Arr[i]/MAX*100;
			sum += Arr[i];
		}
		avg = sum/N;
		bw.append(String.valueOf(avg));
		bw.flush();
	}
}
