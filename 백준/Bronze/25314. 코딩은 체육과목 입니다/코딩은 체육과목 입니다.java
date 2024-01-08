import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append("long ");
            n -= 4;
        }
        sb.append("int");
        System.out.println(sb);

    }

}