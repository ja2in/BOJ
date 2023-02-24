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
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			int count = 0;
			
			if(n == 0)
				break;
			
			for(int i = n+1; i <= 2*n; i++) {
				if(isPrime(i))
					count++;
			}
			
			System.out.println(count);
		} 
		
		
		
	}

}
