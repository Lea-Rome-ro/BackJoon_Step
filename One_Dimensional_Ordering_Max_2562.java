import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class One_Dimensional_Ordering_Max_2562 {
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int[9];
		int max = Integer.MIN_VALUE, num=0;
		for(int i=0; i<9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(max<arr[i]) {
				max = arr[i];
				num = i+1;
			}
		}
		bw.append(String.valueOf(max)).append("\n").append(String.valueOf(num));
		bw.flush();
	}
}