class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        
        answer[0] = denum1*num2 + denum2*num1;
		answer[1] = num1*num2;

		int a = gcd(answer[0], answer[1]);
		
		answer[0] /= a;
		answer[1] /= a;
        
        return answer;
		
	}
	public static int gcd(int num1, int num2) {
		int max = 0; //최대 공약수
		for(int i=1; i<=num1 && i<=num2; i++) {
			if(num1%i==0 && num2%i==0){
				max = i;
			}
		}	return max;
	}
        
    
}