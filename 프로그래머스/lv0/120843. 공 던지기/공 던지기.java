class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 1;

		for(int i = 0; i < k-1; i++) {
			if(answer >= numbers.length) {
				answer -= numbers.length;
			}
			answer += 2;
		}
        return answer;
    }
}