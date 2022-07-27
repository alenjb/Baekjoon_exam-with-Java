package Stage8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Prob5 {
	public static void main(String[] args) throws Exception{
		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer= new BufferedWriter(new OutputStreamWriter(System.out));
		int ch= Integer.parseInt(reader.readLine());
//		StringTokenizer st=new StringTokenizer(reader.readLine());
		for(int i=0; i<ch; i++) {
			StringTokenizer st=new StringTokenizer(reader.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			int c=Integer.parseInt(st.nextToken());
			int result1=c/a;
			int result2=c%a;
			if(i==ch-1) {
				if(result2==0) {
					int result=a*100+result1;
					writer.write(result+"");
				}
				else {			
					int result=result2*100+result1+1;
					writer.write(result+"");

				}
			}
			else {
				if(result2==0) {
					int result=a*100+result1;
					writer.write(result+""+"\n");
				}
				else {			
					int result=result2*100+result1+1;
					writer.write(result+""+"\n");

				}
			}


		}
		writer.flush();

	}
}
