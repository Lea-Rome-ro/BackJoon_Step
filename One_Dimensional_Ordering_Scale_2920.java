import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.StringTokenizer;

public class One_Dimensional_Ordering_Scale_2920 {
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[8];
		boolean asc = true, desc = true;
		arr[0] = Integer.parseInt(st.nextToken());
		for(int i=1; i<8; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(arr[i-1]>arr[i])asc = false;
			if(arr[i-1]<arr[i])desc = false;
		}
		if(asc==true) bw.append("ascending");
		else if(desc==true) bw.append("descending");
		else bw.append("mixed");
		bw.flush();
	}
}