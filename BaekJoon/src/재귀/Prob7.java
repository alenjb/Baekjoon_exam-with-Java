package Stage9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public interface Prob7 {
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st= new StringTokenizer(br.readLine());
		int x= Integer.parseInt(st.nextToken());
		int y= Integer.parseInt(st.nextToken());
		int w= Integer.parseInt(st.nextToken());
		int h= Integer.parseInt(st.nextToken());
		
		bw.write(Math.min(Math.min(x, w-x),Math.min(h-y, y))+"");
		bw.close();
	}
}
