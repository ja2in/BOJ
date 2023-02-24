import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static int upperBound(int[] a, int key) {
		int pl = 0;
		int pr = a.length;
		do {
			int pc = (pl + pr) / 2;
			if(a[pc] <= key)
				pl = pc + 1;
			else
				pr = pc;
		}while(pl < pr);
		
		return pr;
	}
	
	public static int lowerBound(int[] a, int key) {
		int pl = 0;
		int pr = a.length;
		do {
			int pc = (pl + pr) / 2;
			if(a[pc] < key)
				pl = pc + 1;
			else
				pr = pc;
		}while(pl < pr);
		
		return pr;
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
	
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < m; i++) {
			int ky = Integer.parseInt(st.nextToken());
			sb.append(upperBound(arr, ky) - lowerBound(arr, ky)).append(" ");
			
		}
		
		System.out.print(sb);
	}

}
