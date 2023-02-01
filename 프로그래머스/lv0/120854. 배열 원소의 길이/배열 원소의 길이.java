import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String[] strlist) {
        List<Integer> strLen = new ArrayList<Integer>();
		for(String str : strlist) {
			strLen.add(str.length());
		}
		
        return strLen.stream().mapToInt(i -> i).toArray();
    }
}