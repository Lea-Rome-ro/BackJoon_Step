import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.StringTokenizer;

public class IF_SmallerThanX_10871 {
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N, X;
		N = Integer.parseInt(st.nextToken());
		X = Integer.parseInt(st.nextToken());
		int[] A = new int[N+1];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
			if(A[i]<X) {
				bw.append(String.valueOf(A[i]));
				if(i!=N-1)
					bw.append(" ");
			}
		}
		bw.flush();
	}
}
