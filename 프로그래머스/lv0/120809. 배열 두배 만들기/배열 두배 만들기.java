class Solution {
    public int[] solution(int[] numbers) {
        int i = 0;
        int[] answer = new int[numbers.length];
		for(int a : numbers){
            a *= 2;
            answer[i] = a;
            i++;
        }
        return answer;
    }
}