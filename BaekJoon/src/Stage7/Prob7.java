package Stage7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Prob7 {
	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
		String [] strs= reader.readLine().split(" ");
		int []arr= new int [2];
		for(int i=0; i<2; i++) {
			arr[i]=Integer.parseInt(strs[i]);
			arr[i]= arr[i] % 10*100 + arr[i]%100 - arr[i]%10 + arr[i]/100 ;
		}
		if(arr[0]>arr[1]) System.out.println(arr[0]);
		else System.out.println(arr[1]);
	}

}
