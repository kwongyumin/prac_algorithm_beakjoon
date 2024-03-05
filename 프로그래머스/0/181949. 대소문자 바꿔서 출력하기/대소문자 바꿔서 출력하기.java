import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String answer = "";
        
        int strLength = a.length();
        if(strLength < 1 || strLength > 20) return;
    
        for(int i = 0; i < strLength; i++) {
            char character = a.charAt(i);
            
            if(Character.isLowerCase(character)) {
                answer += Character.toUpperCase(character);
            } else {
                answer += Character.toLowerCase(character);
            }
        }
        
        System.out.print(answer);
    }
}