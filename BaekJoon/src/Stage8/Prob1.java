package Stage8;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Prob1 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		String line=bf.readLine();
		String [] str= line.split(" ");
		int a= Integer.parseInt(str[0]);
		int b= Integer.parseInt(str[1]);
		int c= Integer.parseInt(str[2]);
		if(b>=c) System.out.println(-1);
		else {
			int result= a/(c-b);
			System.out.println(result+1);
		}
	}
}
