package Stage5;

import java.util.Scanner;

public class Prob7 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		//�׽�Ʈ ���̽� ����
		int testCase= scanner.nextInt();
		int smart=0;
		//���� ���� �迭 
		int [][] score= new int [testCase][1001];
		//��� ���� �迭
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
		//����̻� ���ϱ�
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