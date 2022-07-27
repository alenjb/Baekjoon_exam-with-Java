package Stage8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Prob7 {
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

		int ch= Integer.parseInt(br.readLine());
		int five=ch/5;
		int a=0;
		if((ch%5) %3 !=0) {
			for(int i=ch/5; i>0; i--) {
				a= ch-5*i;
				if(a>0&&a %3==0) {
					bw.write( (i+ a/3)+"");
					break;
				}
			}
			if(a>0&&a%3==0) {}
			else if(a<=0||ch%3!=0) {bw.write(-1+"");
}
			else {
				bw.write(ch/3+"");

			}
		}
		else {
			bw.write(((ch%5)/3)+ five+"");
		}
		bw.flush();
		
	}

}
