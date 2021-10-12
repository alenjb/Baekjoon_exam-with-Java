package Stage8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Prob3 {
	public static void main(String[] args) throws Exception{
		BufferedReader bf= new BufferedReader(new  InputStreamReader(System.in));
		int num= Integer.parseInt(bf.readLine());
		for(int k=1;;) {
			if((k+1)*k/2<num)k++;
			else {
				int p=num-k*(k-1)/2;
				if(k%2==0) {
					System.out.println(p+"/"+(k-p+1));					
				}else {
					System.out.println((k-p+1)+"/"+p);					
				}
				break;
			}
			
		}
		
}}