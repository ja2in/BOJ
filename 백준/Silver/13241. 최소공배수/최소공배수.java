import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static long gcd(long a, long b){
        if(b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        long lcd = A * B / gcd(A, B);

        System.out.println(lcd);
    }
}
