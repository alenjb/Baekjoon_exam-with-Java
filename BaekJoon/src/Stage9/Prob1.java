package Stage9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Prob1 {
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		int ch=Integer.parseInt(br.readLine());int count=0;
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		for(int i=0; i<ch; i++) {
			int num=Integer.parseInt(st.nextToken());
			if(num==1) {
				count++;
			}
			for(int j=1; j<num;j++) {
				if(j!=1 && num%j==0) {
					count++;
					break;
				}
			}
			
		}
		bw.write((ch-count)+"");
		bw.flush();
	}
}
