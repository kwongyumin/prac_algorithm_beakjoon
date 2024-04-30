import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


public class Main {
	
	public static void main(String[] args) throws IOException {
	 	

	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();

		int N=Integer.parseInt(br.readLine()); 
		StringTokenizer command; 
		Queue<Integer> q=new LinkedList<>();

		int last = 0;
	

		for(int i=0; i< N; i++) {
			command = new StringTokenizer(br.readLine()," ");
			switch(command.nextToken()) {
			case "push": //입력
				int num=Integer.parseInt(command.nextToken()); 
				last=num; q.offer(num); 
				break;


			case "pop": // 가장 앞에 정수를 빼낸다.
				if(!q.isEmpty()) 
					sb.append(q.poll()).append('\n'); 
				else 
					sb.append(-1).append('\n'); 
				break;

			case "empty": 
				if(q.isEmpty()) 
					sb.append(1).append('\n'); 
				else 
					sb.append(0).append('\n');
				break;

			case "front": // 가장 앞에 정수를 출력
				if(!q.isEmpty()) 
					sb.append(q.peek()).append('\n'); 
				else 
					sb.append(-1).append('\n'); 
				break;

			case "back": // 가장 뒤에 있는 정수 출력
				if(!q.isEmpty()) 
					sb.append(last).append('\n'); 
				else 
					sb.append(-1).append('\n'); 
				break;

				
			case "size": // 큐에 들어있는 정수 개수 출력 
				sb.append(q.size()).append('\n'); 
				break;

			
			}
		}
		System.out.println(sb);
	}
} 