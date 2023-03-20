import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        boolean[] num = new boolean[1000001];
        num[0] = num[1] = true; // true = 소수 아님,  false = 소수
        for(int i = 2; i <= Math.sqrt(1000000); i++){
            if(!num[i]){
                for(int j = i * 2; j <= 1000000; j += i){
                    num[j] = true;
                }
            }
        }

        for(int i = 0; i < T; i++){
            int N = Integer.parseInt(br.readLine());
            int cnt = 0;

            for(int j = 2; j <= N / 2; j++){
                if(!num[j] && !num[N - j])
                    cnt++;
            }
            System.out.println(cnt);
        }
    }
}
