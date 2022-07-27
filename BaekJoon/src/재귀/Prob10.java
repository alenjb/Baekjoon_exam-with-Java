package Stage9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Prob10 {
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		double r= Integer.parseInt(br.readLine());
		String s= String.format("%6f", r*r*Math.PI);
		String ss= String.format("%6f", r*r*2);
		bw.write(s+"\n");
		bw.write(ss+"");
		bw.close();
		
	}

}
