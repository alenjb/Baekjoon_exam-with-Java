package Stage8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Prob6 {
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		int testCase= Integer.parseInt(br.readLine());
		for(int a=0; a<testCase; a++) {
			int k=Integer.parseInt(br.readLine());
			int n=Integer.parseInt(br.readLine());
			bw.write(check(k, n)+"\n");
		}
		bw.close();
	}
	//인원을 계산하는 check함수
	static int check(int k, int n) {
		int result=0;
		if(k==0)result=n;
		else {
			for(int i=1; i<=n; i++) {
				//아래층 1호부터 n호까지 더하기
				result=result+check(k-1, i);
			}
		}
		return result;
		
	}
}
