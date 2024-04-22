import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a;
        String b;
        int sum = 0;

        a = Integer.parseInt(br.readLine());  // 숫자 n

        if (a < 1 || a > 100) {
            return;
        }

        b = br.readLine();

        if (b.length() != a) {
            return;
        }

        for (int i = 0; i < b.length(); i ++) {
            sum += b.charAt(i) - '0';
        }

        System.out.println(sum);

    }
}