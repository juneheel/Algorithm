import java.util.*;

class Solution {
    public int[] solution(int[] sequence, int k) {
        ArrayList<int[]> results = new ArrayList<int[]>();
        int[] answer = new int[2];
        
        int start = 0;
        int end = 0;
        int sum = 0;
        
         while(start < sequence.length) {
            if(sum > k || end == sequence.length) {
                sum -= sequence[start++];
            } else {
                sum += sequence[end++];
            }
            
            if(sum == k) {
               results.add(new int[]{start,end-1});
            }
        }
        
        int minsize = Integer.MAX_VALUE;
       for(int[] result : results){
           int size = result[1]-result[0];
           if(size<minsize){
               minsize = size;
               answer[0] = result[0];
               answer[1] = result[1];
           }
       }
        return answer;
    }
}