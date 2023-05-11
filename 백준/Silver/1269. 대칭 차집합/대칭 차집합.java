import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < A; i++){
            setA.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < B; i++){
            setB.add(Integer.parseInt(st.nextToken()));
        }

        int sum = 0;
//        if(!setA.contains(setB))
//            sum += 1;
//        if(!setB.contains(setA))
//               sum += 1;
        for (int numA : setA) {
            if(!setB.contains(numA))
                sum += 1;
        }

        for (int numB : setB) {
            if(!setA.contains(numB))
                sum += 1;
        }
        System.out.println(sum);

    }
}
