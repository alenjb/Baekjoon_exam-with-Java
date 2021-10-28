package Stage9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;


public class Prob4 {
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		int start_num= Integer.parseInt(st.nextToken());
		int end_num= Integer.parseInt(st.nextToken());
		HashSet<Integer> set= new HashSet<Integer>();
		//set에 모든 숫자 입력
		for(int p=start_num; p<=end_num; p++) {
			set.add(p);
		}
		//1부터 시작하면 1은 재외
		if(start_num<=1) set.remove(Integer.valueOf(1));
		//2부터 최대 숫자까지
		for(int k=2; k*k<=end_num ; k++) {
			int j=0;
			//배수 제거
			while(j+k<=end_num) {
				j=j+k;
				//배수가 소수가 아니면 제거
				if(check(j)) set.remove(Integer.valueOf(j)); 
			}
		}
		List<Integer> list = new ArrayList<>(set);
		Collections.sort(list);
		Iterator<Integer> iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		}
	//소수이면 false
	static boolean check(int num) {
		for(int i=2; i*i<=num; i++) {
			if(num%i==0) return true;
		}
		return false;
	}
}
