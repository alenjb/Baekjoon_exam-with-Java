package Stage8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Prob9_2 {
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		int testCase= Integer.parseInt(br.readLine());
		for(int i=0; i<testCase; i++) {
			StringTokenizer st= new StringTokenizer(br.readLine());
			int start= Integer.parseInt(st.nextToken());
			int end= Integer.parseInt(st.nextToken());
			int gap= end-start;
			//홀수
			int odd=0;
			for(int j=1; ; j++) {
				if(gap<=j*j) {odd=j; break;}
			}
			//짝수
			int even=0;
			for(int j=1; ; j++) {
				if(gap<=j*(j+1)) {even=j; break;}
			}
			if(odd*odd>even*(even+1)) {
				bw.write(even*2+"\n");
			}
			else {
				bw.write(2*odd-1+"\n");
			}
		}
		bw.close();
	}
}
