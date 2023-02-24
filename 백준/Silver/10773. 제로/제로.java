import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> s = new Stack<Integer>();		// 스택 생성
		int k = Integer.parseInt(br.readLine());
		int sum = 0;
		
		for(int i = 0; i < k; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(num == 0) {
				s.pop();
			}
			
			else {
				s.push(num);
			}
		}
		for(int stack : s)
			sum += stack;
		
		System.out.println(sum);
	}

}
