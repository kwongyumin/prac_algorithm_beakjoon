import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String words = br.readLine();

            if (words.length() > 1000000) {
                return;
            }
            // 대문자 65 ~ 90 , 소문자 97 ~ 122

            int[] arr = new int[26];

            for (int i = 0; i < words.length(); i ++) {

                if ('A' <= words.charAt(i) && words.charAt(i) <= 'Z') {
                    arr[words.charAt(i) - 'A']++;
                } else {
                    arr[words.charAt(i) - 'a']++;
                }
            }

            int max = -1;
            char ch = '?';

            for (int i = 0; i < 26; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    ch = (char) (i + 65) ; // 대문자로 출력해야함.
                }
                else if (arr[i] == max) {
                    ch = '?';
                }
            }

            System.out.println(ch);
        }
}
