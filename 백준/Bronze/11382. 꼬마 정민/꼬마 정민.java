import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long[] arr = new long[3];
		long sum = 0;
		for(int i = 0; i < 3; i++) {
			arr[i] = Long.parseLong(st.nextToken());
			
			sum += arr[i];
		}
		
		System.out.println(sum);
	}

}
