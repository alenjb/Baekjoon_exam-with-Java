package Stage9;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Prob5 {
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		for(int k=0; ;) {
			int num=Integer.parseInt(br.readLine());
			int count=0;
			if(num==0) break;
				for(int i=num+1; i<=num* 2; i++) {
					if(!check(i)) count++;
				}
				System.out.println(count);
		}}
	//소수이면 fasle
	static boolean check(int num) {
		for(int i=2; i*i<=num; i++) {
			if(num%i==0) return true;
		}
		return false;
	}

}
