package Stage3;

import java.util.Scanner;
public class Prob6{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int num= scanner.nextInt();
        for (int i=0; i!=num; num--){
            System.out.println(num);
        }
    }
}