import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] arr;
    static int fibcnt = 0;
    static int fibonaccicnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n + 1];
        fib(n);
        fibonacci(n);
        System.out.println(fibcnt);
        System.out.println(fibonaccicnt);

    }

    static int fib(int n){
        if(n == 1 || n == 2) {
            fibcnt++;
            return 1;
        }
        else
            return fib(n - 1) + fib(n - 2);
    }

    static int fibonacci(int n){
        arr[1] = 1;
        arr[2] = 1;

        for(int i = 3; i <= n; i++){
            fibonaccicnt++;
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }
}
