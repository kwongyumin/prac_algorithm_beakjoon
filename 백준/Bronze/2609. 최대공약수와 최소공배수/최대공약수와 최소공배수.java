import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 

public class Main {

    public static void main(String[] args) throws IOException {

     	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// 입력은 공백을 분기로 한줄로 받아야함.
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
 
        int max = Math.max(n,m);
        int min = Math.min(n,m);

        // 유클리드 호재법 -> 최대공약수 
        while (min != 0) {
            int r = max % min;
            max = min;
            min = r;
        }

        System.out.println(max);
        // 최소공배수 = n * m / 최대공약수
        System.out.println((n * m) / max);

    }
}
