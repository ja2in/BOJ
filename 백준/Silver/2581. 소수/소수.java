import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static boolean isPrime(int num) {
		if(num == 1) {
			return false;
		}
		
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		int min = 10001;
		
		for(int i = m; i <= n; i++) {
			if(isPrime(i)) {
				sum += i;
				if(min > i) {
					min = i;
				}
			}
		}
		
		if(sum == 0) {
			System.out.println(-1);
		}
		
		else {
			System.out.println(sum);
			System.out.println(min);
		}

	}

}
