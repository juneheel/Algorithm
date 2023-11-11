import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        
        Map<String,Integer> participants = new HashMap<>();
        String answer = "";
        
        for(String part : participant){
            if(participants.get(part)==null){
                participants.put(part,0);
            }
            else
                participants.put(part,participants.get(part)+1);
        }
        
        for(String com : completion){
           if(participants.get(com)==0){
               participants.remove(com);
           }else if(participants.get(com)>0){
               participants.put(com,participants.get(com)-1);
           }
        }
        
       for(String key : participants.keySet()){
           answer = key;
       }
        
        return answer;
    }
}