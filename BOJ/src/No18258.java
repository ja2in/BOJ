import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class No18258 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		Deque<Integer> q = new LinkedList<>();
		StringTokenizer st;
		Queue<Integer> qq = new LinkedList<>();
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			switch(st.nextToken()) {
			case "push":
				q.offer(Integer.parseInt(st.nextToken()));
				break;
				
			case "pop":
				if(q.isEmpty()) {
					sb.append(-1).append("\n");
				}
				else {
					sb.append(q.poll()).append("\n");
				}
				break;
				
			case "size":
				sb.append(q.size()).append("\n");
				break;
				
			case "empty":
				if(q.isEmpty()) {
				sb.append(1).append("\n");
				}
				else {
					sb.append(0).append("\n");
				}
				break;
				
			case "front":
				if(q.isEmpty()) {
					sb.append(-1).append("\n");
				}
				else {
					sb.append(q.peek()).append("\n");
				}
				break;
				
			case "back":
				if(q.isEmpty()) {
					sb.append(-1).append("\n");
				}
				else {
					sb.append(q.peekLast()).append("\n");
				}
				break;
				}
		}
		
		System.out.println(sb);
	}

}
