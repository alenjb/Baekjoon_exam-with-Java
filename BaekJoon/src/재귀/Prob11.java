package Stage9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Prob11 {
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		int ch= Integer.parseInt(br.readLine());
		for(int i=0; i<ch; i++) {
			StringTokenizer st= new StringTokenizer(br.readLine());
			int x1=Integer.parseInt(st.nextToken());
			int y1=Integer.parseInt(st.nextToken());
			int r1=Integer.parseInt(st.nextToken());
			int x2=Integer.parseInt(st.nextToken());
			int y2=Integer.parseInt(st.nextToken());
			int r2=Integer.parseInt(st.nextToken());
			
			if(x1==x2&& y1==y2&& r1==r2){//1. 일치하는 경우
					bw.write(-1+"\n");}
			else if(Math.max(r1, r2)>=Math.sqrt(Math.pow((x1-x2), 2) +Math.pow((y1-y2), 2))+ Math.min(r1, r2)) {
				if(Math.max(r1, r2)>Math.sqrt(Math.pow((x1-x2), 2) +Math.pow((y1-y2), 2))+ Math.min(r1, r2)) {
					//5. 원이 내부에 있고 만나지 않을 떼
					bw.write(0+"\n");}
				else {
					//3. 내접할 때
					bw.write(1+"\n");
				}}
			else if(r1+r2 <= Math.sqrt(Math.pow((x1-x2), 2) +Math.pow((y1-y2),2))){
					if(r1+r2 < Math.sqrt(Math.pow((x1-x2), 2) +Math.pow((y1-y2), 2))) {
						//떨어져 있을 떄
						bw.write(0+"\n");
					}
					else {//외접할 떄
						bw.write(1+"\n");
					}
				}
			else {bw.write(2+"\n");}
	}
		bw.close();
}}
