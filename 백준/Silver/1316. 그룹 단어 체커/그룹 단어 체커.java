import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			if(check()) {
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	public static boolean check() throws IOException{
		boolean[] check = new boolean[26];
		int prev = 0;
		String str = br.readLine();
		
		for(int i = 0; i < str.length(); i++) {
			int index = str.charAt(i);
			
			if(prev != index) {
				if(check[index - 'a'] == false) {
					check[index - 'a'] = true;
					prev = index;
				}
				else
					return false;
			}
		}
		return true;
	}
	
}