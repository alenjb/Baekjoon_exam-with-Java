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
			for(int j=0; j<strs[i].length(); j++) {//첫글자부터
				
				for(int k=j+1; k<strs[i].length(); k++) { //한글자 한글자 검색
					if (Character.toString(strs[i].charAt(k)).equals(Character.toString(strs[i].charAt(j)))){
		
//						System.out.println(Character.toString(strs[i].charAt(k))+"와"+Character.toString(strs[i].charAt(j)));
//						System.out.println(k);
						int a=k+1, b=1;//a:다음 글자  b:연속된거 몇갠지
						while(a<strs[i].length() &&Character.toString(strs[i].charAt(a)).contentEquals(Character.toString(strs[i].charAt(k)))
								) {
							System.out.println("동과");
							b++; a++;
						}
						int len= strs[i].length();
						int len2= strs[i].replace(Character.toString(strs[i].charAt(k)), "").length();
						System.out.println("j   k  a  "+j+ "  "+k+"  "+a);
						System.out.println(Character.toString(strs[i].charAt(a)) +" "+Character.toString(strs[i].charAt(k)));
						System.out.println(Character.toString(strs[i].charAt(a)).contentEquals(Character.toString(strs[i].charAt(k))));
						System.out.println("len, len2  b "+len+" "+len2+" "+b);
						System.out.println("");
						if (len2+b!=len) count1++; 
					}
				} //System.out.print("  "+j+"일 떼  "+count1);
				}if( count1==0) count++;
			
			}// for i
		System.out.println(count);
		}
		
	}

/*처음 나올 떄 발견 -> 그 때부터 연속된거 다 ""로 바꾸기 -> 포함되어 있으면 count1++*/