class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        int length = strlist.length;
        if (length < 1 || length > 100) return answer;
         
        
        for(int i =0; i < strlist.length; i++) {
            String str = strlist[i];
            answer[i] = str.length();
        }
        
        return answer;
    }
}