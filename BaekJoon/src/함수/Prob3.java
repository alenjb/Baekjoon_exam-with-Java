package Stage5;

import java.util.Scanner;
public class Prob3 {

	public static void main(String[] args){
		Scanner scanner= new Scanner(System.in);
		int [] arr= new int [9];
		for(int i=0; i<3; i++) {
			arr[i]=scanner.nextInt();    	}
		int mul=arr[0]*arr[1]*arr[2];
		String mull = Integer.toString(mul);
		int one=0;int two=0;int three=0;int four=0;int five=0;int six=0;int seven=0;int eight=0;int nine=0;int zero=0;
		for (int i=0; i<mull.length(); i++) {
			if (mull.charAt(i)=='1') one++;
			else if (mull.charAt(i)=='2') two++;
			else if (mull.charAt(i)=='3') three++;
			else if (mull.charAt(i)=='4') four++;
			else if (mull.charAt(i)=='5') five++;
			else if (mull.charAt(i)=='6') six++;
			else if (mull.charAt(i)=='7') seven++;
			else if (mull.charAt(i)=='8') eight++;
			else if (mull.charAt(i)=='9') nine++;
			else if (mull.charAt(i)=='0') zero++;
	
		}
		System.out.println(zero);
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);
		System.out.println(five);
		System.out.println(six);
		System.out.println(seven);
		System.out.println(eight);
		System.out.println(nine);
	}
	   }
	   
