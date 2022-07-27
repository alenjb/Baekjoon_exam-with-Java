package Stage5;
import java.util.Arrays;
import java.util.Scanner;
public class Prob5 {

	   public static void main(String[] args){
	    	Scanner scanner= new Scanner(System.in);
	    	int num=scanner.nextInt();
	    	double [] arr= new double [num];
	    	for(int i=0; i<num; i++) {
	    		arr[i]=scanner.nextDouble();
	    }
	    	double sum=0;
	    	Arrays.sort(arr);
	    	for (int i=0; i<num; i++) {
	    		arr[i]=arr[i]/arr[num-1]*100.0000;
	        	sum+=arr[i];
	    	} 
	    	System.out.println(sum/num);
	   }}
