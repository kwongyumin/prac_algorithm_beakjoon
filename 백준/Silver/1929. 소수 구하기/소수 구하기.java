import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {

        // 에라토스테네스의 체 -> 소수를 구하는 알고리즘
        // 소수가 되는 수의 배수를 지우면 남은 건 소수가 된다.
        // 2 부터 자기 자신을 제외한 배수가 되는 것을 지운다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        boolean[] prime = new boolean[m + 1]; // 아리스토테네스의 체

        // 0 과 1 은 제외
        prime[0] = prime[1] = true;


        for (int i = 2; i * i < prime.length; i++) {
            if (!prime[i]) {
                for (int j = i * i; j < prime.length; j +=i) {
                    prime[j] = true;
                }
            }
        }

        for (int i = n; i <= m; i ++) {
            if (!prime[i]) {
                System.out.println(i);
            }
        }

    }
}