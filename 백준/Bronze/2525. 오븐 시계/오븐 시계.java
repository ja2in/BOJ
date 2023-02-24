import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int t = sc.nextInt();
		int a = (m + t) / 60;
		

		if((h + a) >= 24) {
			if((m + t) >= 60) {
				if(m + (t - 60) >= 60) {
					System.out.println(((h + a)- 24)+ " " + ((m + t) % 60));
				}
				else
				System.out.println(((h + a)- 24)+ " " + (m + (t - 60)));
			}
			else
				System.out.println(((h + a)- 24) + " " + (m + t));
		}
		
		else {
		if((m + t) >= 60) {
			if(m + (t - 60) >= 60) {
				System.out.println((h + a)+ " " + ((m + t) % 60));
			}
			else
			System.out.println((h + a)+ " " + (m + (t - 60)));
		}
		else
			System.out.println(h + " " + (m + t));
		}
	}
}