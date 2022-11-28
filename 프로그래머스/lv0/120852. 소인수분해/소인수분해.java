import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
		List<Integer> arr = new ArrayList<>();
		
		for(int i = 2; i <= n; i++) {
			if(isPrime(i) && (n % i == 0)) {
				while(n % i != 0) {
					n/=2;
				}
			arr.add(i);
			}
		}
		
		return arr.stream().mapToInt(i -> i).toArray();
	}
	 public static boolean isPrime(int n) {
		 int cnt = 0;
		 for(int i = 2; i <= n; i++) {
			if(n%i==0) 		cnt++;
			if(cnt > 1)		break;
		}
		 
		if(cnt == 1)	return true;
		else  			return false;
	 }


}