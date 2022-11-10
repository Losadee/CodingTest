import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		int[] temp = new int[6];
		int[] arr = new int[13];
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		int cnt = 0;
		int k = sc.nextInt();
		
		if(k == 0) break;
		else {
			
			for(int i = 0; i < k; i++) {
				arr[i] = sc.nextInt();
			}
		
			combination(arr, 6, temp, 0, 0);
            System.out.println();
			cnt++;
			}
		}		

	}

	public static void combination(int[] arr, int r, int[] temp, int current, int start) {

		if(r==current) {
			for(int a : temp) {
				System.out.print(a + " ");
			}System.out.println();
			
		} else {
			for (int i = start; i < arr.length; i++) {
				if(arr[i] == 0) continue;
				temp[current] = arr[i];
				combination(arr, r, temp, current+1, i+1);
			}
		}
	}
	
}