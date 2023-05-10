import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(pattern(N));
    }

    static int pattern(int n){
        if(n == 1)
            return 1;
        if(n == 2)
            return 2;

        int a = 1;
        int b = 2;
        int c = 0;

        for(int i = 2; i < n; i++){
            c = (a + b) % 15746;
            a = b;
            b = c;
        }
        return c;
    }
}
