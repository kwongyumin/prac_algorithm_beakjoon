import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
    static int M,N;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        M = Integer.parseInt(inputs[0]);
        N = Integer.parseInt(inputs[1]);
        System.out.println(M+N);
	}
}