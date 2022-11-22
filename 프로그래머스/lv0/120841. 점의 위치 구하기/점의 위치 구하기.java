class Solution {
    public int solution(int[] dot) {
        int answer = 0;
		boolean bool = (dot[1] > 0);
        
		if(dot[0] > 0) {
			answer = bool ? 1 : 4; 
		} else {
			answer = bool ? 2 : 3;
		} 
        return answer;
    }
}