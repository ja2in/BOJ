import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(max <= arr[i]) {
				max = arr[i];
			}
			
			if(min >= arr[i]) {
				min = arr[i];
			}
		}
			System.out.println(min + " " + max);
	}

}
