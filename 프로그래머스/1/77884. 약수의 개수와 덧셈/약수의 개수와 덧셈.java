class Solution {
    public int solution(int left, int right) {
        int answer = 0; // 합계 
     
        for (int i = left; i <= right; i++) {
            // i -> 13 , 14, 15, 16 ,17 .. 
            int divisorCount = getDivisorCount(i);
            
            // 2 , 4 , ..
            if (divisorCount % 2 == 0) {
                answer = answer + i;
            } 
            else {
                answer = answer - i;
            } 
        }
        
        return answer;
    }
    
    // 약수 갯수 구하기 
    public int getDivisorCount(int left) {
        //ex , left -> 13  
        int divisorCount = 0;
        // 1 -> 13 
        for(int i = 1; i <= left; i++) {
            // 13 % 1 == 0 
            if (left % i == 0) {
                divisorCount++;
            }
        }
        // 2 반환
        return divisorCount;
    }
    
    
}