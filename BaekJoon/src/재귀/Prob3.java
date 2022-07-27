package Stage9;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Prob3 {
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		if(num==1) {}
		else {
			for(int i=2; i<=num; i++) {
				while(num%i==0) {
					System.out.println(i); num=num/i;
				}
			}
		}
	}

}
