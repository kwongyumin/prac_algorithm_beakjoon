import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        // 첫 째줄 N 과 K 주어짐

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 에라스테네스의 체
        boolean[] prime = new boolean[N + 1];

        prime[0] = prime[1] = true;

        // K 번 째 지우는 수를 구하는 프로그램
        // K 번째 인덱스 출력
        int index = 0;

        for (int i = 2; i < prime.length; i++) {
            for (int j = i; j < prime.length;  j+= i) {
                
                if (prime[j] == false) {
                    index++;
                    prime[j] = true;
                }
                
                if (index == K) {
                    System.out.println(j);
                    return;    
                }
                
            }
        }

    }
}
