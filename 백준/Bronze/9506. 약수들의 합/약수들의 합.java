import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == -1) {
				break;
			}
			
			int[] arr = new int[n];
			int cnt = 0;
			int sum = 0;
			
			for(int i = 1; i < n; i++) {
				if(n % i == 0) {
					arr[cnt++] = i;
					sum += i;
				}	
			}
			
			if(n != sum) {
				System.out.println(n + " is NOT perfect.");
			}
			else {
				System.out.print(n + " = ");
				
				for(int i = 0; i < cnt; i++) {
					System.out.print(arr[i]);
					if(i == cnt - 1)
						break;
					System.out.print(" + ");
				}
				System.out.println();
			}
			
		}
	}

}
