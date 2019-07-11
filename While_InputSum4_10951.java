import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class While_InputSum4_10951 {
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String a;
		while((a = br.readLine())!=null) {
			//System.out.println(String.valueOf(a.charAt(2)));
			int b = a.charAt(0)+a.charAt(2)-96;			
			bw.append(String.valueOf(b)).append("\n");
			bw.flush();
		}
	}
}