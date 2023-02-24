public class Main {
	public static int Kap(int num) {
		int sum = num;
		
		while(num != 0) {
			sum = sum + (num % 10);
			num = num / 10;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] arr = new boolean[10001];
		
		for(int i = 1; i < 10001; i++) {
			int n = Kap(i);
			
			if(n < 10001) {
				arr[n] = true;
			}
		}
		
		for(int i = 1; i < 10001; i++) {
			if(arr[i] == false) {
				System.out.println(i);
			}
		}
	}

}
