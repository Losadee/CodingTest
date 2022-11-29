import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> card = new LinkedList<>();
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			card.offer(i);
		}
		
		while(card.size() > 1) {
			card.poll();
			card.offer(card.poll());	
		}
		
		System.out.println(card.peek());
		
	}

}
