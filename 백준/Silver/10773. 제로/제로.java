import java.util.*;

public class Main {

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int n= sc.nextInt();

       Stack<Integer> st =new Stack<>();
       long sum=0;

       for(int i=0;i<n;i++){
           int temp = sc.nextInt();
           if(temp==0) {
               if(!st.isEmpty()) {
                   st.pop();
               }
               else
                   continue;
           }
           else {
               st.push(temp);
           }
           }

       while(!st.isEmpty()){
           sum+=st.pop();
       }
       System.out.println(sum);
   }




}