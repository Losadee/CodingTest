import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(String my_string) {
		String[] strArr = my_string.split(""); 
		List<Integer> arr = new ArrayList<Integer>();
		Arrays.sort(strArr);	
		
		for(int i = 0; i < strArr.length; i++) {
			char ch = strArr[i].charAt(0);
			if(ch > 57) break;	
			arr.add(ch-48);		
		}
		
		int[] answer = new int[arr.size()];
		for(int i = 0; i < arr.size(); i++) {
			answer[i] = arr.get(i);
		}
        
        return answer;
    }
}