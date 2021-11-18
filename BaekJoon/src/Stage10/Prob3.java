package Stage10;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Prob3 {
	static char arr[][];
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		int num= Integer.parseInt(br.readLine());
		arr= new char [num][num];
		StarHole(num, 0, 0, false);

		for(int i=0; i<arr[0].length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				bw.write(arr[i][j]);
			}bw.write("\n");
		}
		bw.close();
	}
	static void  StarHole(int num, int x, int y, boolean blank) {
	
		if(blank) {
			for(int i=x; i<x+num; i++) {
				for(int j=y; j<y+num; j++) {
					arr[i][j]=' ';
				}}
		}
		else if(num==1) {
			arr[x][y]='*';
		}
		else {
			int num2= num/3;
			int count=0;
			for(int i=x; i<x+num; i+=num2) {
				for(int j=y; j<y+num; j+=num2) {
					count++;
					if(count==5) {
						StarHole(num2, i, j, true);
					}
					else {
						StarHole(num2, i, j, false);						
					}
				}
				
			}
		}

	}
}
