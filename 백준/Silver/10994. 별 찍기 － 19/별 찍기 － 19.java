import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int n = sc.nextInt(); 
		int N = 4*n-3;	// 배열의 크기
		// (2*n-1)+2n
		
		String[][] arr = new String[N][N];
		
		// space로 초기화
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = " ";
			}
		}
		// 정중앙 별
		arr[N/2][N/2] = "*";
		printArr(arr, N, 0);
		
		// 배열 출력
		for(String[] i : arr) {
			for(String j : i) {
				System.out.print(j);
			}System.out.println();
		}
		
	}
	
	
	public static String[][] printArr(String[][] arr, int N, int cnt) {
		while(N > 1) {
			// 첫째줄 & 마지막 줄
			for(int i = 2*cnt; i < N+2*cnt; i++) {
				arr[2*cnt][i] = "*";
				arr[N-1+2*cnt][i]= "*";
			}
			
			// 둘째 ~ 마지막-1 줄 (index: 1~N-2)
			for(int i = 2*cnt+1; i < (N-1)+2*cnt; i++) {
				arr[i][2*cnt] = "*";
				arr[i][N-1+2*cnt] = "*";
			}
			// N = 4n-3
			N -= 4;	
			cnt++;
			
			return printArr(arr, N, cnt);
		}	
			return arr;
			
				 
	}
	
	
}
