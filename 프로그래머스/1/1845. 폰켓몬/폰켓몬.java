import java.util.*;
class Solution {
    public int solution(int[] nums) {
        Set<Integer> hashset = new HashSet<>();
        int answer = 0;
        int max = nums.length/2;
        for(int num : nums){
            hashset.add(num);
        }
        Iterator<Integer> iter = hashset.iterator();
        
        while(max>0&&iter.hasNext()){
            iter.next();
            answer++;
            max--;
        }
        
        return answer;
    }
}