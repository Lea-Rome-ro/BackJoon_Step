import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class One_Dimensional_Ordering_Cnt_Of_Number_2577 {
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int A = Integer.parseInt(br.readLine()), B = Integer.parseInt(br.readLine()), C=Integer.parseInt(br.readLine());
		int i=0,result = A*B*C;
		int[] arr = new int[10], num = new int[10];
		while(true) {
			arr[i] = result%10;
			i++;
			result /= 10;
			if(result==0)break;
		}
		for(int m=0; m<i; m++) {
			num[arr[m]]++;
		}
		for(int m=0; m<9; m++) {
			bw.append(String.valueOf(num[m])).append("\n");
		}
		bw.append(String.valueOf(num[9]));
		bw.flush();
	}
}