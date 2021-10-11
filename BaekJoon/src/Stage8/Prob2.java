package Stage8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Prob2 {
	public static void main(String[] args) throws Exception{
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(bf.readLine());
		for(int i=1, b=0; ;i=i+ b*6) {
			b++;
			if(n<=i) {
				System.out.println(b);
				break;
			}
		}

	}
}
