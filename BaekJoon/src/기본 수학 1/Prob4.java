package Stage7;

	import java.io.BufferedReader;
	import java.io.InputStreamReader;


	public class Prob4 {
		public static void main (String[] args)throws Exception {
			
			BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
			int ch= Integer.parseInt(bf.readLine());
			for(int i=0; i<ch; i++) {
				String []ss= bf.readLine().split(" ");
				int num= Integer.parseInt(ss[0]);
				String []str=ss[1].split("");

				for(int k=0; k<str.length; k++) {
					for(int j=0; j<num; j++) {
						System.out.print(str[k]);
					}

				}
				System.out.println();

						
				
			}
			

		}
	}


