import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static boolean isPrime(int num) {
		if(num == 1)
			return false;
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0)
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			int div = 0;
			int rem = 0;
			
			div = n / 2;
			rem = n / 2;
			
			while(true) {
				if(isPrime(div) && isPrime(rem)) 
					break;
				else {
					rem--;
					div++;
				}		
			}
			System.out.println(rem + " " + div);
		}
	}

}
