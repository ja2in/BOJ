import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		a = ((a % 10) * 100) + (((a % 100) / 10) * 10) + (a / 100);
		b = ((b % 10) * 100) + (((b % 100) / 10) * 10) + (b / 100);
		
		System.out.println(a > b ? a : b);
	}

}
