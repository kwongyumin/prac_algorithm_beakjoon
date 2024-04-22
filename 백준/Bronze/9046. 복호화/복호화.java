import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 테스트 케이스 입력
        int n = Integer.parseInt(br.readLine());
        
        while (n-- > 0) {
            String input = br.readLine();
            int[] result = new int[26]; // a - z 
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                    // 97 ~ 122 아스키
                    // 배열의 알파벳 인덱스의 value 값 증감 
                    result[input.charAt(i) - 'a']++;
                }
            }
            
            // 알파벳 가장 큰 수 
            int max = 0;
            for (int r : result) {
                if (r > max) {
                    max = r;
                }
            }

            int count = 0;
            int answer = 0;
            // 동일한 수 파악 
            for (int j = 0; j < 26; j++) {
                if (max == result[j]) {
                    count++;
                    answer = j;
                }
            }

            System.out.println(count == 1 ? (char) (answer + 'a') : "?");
        }
    }
}