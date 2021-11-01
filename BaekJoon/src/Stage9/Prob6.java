package Stage9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Prob6 {
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		int testCase=Integer.parseInt(br.readLine());
		for(int i=0; i<testCase; i++) {
			int num=Integer.parseInt(br.readLine());
			int startNum=0; int gap=num;
			for(int j=2; j<=num/2; j++) {
				if(!check(j) && !check(num-j)) {
					if(num-2*j<gap) {
						gap=num-2*j; startNum=j;
					}
				}
			}
			bw.write(startNum+" "+(startNum+gap)+"\n");
			
		}
		bw.close();
		
	}
	//소수이면 false
	static boolean check(int num) {
		for(int i=2; i*i<=num; i++) {
			if(num%i==0) return true;
		}
		return false;
	}
}
