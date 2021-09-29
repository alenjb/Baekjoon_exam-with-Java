package Stage7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;



public class Prob5 {
	public static void main(String[] args) throws Exception {
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));

		String str= bf.readLine();
		int size=str.length();
		char [] strs= str.toCharArray();
		int [] results= new int [26];
		for(int i=0; i<size;i++) {
			if(strs[i]>='A'&& strs[i]<='Z') {
				strs[i]= (char)(strs[i]+32);
			}
			results[(int)strs[i]-97]++;
		}
		int max=0;
		ArrayList<Character> maxes= new ArrayList<Character>();
		for(int i=0; i<26; i++) {
			if(results[i]>max) {
				max=results[i];
				maxes.clear();
				maxes.add((char)(i+65));
			}
			else if(results[i]==max) {
				maxes.add((char)(i+65));
			}
			
		}
		if(maxes.size()>1) {
			System.out.println("?");
		}else {
			System.out.println(maxes.get(0));
		}
	}}

