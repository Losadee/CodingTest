import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        List<String> s2List = new ArrayList<String>(Arrays.asList(s2));
		
		for(String str : s1) {
			if(s2List.contains(str)) answer++;
		}
        
        return answer;
    }
}