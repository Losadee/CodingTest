class Solution {
    public int[] solution(int[] numbers, String direction) {
		int n = numbers.length;
		int[] arr = new int[n*2];
		int[] answer = new int[n];
		
		for(int i = 0; i < n; i++) {
				arr[i] = numbers[i];
				arr[i+n] = numbers[i];
		}
        
		int dir = (direction.equals("right")) ? n-1 : 1;
		
		for(int i = 0; i < n; i++) {
			answer[i] = arr[i+dir];
		}
        return answer;
    }
}