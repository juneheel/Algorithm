import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        List<Integer> arrayList = new ArrayList<>();
        for(int s:score){
            if(minHeap.size()<k){
                minHeap.add(s);
                arrayList.add(minHeap.peek());
            }else{
                if(s<minHeap.peek()){
                    System.out.println(minHeap.peek());
                    arrayList.add(minHeap.peek());    
                    continue;
                }
                minHeap.remove();
                minHeap.add(s);
                arrayList.add(minHeap.peek());
            }
        }
        int[] answer = arrayList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}