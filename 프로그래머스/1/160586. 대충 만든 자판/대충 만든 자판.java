import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
       
        Map<Character,Integer> keySet = new HashMap<>();
        int[] answer = new int[targets.length];
        Arrays.fill(answer,0);
        
        for(String keys : keymap){
            char[] key = keys.toCharArray();
            for(int i=0;i<key.length;i++){
                if(keySet.get(key[i])==null||keySet.get(key[i])>i+1){
                    keySet.put(key[i],i+1);
                    System.out.println(key[i]+"에"+(i+1)+"값 할당");
                }
            }
        }
        
        System.out.println(keySet);
        
        int check = 0;
        for(String target: targets){
            char[] tar = target.toCharArray();
            for(char r : tar){
                 if (keySet.containsKey(r)) {
                    answer[check] += keySet.get(r);
                } else {
                    answer[check] = -1;
                     break;
                }
            }
            check++;
        }
        
        return answer;
    }
}