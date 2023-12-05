import java.util.*;
class Solution {
    List<int[]> list = new ArrayList<>();
    
    public List<int[]> solution(int n) {
        
        hanoi(n,1,2,3);
        return list;
    }
    
    public void hanoi(int n,int start,int temp,int end){
        int[] move = {start,end};
        if(n==1){
            list.add(move);
            return;
        }
        else{
            hanoi(n-1,start,end,temp);
            list.add(move);
            hanoi(n-1,temp,start,end);
        }
    }
}