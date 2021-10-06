package Stage7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Prob10 {
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int ch= Integer.parseInt(bf.readLine());
		String [] strs= new String [ch];
		//결과 값
		int count=0;
		//임시 값: count1이 0 이상이면 그룹단어가 아님
		int count1=0;
		
		for(int i=0; i<ch;i++) {//한줄씩 읽기
			strs[i]= bf.readLine();
			count1=0;
			for(int j=0, k=j+1; j<strs[i].length()-1; j++) {//첫글자부터
				k=j+1;
				if(Character.toString(strs[i].charAt(k)).equals(Character.toString(strs[i].charAt(j)))){
//					System.out.println("k    j   "+strs[i].charAt(k)+" "+(strs[i].charAt(j)));
//					System.out.println(k);
					while(k<strs[i].length()&& Character.toString(strs[i].charAt(k)).equals(Character.toString(strs[i].charAt(j)))) {
//						System.out.println("아"+k);
						
						k++; 
					}
					int b=k-j;
					int len=strs[i].length();
					int len2= strs[i].replace(Character.toString(strs[i].charAt(j)), "").length();
//					System.out.println(i+"번쨰의"+ j+ "번쨰"+len2+"  "+ "b  "+  b);
					if (len- len2!=b) {
						count1++; //System.out.println("으악");
					}j=j+b;
					}
				else {
					int len=strs[i].length();
					int len2= strs[i].replace(Character.toString(strs[i].charAt(j)), "").length();
					if (j-1>=0&& !Character.toString(strs[i].charAt(j-1)).equals(Character.toString(strs[i].charAt(j))) &&len- len2!=1) {count1++; /*System.out.println(i+" 으악 2"+ "  "+j);*/
					
					}
				}} //System.out.print("  "+j+"일 떼  "+count1);
			int j=strs[i].length()-1;
			int len=strs[i].length();
			int len2= strs[i].replace(Character.toString(strs[i].charAt(j)), "").length();
			if (j-1>=0&& !Character.toString(strs[i].charAt(j-1)).equals(Character.toString(strs[i].charAt(j))) &&len- len2!=1) {count1++; ;
			
			}
			if (count1==0) count++;
			}// for i
		System.out.println(count);
	}
	
}

/*처음 나올 떄 발견 -> 그 때부터 연속된거 다 ""로 바꾸기 -> 포함되어 있으면 count1++*/