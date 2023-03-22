class Solution {
    public int[] solution(long n) {
		String nStr = String.valueOf(n);
		int[] answer = new int[nStr.length()];
		
		for(int i = 0; i < answer.length; i++) {
			char a = nStr.charAt((answer.length -1) - i);
			answer[i] = Character.getNumericValue(a);
		}
        
        return answer;
    }
}