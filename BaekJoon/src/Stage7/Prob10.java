package Stage7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Prob10 {
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int ch= Integer.parseInt(bf.readLine());
		String [] strs= new String [ch];
		int count=0;
		int count1=0;
		for(int i=0; i<ch;i++) {
			strs[i]= bf.readLine();
			for(int j=0; j<strs[i].length(); j++) {
				int length= strs[i].length();
				count1=0;
				if((strs[i].replace(Character.toString(strs[i].charAt(j)),"").length()!= length-1) &&
						!strs[i].contains(Character.toString(strs[i].charAt(j))+Character.toString(strs[i].charAt(j)))) {
					count1++;
				}
				
			}if( count1==0) count++;
		}
		System.out.println(count);
		System.out.println(!strs[0].contains(Character.toString(strs[0].charAt(0))+Character.toString(strs[0].charAt(0))));
		
	}
}
