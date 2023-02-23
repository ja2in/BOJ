import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class No11866 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		Deque<Integer> dq = new LinkedList<>();
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i <= N; i++) {
			dq.offer(i);
		}
		
		sb.append("<");
		while(!dq.isEmpty()) {
			for(int i = 0; i < K - 1; i++) {
				dq.offer(dq.poll());
			}
			sb.append(dq.poll());
			if(!dq.isEmpty())
				sb.append(", ");
		}
		sb.append(">");
		System.out.println(sb);
	}

}
