import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr;
		int c = Integer.parseInt(br.readLine()); 		// 케이스 갯수
		
		for(int i = 0; i < c; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());		// 학생 수
			arr = new int[n];
			
			double sum = 0;
			
			for(int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(st.nextToken());		// 성적입력
				sum += arr[j];
			}
			
			double avg = (sum / n);
			double count = 0;
			
			for(int j = 0; j < n; j++) {
				if(arr[j] > avg) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n", (count / n) * 100);
		}
		
	}
}