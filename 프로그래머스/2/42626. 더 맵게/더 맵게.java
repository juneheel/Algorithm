import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int answer = 0;
        
        for(int sco:scoville){
            minHeap.add(sco);
        }
        
        while(minHeap.size() > 1 && minHeap.peek()<K){
            if(answer-1>=scoville.length){
                answer = -1;
                break;
            }
            int mix = (minHeap.poll()+(minHeap.poll()*2));
            minHeap.add(mix);
            answer++;
        }
        
        if(K>minHeap.peek()){
            answer = -1;
        }
        
        return answer;
    }
}