package Stage9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Prob9 {
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			StringTokenizer st= new StringTokenizer(br.readLine());
			int a= Integer.parseInt(st.nextToken());
			int b= Integer.parseInt(st.nextToken());
			int c= Integer.parseInt(st.nextToken());
			int sum=0;
			if(a+b+c==0) {break;}
			else {
				int k=Math.max(Math.max(a, b),c);
				if(k==a) {sum=b*b+c*c;}
				else if(k==b) {sum= a*a+c*c;}
				else {sum= a*a+b*b;}
				if(k*k==sum) {bw.write("right\n");}
				else {bw.write("wrong\n");}
			}
		}
		bw.close();
	}
}
