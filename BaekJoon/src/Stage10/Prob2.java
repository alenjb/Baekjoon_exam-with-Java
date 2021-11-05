package Stage10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Prob2 {
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		int num= Integer.parseInt(br.readLine());
		bw.write(Fibonacci(num)+"");
		bw.close();
	}
	static int Fibonacci(int num) {
		int result=0;
		if(num==0) {
			return 0;
		}
		else if(num==1) {
			return 1;
		}
		else{
			result= Fibonacci(num-1)+Fibonacci(num-2);
			num--;
		}
		return result;
	}
}
