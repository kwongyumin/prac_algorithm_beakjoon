import java.io.IOException;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
				
				int N=sc.nextInt();
				int K=sc.nextInt();
				
				int answer=0;
				
				answer=factorial(N) / (factorial(N - K) * factorial(K));
				System.out.println(answer);
		
			}
			
			public static int factorial(int N) {
				
				if(N<=1)
					return 1;
				
				return N*factorial(N-1);
			}

	}



