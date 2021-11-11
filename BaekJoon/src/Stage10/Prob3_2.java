package Stage10;

public class Prob3_2 {
	public static void main(String[] args) {
		//3으로 나눈 몫
		int f=3;
		String [][] arr= new String [27][27];
		for(int i=0; i<arr[0].length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j]="*";
			}
		}
		int arr_length=arr[0].length;
		for(int i=3^(f-1);i<arr_length ; i=i+3^(f-1)+1) {
//			for(int i=3^(f-1);i<arr_length ; i=i+3^(f-1)+1) {
			for(int j=3^(f-1);j<arr_length ; j=j+3^(f-1)+1) {

			arr[i][j]=" ";}	}
		for(int i=0; i<arr[0].length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

}}
