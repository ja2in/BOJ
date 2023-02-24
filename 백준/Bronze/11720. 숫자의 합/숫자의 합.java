import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		String str = br.readLine();
		
		for(int i = 0; i < n; i++) {		
			sum += str.charAt(i) - 48;
		}
		
		System.out.println(sum);
	}

}
