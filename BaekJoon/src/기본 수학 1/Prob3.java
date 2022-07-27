package Stage7;

import java.util.Scanner;

public class Prob3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String s= scanner.nextLine();
		char [] arr= {'a', 'b', 'c', 'd','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int [] ar= new int [26];
		for(int a=0; a<26; a++) {
			ar[a]=-1;
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<s.length(); j++) {
			if(arr[i]==s.charAt(j)){
					ar[i]=j;
					break;
				}
			}	
			}
		for(int k=0; k<26; k++) {
				System.out.print(ar[k]+" ");
		}
	}
}
