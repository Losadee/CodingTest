import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public Object[] solution(int[] numbers, String direction) {
		int n = numbers.length;
		ArrayList<Integer> num_list = new ArrayList<>();
		List<Integer> arr_list = new ArrayList<>();

		num_list.addAll(Arrays.stream(numbers).boxed().collect(Collectors.toList()));
		num_list.addAll(Arrays.stream(numbers).boxed().collect(Collectors.toList()));
		
		int dir = (direction.equals("right")) ? n-1 : 1;
		
		for(int i = 0; i < n; i++) {
			arr_list.add(num_list.get(i+dir));
		}
		
		return arr_list.toArray();
    }
}