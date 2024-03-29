import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static boolean[] visit;
    public static int[] arr;
    public static int N, M;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        visit = new boolean[N];

        dfs(1, 0);
        System.out.println(sb);
    }

    public static void dfs(int start, int depth){
        if(depth == M){
            for(int ar : arr){
                sb.append(ar).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = start; i <= N; i++){
            arr[depth] = i;
            dfs(i + 1, depth + 1);
        }
    }
}

