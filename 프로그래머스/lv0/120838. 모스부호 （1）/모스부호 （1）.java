import java.util.Arrays;

class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
						  ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
						  "...","-","..-","...-",".--","-..-","-.--","--.."};
        String answer = "";
		String[] result = letter.split(" ");
		for(int i = 0; i <  result.length; i++) {
			answer += (char)(Arrays.asList(morse).indexOf(result[i]) + 97);
        }
        return answer;
    }
}