class Solution {
    public int solution(int n) {
        int answer = 0;
       // 1 2 3 4 6 12 
        for (int i =1; i <= n; i ++) { 
            if(n % i == 0) {
                answer += i;
            } 
        } 
        
        
        
        return answer;
    }
}