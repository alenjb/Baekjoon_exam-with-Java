package Stage5;

import java.util.Scanner;

public class Prob7 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		//테스트 케이스 개수
		int testCase= scanner.nextInt();
		int smart=0;
		//점수 저장 배열 
		int [][] score= new int [testCase][1001];
		//평균 저장 배열
		double [][] scoreAvg= new double [testCase][1];
		double avg=0;
		for(int i=0; i<testCase; i++) {
			int eachCase= scanner.nextInt();
			int j=0;
			avg=0;
			for( j=0; j<eachCase; j++){
				score[i][j]= scanner.nextInt();
				avg= avg+score[i][j];
			}
			score[i][1000]=eachCase;
			scoreAvg[i][0]=avg/eachCase;
			}
		//평균이상 구하기
		for(int i=0; i<testCase; i++) {
			smart=0;
			for(int j=0; j<score[i][1000]; j++){
				if(score[i][j]>scoreAvg[i][0]) smart++;
			}
			double result=smart*1.000/score[i][1000]*100;
			System.out.printf("%.3f%%\n",result);
			
			

			
		}

	}
}