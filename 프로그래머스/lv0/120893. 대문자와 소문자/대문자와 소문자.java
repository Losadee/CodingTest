class Solution {
    public String solution(String my_string) {   
        StringBuilder answer = new StringBuilder();
		
		for(int i = 0; i < my_string.length(); i++) {
			char my_char = my_string.charAt(i);
			answer.append(my_char >= 'a' ? (char)(my_char-32) : (char)(my_char+32));
		}
        
        return answer.toString();
    }
}