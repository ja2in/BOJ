import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> dq = new LinkedList<>();
		
		int N = Integer.parseInt(br.readLine());
		int num = 0;
		String str = " ";
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			str = st.nextToken();
			
			switch(str) {
			case "push_front":
				num = Integer.parseInt(st.nextToken());
				dq.offerFirst(num);
				break;
				
			case "push_back":
				num = Integer.parseInt(st.nextToken());
				dq.offerLast(num);
				break;
				
			case "pop_front":
				if(dq.isEmpty()) {
					System.out.println(-1);
					continue;
				}
				else
					System.out.println(dq.removeFirst());
				break;
				
			case "pop_back":
				if(dq.isEmpty()) {
					System.out.println(-1);
					continue;
				}
				else
					System.out.println(dq.removeLast());
				break;
				
			case "size":
				System.out.println(dq.size());
				break;
				
			case "empty":
				if(dq.isEmpty()) {
					System.out.println(1);
					continue;
				}
				else
					System.out.println(0);
				break;
				
			case "front":
				if(dq.isEmpty()) {
					System.out.println(-1);
					continue;
				}
				else 
					System.out.println(dq.getFirst());
				break;
				
			case "back":
				if(dq.isEmpty()) {
					System.out.println(-1);
					continue;
				}
				else 
					System.out.println(dq.getLast());
				break;		
			}
		}
	}

}
