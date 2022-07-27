package Stage7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Prob8 {
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str=bf.readLine();
		int count=0;
		for(int i=0; i<str.length(); i++) {
			int a= str.charAt(i);
			if(a<='C') count=count+3;
			else if(a<='F') count=count+4;
			else if(a<='I') count=count+5;
			else if(a<='L') count=count+6;
			else if(a<='O') count=count+7;
			else if(a<='S') count=count+8;
			else if(a<='V') count=count+9;
			else if(a<='Z') count=count+10;
//			System.out.print(count+"  ");
		}
		System.out.println(count);
	}

}
