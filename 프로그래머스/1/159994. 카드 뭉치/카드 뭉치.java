import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goals) {
        
        Queue<String> queue1 = new LinkedList<>();
        Queue<String> queue2 = new LinkedList<>();
        for(String card : cards1){
            queue1.add(card);
        }
        for(String card : cards2){
            queue2.add(card);
        }
        
        for(String goal : goals){
            if(!queue1.isEmpty()&&queue1.peek().equals(goal)){
                queue1.poll();
                continue;
            }else if(!queue2.isEmpty()&&queue2.peek().equals(goal)){
                queue2.poll();
                continue;
            }else
                return "No";
        }
        
        return "Yes";
    }
}