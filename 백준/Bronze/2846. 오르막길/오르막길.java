import java.util.Scanner;

public class Main {
	
	static int x1 = 0 , x2 = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();		 // N 입력
		int[] arr = new int[N];		 // 배열 입력
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int start = 0;
		int max = 0;
		
		for(int i = 1; i < arr.length; i++) { 	
			x1 = arr[start];					
			
			while(arr[i-1] < arr[i]) {			
				x2 = arr[i];					
				i++;
				if(i == arr.length) break;		
			}
			if(x2-x1 > 0 && x2-x1 > max) {		
				max = x2-x1;					
			}									 
												
			start=i;							
		}	
		System.out.println(max);
		
		
	}
	
}