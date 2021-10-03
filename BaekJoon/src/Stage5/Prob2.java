package Stage5;
import java.util.Scanner;

public class Prob2 {

    public static void main(String[] args){
    	Scanner scanner= new Scanner(System.in);
    	int [] arr= new int [9];
    	for(int i=0; i<9; i++) {
    		arr[i]=scanner.nextInt();    	}
    	int max=arr[0];
    	int index=0;
    	for(int i=0; i<9; i++) {
    		if (arr[i]>=max) {
    			max=arr[i];
    			index=i+1;
    		}
    	}
    	System.out.println(max);
    	System.out.println(index);
    	
    }}
	   
