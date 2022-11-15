
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int x1 = 0 , x2 = 0;
	static ArrayList<Integer> road = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		road(arr, 0);
		System.out.println(max(road));
		
	}
	
	// 배열에 오르막 높이 저장
	public static void road(int[] arr, int start) {	
		
		for(int i = 1; i < arr.length; i++) {
			// 출발점 x1에 저장
			x1 = arr[start];
			
			while(arr[i-1] < arr[i]) {	// 오르막이면(다음 index의 값이 크면)
				x2 = arr[i];			// x2에 값 저장하고
				i++;
				if(i == arr.length) break;
			}
			if(x2-x1 > 0) {		// 오르막일 때만 배열에 넣음
				road.add(x2-x1);
			}
			start=i;			// 오르막이 아니라면 아닌 지점을 다시 출발점으로 저장
		}
	}
	// 최대값 구하기
	public static int max(ArrayList<Integer> arr) {
		if(road.size()==0) {	// 내리막만 있을 경우 0 리턴
			return 0;
		}
		int max = arr.get(0);	// 아니면 최댓값 구해서 max 리턴
		for(int i = 0; i < arr.size(); i++) {
			max = max < arr.get(i) ? arr.get(i) : max;
		}
		return max;
	}
	
}