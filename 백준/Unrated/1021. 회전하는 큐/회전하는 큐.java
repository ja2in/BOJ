import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        LinkedList<Integer> dq = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int cnt = 0;

        for(int i = 1; i <= N; i++){
            dq.offer(i);
        }

        int[] arr = new int[M];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < M; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < M; i++) {
            int find_idx = dq.indexOf(arr[i]);
            int half_idx;
            if(dq.size() % 2 == 0) {       // 짝수
                half_idx = dq.size() / 2 - 1;
            }
            else {
                half_idx = dq.size() / 2;
            }

            if(find_idx <= half_idx){
                for(int j = 0; j < find_idx; j++) {
                    int tmp = dq.pollFirst();
                    dq.offerLast(tmp);
                    cnt++;
                }
            }

            else{
                for(int j = 0; j < dq.size() - find_idx; j++){
                    int tmp = dq.pollLast();
                    dq.offerFirst(tmp);
                    cnt++;
                }
            }
            dq.pollFirst();
        }

        System.out.println(cnt);

    }
}
