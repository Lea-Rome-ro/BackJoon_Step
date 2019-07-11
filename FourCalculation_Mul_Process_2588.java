import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.StringTokenizer;

public class FourCalculation_Mul_Process_2588 {
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine()),b = Integer.parseInt(br.readLine());
		int tmp1, tmp2=0, tmp3=b%10;
		b = (b-tmp3)/10;
		tmp1 = a*(tmp3);
		tmp2 += tmp1;
		bw.append(String.valueOf(tmp1)).append("\n");
		tmp3 = b%10;
		b = (b-tmp3)/10;
		tmp1 = a*(tmp3);
		tmp2 += 10*tmp1;
		bw.append(String.valueOf(tmp1)).append("\n");
		tmp1 = a*b;
		bw.append(String.valueOf(tmp1)).append("\n");
		tmp2 += 100*tmp1;
		bw.append(String.valueOf(tmp2));
		bw.flush();
	}
}
