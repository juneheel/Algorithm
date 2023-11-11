import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
       
        int answer = n-lost.length;
        
        for(int i=0;i<reserve.length;i++){
            for(int j=0;j<lost.length;j++){
               if(reserve[i]==lost[j]){
                   answer++;
                   reserve[i]=-1;
                   lost[j]=-1;
               }else
                   continue;
            }
        }
        
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(reserve[j]==lost[i]-1 || reserve[j]==lost[i]+1){
                    answer++;
                    lost[i]=-1;
                    reserve[j]=-1;
                    break;
                }
            }
        }
        return answer;
    }
}