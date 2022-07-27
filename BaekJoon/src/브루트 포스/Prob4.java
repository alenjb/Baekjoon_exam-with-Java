package Stage10;

import java.util.Scanner;

public class Prob4 {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int ch=in.nextInt();
		Hanoi(1, 2, 3, ch);
	}
	static void Hanoi(int a, int b, int c, int num) {
		
		}
	static void Move(int start, int end) {
		System.out.println(start+"에서 "+end+"로 이동 ");
	}
}
