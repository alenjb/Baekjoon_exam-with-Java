package 브루트포스;

import java.util.Scanner;

public class 영화감독_숌 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i =666;;i++){
            String s = i+"";
            if(s.contains("666")){
                count++;
                if(count == n){
                    System.out.println(s);
                    break;
                }
            }
        }
    }
}
