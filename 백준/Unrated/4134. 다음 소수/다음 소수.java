import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            long n = Long.parseLong(br.readLine());
            BigInteger bi = new BigInteger(String.valueOf(n));

            if(bi.isProbablePrime(10))
                System.out.println(n);
            else
                System.out.println(bi.nextProbablePrime());
        }

    }
}
