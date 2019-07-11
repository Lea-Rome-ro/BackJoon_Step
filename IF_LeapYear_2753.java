import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.StringTokenizer;

public class IF_LeapYear_2753 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int year = Integer.parseInt(br.readLine());
		if(year%4 == 0) {
			if(year%100 == 0) {
				if(year%400 ==0)
					bw.append("1");
				else bw.append("0");
			}
			else bw.append("1");
		}
		else bw.append("0");
		bw.flush();
	}
}
