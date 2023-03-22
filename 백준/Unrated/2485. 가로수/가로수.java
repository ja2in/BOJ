import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int gcd(int x, int y){
        if(y == 0)
            return x;
        else
            return gcd(y, x % y);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] trees = new int[N];

        for(int i = 0; i < N; i++){
            trees[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(trees);

        int GCD = 0;
        int diff = 0;
        int cnt = 0;
        for(int i = 0; i < N - 1; i++){
            diff = trees[i + 1] - trees[i];
            GCD = gcd(diff, GCD);
        }

        for(int i = 0; i < N - 1; i++){
            diff = trees[i + 1] - trees[i];
            cnt += (diff / GCD) - 1;
        }

        System.out.println(cnt);
    }
}
