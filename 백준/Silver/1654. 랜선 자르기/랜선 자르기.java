import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int[] arr = new int[K];
		
		for(int i = 0; i < K; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		long pl = 1;
		long pr = arr[K - 1];
		long pc = 0;
		while(pl <= pr) {
			pc = (pl + pr) / 2;
			long count = 0;
			for(int i = 0; i < K; i++) {
				count += (arr[i] / pc);
			}
			
			if(count >= N) {
				pl = pc + 1;
			}
			else {
				pr = pc - 1;
			}
		}
		
		System.out.println(pr);
	}

}
