package Stage6;

public class Prob1 {
	public static int [] a= new int[3000000];
	public static void main(String[] args) {
		
	}
	
	public long sum(int[] a) {
		long ans = 0;
		for (int i=0; i<a.length; i++) {
			ans=ans+a[i];
		}
        return ans;
    }

}
