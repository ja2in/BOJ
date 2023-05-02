import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N + 1];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 1; i <= N; i++){
            arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
        }

        int min = Integer.MIN_VALUE;        // 제일 작은 값 설정
        int sum = 0;

        for(int i = K; i <= N; i++){
            sum = arr[i] - arr[i - K];
            min = Math.max(min, sum);
        }
        System.out.println(min);
    }
}
