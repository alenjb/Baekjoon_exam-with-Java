package Stage7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Prob10 {
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int ch= Integer.parseInt(bf.readLine());
		String [] strs= new String [ch];
		
		int count=0; //결과 값
		int count1=0;//임시 값: count1이 0 이상이면 그룹단어가 아님
		
		for(int i=0; i<ch;i++) {//한줄씩 읽기
			strs[i]= bf.readLine();
			count1=0;//임시값을 0으로 설정
			for(int j=0, k=j+1; j<strs[i].length()-1; j++) {//첫글자부터
				k=j+1;
				if(Character.toString(strs[i].charAt(k)).equals(Character.toString(strs[i].charAt(j)))){//옆글자와 같으면
					while(k<strs[i].length()&& Character.toString(strs[i].charAt(k)).equals(Character.toString(strs[i].charAt(j)))) { //연속된 글자가 같을 때까지 k 증가
						k++; 
					}
					int successive=k-j; //연속된 수
					int len=strs[i].length(); //길이
					int len2= strs[i].replace(Character.toString(strs[i].charAt(j)), "").length(); //연속된 글자를 없앴을 때의 길이
					if (len- len2!=successive) {count1++; break;} //연속된거 외에 같은 값이 있으면 임시값 증가
					j=k;//k-1까지는 연속된 값이므로 k부터 검사
					}
				else {//옆글자와 같지 않으면
					int len=strs[i].length(); //길이
					int len2= strs[i].replace(Character.toString(strs[i].charAt(j)), "").length(); //현재글자와 같은 글자를 없앴을 때의 길이
					if (len- len2!=1){// 어딘가에 같은 값이 있을 때
					if (j>=1&& j<len-1&& !Character.toString(strs[i].charAt(j-1)).equals(Character.toString(strs[i].charAt(j))) &&len- len2!=1){// 그 값이 전의 글자와 다르면
						count1++;}
					}
				}} 
			
//			int j=strs[i].length()-1;
//			int len=strs[i].length();
//			int len2= strs[i].replace(Character.toString(strs[i].charAt(j)), "").length();
//			if (j-1>=0&& !Character.toString(strs[i].charAt(j-1)).equals(Character.toString(strs[i].charAt(j))) &&len- len2!=1) count1++;
			if (count1==0) count++;
			}// for i
		System.out.print(count);
	}
	
}

/*처음 나올 떄 발견 -> 그 때부터 연속된거 다 ""로 바꾸기 -> 포함되어 있으면 count1++*/