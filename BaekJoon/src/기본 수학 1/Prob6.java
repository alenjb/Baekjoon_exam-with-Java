package Stage7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Prob6 {
	
	public static void main(String[] args) throws Exception{
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		String inputS=bf.readLine();
		String [] strs=inputS.split(" ");
		int len=strs.length;
		for(int i=0; i<strs.length;i++) {
			if(strs[i].equals("")) {
				len--;
			}
			
		}
		System.out.println(len);
	}

}
