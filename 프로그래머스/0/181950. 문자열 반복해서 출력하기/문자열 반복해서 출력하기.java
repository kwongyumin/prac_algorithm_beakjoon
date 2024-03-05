import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        if(n < 1 || n > 5 ) return;
        if(str.length() < 1 || str.length() > 10) return;
         
        for(int i =0; i < n; i++) {
            System.out.print(str);
        }
        
    }
}