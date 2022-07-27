package Stage10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Prob1 {
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		int num= Integer.parseInt(br.readLine());
		bw.write(factorial(num)+"");
		bw.close();
	}
	static int factorial(int num) {
		if(num<=1) {
			return 1;
		}
		else {
			num= num* factorial(num-1);
			
		}
		return num;
	}
}
