import java.util.*;
class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        int time[][] = new int[book_time.length][2];
        
        for(int i =0;i<book_time.length;i++){
            String[] start = book_time[i][0].split(":");
            String[] end = book_time[i][1].split(":");
            int startTime = Integer.parseInt(start[0])*60+Integer.parseInt(start[1]);
            int endTime = Integer.parseInt(end[0])*60+Integer.parseInt(end[1]);
            endTime += 10;
            time[i][0] = startTime;
            time[i][1] = endTime;
        }
        
        Arrays.sort(time, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2){
                return o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0];
            }
        });
            
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        

        for(int[] timeTemp : time){
            if(queue.size() == 0){
                queue.add(timeTemp[1]);
                continue;
            }
            if((queue.peek()) <= timeTemp[0]){
                queue.poll();
                queue.add(timeTemp[1]);
            }else{
                queue.add(timeTemp[1]);
            }
        }
        
        return queue.size();
    }
}