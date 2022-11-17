import java.util.Scanner;

public class Main {
	
	static int[] cnt;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		cnt = new int[N+1];	
		
		cnt[1] = 0;	
		for(int i = 2; i < N+1; i++) {
			cnt[i] = cnt[i-1] + 1;
			if (i % 2 == 0 && cnt[i] > cnt[i/2] + 1) {	
				cnt[i] = cnt[i/2] + 1;
			}									   	   
			if (i % 3 == 0 && cnt[i] > cnt[i/3] + 1) { 
				cnt[i] = cnt[i/3] + 1;				   
			}
		}
        System.out.println(cnt[N]);
	}
	
	
			
}
