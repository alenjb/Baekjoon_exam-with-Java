package 재귀;

import java.util.*;
public class 팩토리얼2{

    public static long factorial(long n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long n=scanner.nextLong();
        System.out.println(factorial(n));


    }

}
