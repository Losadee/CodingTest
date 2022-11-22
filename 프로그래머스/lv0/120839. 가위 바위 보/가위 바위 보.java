class Solution {
    public String solution(String rsp) {
        String[] rspArr = rsp.split("");
		String answer = "";
        
		for(int i = 0; i < rsp.length(); i++) {
			answer += rspArr[i].equals("2") ? "0" :
				      rspArr[i].equals("5") ? "2" :
					  rspArr[i].equals("0") ? "5" : "";
		}
        
        
        return answer;
    }
}