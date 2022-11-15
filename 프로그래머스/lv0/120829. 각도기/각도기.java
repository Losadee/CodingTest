class Solution {
    public int solution(int angle) {
        int answer = 0;

        	answer += (angle < 90)   ? 1 :
        	          (angle == 180) ? 4 :
        	          (angle == 90)  ? 2 : 3;
			
        return answer;
        
    }
}