class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        String[] strArr = cipher.split("");
        for(int i = code - 1; i < strArr.length; i += code) {
        	answer += strArr[i];
        }
        
        return answer;
    }
}