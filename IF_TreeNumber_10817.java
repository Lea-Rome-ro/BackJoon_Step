import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class IF_TreeNumber_10817 {
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A, B, C;
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		if(A>=B&&A<=C || A>=C&&A<=B) {
			bw.append(String.valueOf(A));
		}else if(B>=C&&B<=A || B>=A&&B<=C) {
			bw.append(String.valueOf(B));
		}else if(C>=A&&C<=B || C>=B&&C<=A) {
			bw.append(String.valueOf(C));
		}
		bw.flush();
	}

}
