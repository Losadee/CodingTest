import java.util.*;

class Solution {
    public String solution(String my_string) {
        String[] strArr = my_string.split("");
		StringBuilder sb = new StringBuilder();
		Set<String> strSet = new LinkedHashSet<String>();
        
		for(String str : strArr) {
			strSet.add(str);
		}
		
		for(String str : strSet) {
			sb.append(str);
		}
        
        return sb.toString();
    }
}