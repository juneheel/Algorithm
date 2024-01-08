import java.util.*;
class Solution {
    public int solution(String[] friends, String[] gifts) {
        Map<String,Integer> hashMap = new HashMap<>();
        for(int i=0;i<friends.length;i++){
            hashMap.put(friends[i],i);
        }
        
        int[][] giftCheck = new int[friends.length][friends.length];
        int[] giftPoint = new int[friends.length];
        int[] result = new int[friends.length];
        
        for(String gift : gifts){
            String[] users = gift.split(" ");

             if (hashMap.containsKey(users[0]) && hashMap.containsKey(users[1])){
            giftCheck[hashMap.get(users[0])][hashMap.get(users[1])]++;      
                 
             }
            
        }
        
        for(int i=0;i<friends.length;i++){
            for(int j=0;j<friends.length;j++){
                giftPoint[i] += giftCheck[i][j];
                giftPoint[i] -= giftCheck[j][i];
            }
        }

        for(int i=0;i<friends.length;i++){
            for(int j=0;j<friends.length;j++){
                if(i==j) continue;
                if(giftCheck[i][j]>giftCheck[j][i]){
                    result[i]++;
                }else if(giftCheck[i][j]==giftCheck[j][i]&&giftPoint[i]>giftPoint[j]){
                    result[i]++;
                }
            }
        }
        
        Arrays.sort(result);
        int answer = result[friends.length-1];
        return answer;
    }
}