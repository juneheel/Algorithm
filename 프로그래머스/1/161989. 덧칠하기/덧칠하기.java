class Solution {
    public int solution(int n, int m, int[] sections) {
        int start = sections[0];
        int answer = 1;
        
        for(int section : sections){
            if(start+m>section){
                continue;
            }else{
                answer++;
                start = section;
            }
        }
        return answer;
    }
}