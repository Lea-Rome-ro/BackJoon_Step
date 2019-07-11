import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class While_InputSum5_10952 {
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String a;
		while(true) {
			a = br.readLine();
			int b = a.charAt(0)+a.charAt(2)-96;			
			if(b==0)break;
			bw.append(String.valueOf(b)).append("\n");
			bw.flush();
		}
	}
}