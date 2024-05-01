
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 자연수  n
        int n = Integer.parseInt(br.readLine());

        // 2. 피연산자(대문자 A-Z) + 연산자
        String prefix = br.readLine();

        int[] arr = new int[n];

        // 3. 피연산자에 매칭되는 숫자
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < prefix.length(); i++) {

            char ch = prefix.charAt(i);
            // 65 ~ 90
            if ('A' <= ch && ch <= 'Z') {
                double d = arr[ch - 'A'];
                stack.push(d);
            }else { // 연산자 처리

                double d1 = stack.pop();
                double d2 = stack.pop();
                double d3 = 0.0;

                switch (ch) {
                    case '+' :
                        d3 = d2 + d1;
                        break;
                    case '-' :
                        d3 = d2 - d1;
                        break;
                    case '*' :
                        d3 = d2 * d1;
                        break;
                    case '/' :
                        d3 = d2 / d1;
                        break;
                }
                stack.push(d3);
            }

        }
        System.out.printf("%.2f", stack.pop());

    }
}
