class Solution {
    public int solution(String s) {
        String[] sArr = s.split("");
        int start = 0;
        int answer = 1;
        int length = 1;
        int consider = 0;
        
        for(int i=start+1;i<sArr.length;i++){
            String x = sArr[start];
            if(length == consider){
                start = i;
                answer++;
                length = 1;
                consider = 0;
                continue;
            }
            if(x.equals(sArr[i])){
                length++;
            }else{
                consider++;
            }
        }
        
        return answer;
    }
}