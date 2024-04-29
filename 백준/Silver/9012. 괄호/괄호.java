import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        
        
        while (T -- > 0) {
            sb.append(solution(br.readLine())).append("\n");
        }
        System.out.println(sb);
    }
    
    
    public static String solution(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            
            char c = s.charAt(i);
            
            if (c == '(') {
                stack.push(c);
                
            // 닫는 괄호를 받았지만 빼낼 '(' 괄호가 없을 경우.    
            } else if (stack.empty()) {
                return "NO";
            }
            
            // 닫는 괄호일 경우 ( 를 빼낸다.
            else {
                stack.pop();
            }
        }
        
        if (stack.empty()) {
            return "YES";
        }else {
            return "NO"; // 스택에 남은 괄호가 있을 경우
        }
        
    }
}