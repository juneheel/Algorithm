import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
       Map<String,Integer> playersRanking = new HashMap<>();
         int value = 0;
        for(String p : players){
            playersRanking.put(p,value);
            value++;
        }
        
        for(String c : callings){
           int i = playersRanking.get(c); // calling 된 등수 - 0은안나옴
            playersRanking.put(c,i-1); // calling 되었으므로 등수 value 1 올라간다.
            playersRanking.put(players[i-1],i); // calling되었으므로 앞사람은 등수가바뀌므로 hashmap value 수정
            players[i] = players[i-1];
            players[i-1] = c;
        }
        

        String[] answer = players;
        return answer;
    }
}                  