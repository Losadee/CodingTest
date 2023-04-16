import java.util.*;

class Solution {
    public int solution(int[] array, int n) {    
	    List<Integer> list = new ArrayList<Integer>();
	    
	    for(int num : array) {
	    	list.add(Math.abs(num - n));
	    }
	    
	    Collections.sort(list);

        return Arrays.stream(array).anyMatch(i -> i == n - list.get(0)) ? 
	    			n - list.get(0) : n + list.get(0);
    }
}