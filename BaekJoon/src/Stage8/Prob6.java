package Stage8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Prob6 {
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int k= Integer.parseInt(br.readLine());
		int n= Integer.parseInt(br.readLine());
		int result=0;
		for(int i=n; i>0; i--) {
			result=result+cal(k, i, result);
			System.out.println(k +"   "+i+"  끝");
		}
//		int a=cal(k,n, result);
		System.out.println(result);
	}
	public static int cal(int height, int side, int result) {
		if(height==0)  {
			System.out.println(height+"   "+side);
			result=result+side;
			System.out.println("여기는 끝"+result+" height: "+height+" side: "+side);

			if(side!=1) cal(height, side-1, result);
			else {System.out.println("종료   "+result); return result; }
			}
		else {
				if(height-1>=0) {
					System.out.println(height+ "  "+side);
					result=result+cal(height-1, side, result);
					System.out.println(result);
					return result;
					}
				}
		return result;
	}
}
