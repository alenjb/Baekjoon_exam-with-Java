package Stage8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Prob4 {
	public static void main(String[] args) throws Exception{
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(bf.readLine()); //StringTokenizer인자값에 입력 문자열 넣음
		int a = Integer.parseInt(st.nextToken()); //첫번째 호출
		int b = Integer.parseInt(st.nextToken()); //두번째 호출
		int v = Integer.parseInt(st.nextToken()); //세번째 호출
		int k=0;
		if((v-b)%(a-b)==0) {k=(v-b)/(a-b);}
		else {k=(v-b)/(a-b)+1;}
		bw.write(k+"");
		bw.flush();
	}
}
