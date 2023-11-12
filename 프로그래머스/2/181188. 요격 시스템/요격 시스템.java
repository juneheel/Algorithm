import java.util.*;
class Solution {
    public int solution(int[][] targets) {
        int answer = 0;
        Arrays.sort(targets,((int[] a, int[] b)->{
            return a[1]-b[1];                    
        }));
      
            int cut = -1;
        for(int[] target:targets){
            if(cut<=target[0]){
                answer++;
                cut = target[1];
            }
        }
        return answer;
    }
}