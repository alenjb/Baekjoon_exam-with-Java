package Stage7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Prob9 {
	public static void main(String[] args) throws Exception{
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		String str= bf.readLine();
		String []arraylist= {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		int count=0;
		for(int i=0; i< arraylist.length; i++) {
			if(str.contains(arraylist[i])) {
				
				if(arraylist[i]=="dz=") {
					int num= (str.length()- str.replace(arraylist[i], "").length())/3;
					count=count-2*num;
					str=str.replace("dz=","bbb");
				}
				else {
					int num= (str.length()- str.replace(arraylist[i], "").length())/2;
					count=count-1*num;
				}
				
			}
		}
		count=count+str.length();
		System.out.println(count);

		}
}
