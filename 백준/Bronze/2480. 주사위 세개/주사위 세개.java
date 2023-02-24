import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a != b && b != c && a != c) {
			int max = 0;
			if(a > b) {
				if(a > c)
					max = a;
				else 
					max = c;
			}
			
			else if(b > a) {
				if(b > c)
					max = b;
				else
					max = c;
			}
			System.out.println(max * 100);
		}
		
		else if(a == b && a == c) {
				System.out.println(1000 * a + 10000);
		}
		
		else {
			if(a == b || a == c)
				System.out.println(100 * a + 1000);
			else if(b == c) 
				System.out.println(100 * b + 1000);
			
		}
		
	}

}
