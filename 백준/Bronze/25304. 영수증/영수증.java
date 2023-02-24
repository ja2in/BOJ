import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();		// 총 금액
		int b = sc.nextInt();  		// 종류의 수
		int sum = 0;
		
		for(int i = 0; i < b; i++) {
			int c = sc.nextInt(); 	// 물건의 가격
			int d = sc.nextInt();	// 물건의 수
			
			sum += c * d;
		}
		
		if(sum == a)
			System.out.println("Yes");
		else
			System.out.println("No");
		
	}

}
