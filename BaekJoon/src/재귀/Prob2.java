package Stage9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Prob2 {
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		int first=Integer.parseInt(br.readLine());
		int second=Integer.parseInt(br.readLine());
		ArrayList<Integer> arr= new ArrayList<Integer>();
		int sum=0; boolean check;
		for(int i=first; i<=second; i++) {
			check=true;
			if(i==1) continue;
			for(int j=1; j<i;j++) {
				if(j!=1 && i%j==0) {
					check=false; break;}
			}
			if(check) {
				arr.add(i);
				sum=sum+i;
			}
			
		}
		if(arr.isEmpty()) bw.write(-1+"");
		else bw.write(sum+"\n"+Collections.min(arr)+"");
		bw.flush();
	}
}

