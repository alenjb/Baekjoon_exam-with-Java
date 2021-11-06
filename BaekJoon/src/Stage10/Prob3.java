package Stage10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Prob3 {
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		int num= Integer.parseInt(br.readLine());
		String [][]arr= new String [num][num];
		//별 다 찍어놓기
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				arr[i][j]="*";
			}
		}
		//몇 제곱
		int t=0;
		for(; num!=1; ) {
			num=num/3; t++;
		}

		StarHole(t, arr);
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				System.out.println(arr[i][j]);
			}}
		
		
		
	}
	static String[][] StarHole(int num, String arr[][]) {
		if(num==0) return arr;
		for(int i=3*num; i<3*(num+1); i++) {
			for(int j=3*num; j<3*(num+1); j++) {
				arr[i][j]=" ";
			}
			arr=StarHole(num-1, arr);
		}
		return arr;
		
	}
}
