import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IF_TestScore_9498 {
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int score = Integer.parseInt(br.readLine());
		if(score>=90 && score <=100) {
			bw.append("A");
		}else if(score>=80 && score <=89) {
			bw.append("B");
		}else if(score>=70 && score <=79) {
			bw.append("C");
		}else if(score>=60 && score <=69) {
			bw.append("D");
		}else bw.append("F");
		
		bw.flush();
	}

}
