package Stage5;
import java.util.Scanner;
public class Prob6 {

	    public static void main(String[] args){
	    	Scanner scanner= new Scanner(System.in);
	    	int input_num= scanner.nextInt();
	    	scanner.nextLine();
	    	int score=0;
	    	char arr[][]= new char [input_num][80];
	    	for(int i=0; i<input_num; i++) {
	        	String a=scanner.nextLine();
	    		for (int j=0; j<a.length(); j++) {
	    			arr[i][j]=a.charAt(j);
	    		} // j for문 end        	
	    	}// i for문 end
	    	

	    	
	    	
	    	int [][] score_arr= new int [input_num][1];
	    	int num=0;
	    	for (int i=0; i<input_num; i++) {
	    		for(int j=0; j<arr[i].length; j++) {
	    			int cnt=0;
	        		while(arr[i][j]=='O'||arr[i][j]=='X') {
	        			if (arr[i][j]=='O') {
	        				int k=j;
	        				while(arr[i][k]=='O') {
	        					arr[i][k]='A';
	        					cnt++; k++;
	        				}
	        				score= score+(cnt*(cnt+1)/2);
	        				break;
	        			}
	        			else{break;}
	        			
	        		}//ws
	    		}//js
	    		score_arr[i][0]=score;
	    		score=0;
	    		}
	    	

	    	
	    	
	    	//is
	    	for (int i=0; i<input_num; i++) {
	    		System.out.println(score_arr[i][0]);
	    	}
	    	
	    	}//ms
	}
//	    	for(int i=0; i<num; i++) {
//	    		for(int j=0; arr[i][j]!=0; j++) {
//	    	    	System.out.println(arr[i][j]);
	//
//	    		}
//	    	}

	   


