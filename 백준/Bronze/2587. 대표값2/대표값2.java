import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[5];
		int avg = 0;
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			
			sum += arr[i];
		}
		avg = sum / 5;
		Arrays.sort(arr);
		
		System.out.println(avg);
		System.out.println(arr[2]);
	}

}
