package Stage6;

import java.util.ArrayList;

public class Prob2 {
	public static void main(String[] args) {
		ArrayList<Integer> arr= new ArrayList<Integer>();
		for(int i=1; i<=10000; i++) {
			int a=i/10000;
			int b=i/1000-10*a;
			int c=i/100-100*a-10*b;
			int d=i/10-1000*a-100*b-10*c;
			int e=i%10;
			arr.add(a+b+c+d+e+i);
			
			
		}
		for(int i=1; i<=10000; i++) {
			if(!arr.contains(i)) {
				System.out.println(i);
			}

		}

	}

}
