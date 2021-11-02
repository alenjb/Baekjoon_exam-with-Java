package Stage9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Prob8 {
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		int [] arr= new int [6];
		for(int i=0; i<3; i++) {
			StringTokenizer st= new StringTokenizer(br.readLine());
			arr[2*i]=Integer.parseInt(st.nextToken());
			arr[2*i+1]=Integer.parseInt(st.nextToken());
		}
		int x=0, y=0;
		if(arr[0]==arr[2]) {
			x=arr[4];
		}
		else if(arr[0]==arr[4]) {
			x=arr[2];
		}
		else {x= arr[0];}

		if(arr[1]==arr[3]) {
			y=arr[5];
		}
		else if(arr[1]==arr[5]) {
			y=arr[3];
		}
		else {y= arr[1];}
		
		bw.write(x+" "+y);
		bw.close();
		
	}
}
