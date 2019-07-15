import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.StringTokenizer;

public class One_Dimensional_Ordering_Min_Max_10818 {
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int min=Integer.MAX_VALUE, max = Integer.MIN_VALUE, N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(arr[i]>max)max=arr[i];
			if(arr[i]<min)min=arr[i];
		}	
		bw.append(String.valueOf(min)+" "+String.valueOf(max));
		bw.flush();
	}
}