import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[26];
		String word = br.readLine();
		
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) >= 65 && word.charAt(i) < 97)	{			// 대문자일 경우
				arr[word.charAt(i) - 'A']++;
			}
			
			else {
				arr[word.charAt(i) - 'a']++;
			}
		}
		
		int max = 0;
		char ch = '?';
		
		for(int i = 0; i < 26; i++) {
			if(arr[i] > max) {
				max = arr[i];
				ch = (char)(i + 65);
			}
			
			else if(arr[i] == max) {
				ch = '?';
			}
		}
		
		System.out.println(ch);

	}

}