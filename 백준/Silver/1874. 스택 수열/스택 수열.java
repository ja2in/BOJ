import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        int bot = 0;

        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num > bot) {
                for (int j = bot + 1; j <= num; j++) {
                    stack.push(j);
                    sb.append('+').append('\n');
                }
                bot = num;
            }

            else if(stack.peek() != num){
                System.out.println("NO");
                return;
            }

                stack.pop();
                sb.append('-').append('\n');


        }
        System.out.println(sb);
    }
}
