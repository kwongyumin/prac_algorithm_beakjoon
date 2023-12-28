import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		int a, b, c;
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
 
	
		if (a != b && b != c && a != c) {
			int max;
	
			if (a > b) {
				// c > a > b 
				if (c > a) {
					max = c;
				} 
				// a > (b, c)
				else {
					max = a;
				}
			}
			
			else {
				// c > b > a 
				if (c > b) {
					max = c;
				}
				// b > (a, c)
				else {
					max = b;
				}
			}
			System.out.println(max * 100);
		}
	
		else {
		
			if (a == b && a == c) {
				System.out.println(10000 + a * 1000);
			}
			else {
			
				if(a == b || a == c) {
					System.out.println(1000 + a * 100);
				}
			
				else {
					System.out.println(1000 + b * 100);
				}
			}
		}
	}
}