package Stage7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Prob10 {
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		int num= Integer.parseInt(br.readLine()); boolean check;
		int count=0;
		//입력받은 수만큼 반복
		for(int i=0; i<num; i++) {
			check=false;
			String line= br.readLine();
			if(line.length()==1||line.length()==2) {}
			else {
				//고정글자
				for(int a=0; a<line.length()-1; a++) {
					//가변글자
					for(int b=a+1; b<line.length(); b++) {
						if(line.charAt(a)==line.charAt(b) &&a!=b-1 &&line.charAt(b-1)!=line.charAt(b)) {
							check=true;break;
						}
						
					} 
				}if(check) count++;
			}
		}
		bw.write(num-count+"");
		bw.flush();
	}

}
