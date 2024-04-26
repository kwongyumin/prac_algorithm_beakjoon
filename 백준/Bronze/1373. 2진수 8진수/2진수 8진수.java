import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception{

        // 2 진수 -> 8 진수
        // ex, 11001100
        //  11-> 3, 001 -> 1, 100 -> 4 

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();

        if (s.length() % 3 == 1) {
            sb.append(s.charAt(0));
        }
        if (s.length() % 3 == 2) {
            sb.append((s.charAt(0) - '0') * 2 + (s.charAt(1) - '0'));
        }
        // 2 + 1 -> 3 

        // i = 2 부터 시작 -> 001 , 100 처리 
        for(int i = s.length() % 3; i < s.length(); i+=3) {
            sb.append((s.charAt(i) - '0') * 4 + (s.charAt(i+1) - '0') * 2 + (s.charAt(i+2) - '0'));
        }
        
       
        System.out.println(sb);

    }
}