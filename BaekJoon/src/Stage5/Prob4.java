package Stage5;
import java.util.Scanner;

public class Prob4 {

public static void main(String[] args){
	Scanner scanner= new Scanner(System.in);
	int [] arr= new int [10];
	for(int i=0; i<10; i++) {
		arr[i]=scanner.nextInt();
		arr[i]=arr[i]%42;}
	int num=0;
	int num1=0;
	for(int i=0; i<10; i++) {
		num1=0;
		int 비교=arr[i];
		for (int j=1; j+i<10; j++) {
			
			if (비교==arr[i+j] &&arr[i+j]!=1000) {
//	    				System.out.println(arr[i]+"i"+i+"j"+j);
				arr[i]=1000;
				arr[i+j]=1000;
//	    				System.out.print("j다 "+arr[i+j]+"\n");
    				
    				num1++;
    			}
 
    			
//	    			if (arr[i]!=1000 && arr[j]!=1000) {num1++;
//	    			System.out.println("i: "+i+ "   j:  "+j);}
    			
    		}
    		if( num1>0) num++;
    		
    	}
    	for(int i=0; i<10; i++) {
 //   		System.out.print(arr[i]+" ");
    		if (arr[i]!=1000) num++;
    	}
    	System.out.println(num);
       }
   }
	   
