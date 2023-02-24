import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[100][100];
		int area = 0;
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());	
			
			for(int j = x; j < x + 10; j++) {
				for(int k = y; k < y + 10; k++) {
					arr[j][k]++;
					
					if(arr[j][k] == 1) {
						area++;
					}
				}
			}	
		}
		System.out.println(area);
	}

}
