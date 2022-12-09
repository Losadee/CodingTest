
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	
	static Stack<Integer> stack = new Stack<>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int result = 0;
		int n = Integer.parseInt(br.readLine()); //Int
		for(int i = 0; i < n; i++) {
			
			String input = br.readLine(); //String
			if(input.contains("push")) {
				int X = Integer.parseInt(input.substring(5));
				stack.push(X);
				continue;
			} 
				switch (input) {
				case "pop":
					result = (stack.isEmpty()) ? -1 : stack.pop();
					break;
				case "size":
					result = stack.size();
					break;
				case "empty":
					result = (stack.isEmpty()) ? 1 : 0;
					break;
				case "top":
					result = (stack.isEmpty()) ? -1 : stack.peek();
					break;
				}
				bw.write(String.valueOf(result) + "\n");
			
			
		}
		
		bw.flush();
		bw.close();
		br.close();
    }

}
