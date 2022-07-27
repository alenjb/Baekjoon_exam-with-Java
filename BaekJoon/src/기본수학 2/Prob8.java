package Stage8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;


public class Prob8 {
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st= new StringTokenizer(br.readLine());
		BigInteger first = new BigInteger(st.nextToken());
		BigInteger second = new BigInteger(st.nextToken());
		BigInteger result=first.add(second);
		bw.write(result.toString());
		bw.flush();
		
	}
}
