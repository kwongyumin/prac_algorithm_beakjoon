import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception{



        // 첫째줄 재료 개수 N
        // 두번째 줄 갑옷 만드는데 필요한 수 M

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        // 셋째줄 N 개의 재료들이 가진 고유한 번호들이 공백 두고 주어짐
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        
        // A[N] 을 오름차순 정렬
        Arrays.sort(A);

        int count = 0; // 갑옷 생성 개수
        int i = 0; // A 배열의 MIN VALUE
        int j = N-1; // A 배열의 MAX VALUE

        // 투 포인터 원칙
        while (i < j) {
            if (A[i] + A[j] < M) {
                i ++;
            } else if (A[i] + A[j] > M) {
                j--;
            } else {
                count++;
                i++;
                j--;
            }
        }

        System.out.println(count);
        br.close();

    }
}
