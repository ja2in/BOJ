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
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		long pl = 0;
		long pr = arr[arr.length - 1];
		long pc = 0;
		while(pl <= pr) {
			pc = (pl + pr) / 2;
			long sum = 0;
			
			for(int i = 0; i < N; i++) {
				if(arr[i] > pc) {
					sum += (arr[i] - pc);
				}
			}
			
			if(sum >= M) {
				pl = pc + 1;
			}
			else {
				pr = pc - 1;
			}
		}
		System.out.println(pr);
	}

}
