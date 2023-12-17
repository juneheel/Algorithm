import java.util.*;
class Solution {
    public int[] solution(String s) {
        Map<String,Integer> map = new HashMap<>();
        String[] swords = s.split("");
        int[] answer = new int[swords.length];
        for(int i=0;i<swords.length;i++){
            if(map.getOrDefault(swords[i],-1)==-1){
                answer[i] = -1;
                map.put(swords[i],i);
            }else{
                answer[i] = i-map.get(swords[i]);
                map.put(swords[i],i);
            }
            
        }
        
        return answer;
    }
}