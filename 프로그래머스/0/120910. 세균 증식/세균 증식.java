class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        
        // 세균 마리 수 n 
        // 경과 시간 t 
        // t 시간 후 세균 수 
        for (int i = 1; i <= t; i++ ){
           // t =1 , 1시간인 경우  n 은 2 배가 되어야함
            n *= 2;
        }
        
        answer =n ;
        
        
        return answer;
    }
}