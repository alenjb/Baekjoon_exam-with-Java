package Stage8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Prob9 {
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		int ch= Integer.parseInt(br.readLine());
		for(int i=0; i<ch; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long first= Long.parseLong(st.nextToken());
			long second= Long.parseLong(st.nextToken());
			long interval= second-first;
			if(interval==1) {
				bw.write(2+"");
			}else {
				for(long j=2; ; j++) {
					if(interval>=(j-1)*j/2 &&interval<=j*(j+1)/2) {
						bw.write((j+1)+"");
						break;
					}
			}
			}
			if(i==ch-1) {
				break;
			}
			bw.write("\n");
//			bw.flush();
			
		}
		bw.flush();

	}

}
