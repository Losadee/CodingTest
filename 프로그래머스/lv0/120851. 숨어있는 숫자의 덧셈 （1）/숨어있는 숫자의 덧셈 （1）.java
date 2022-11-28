class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] strArr = my_string.split(""); 
		
		for(int i = 0; i < strArr.length; i++) {
			char ch = strArr[i].charAt(0);
			if(ch > 57) continue;	
			answer += (ch-48);		
		}
        return answer;
    }
    
}