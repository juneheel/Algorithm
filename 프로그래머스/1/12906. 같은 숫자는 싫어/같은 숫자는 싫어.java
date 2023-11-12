import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stackInt = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        
        for(int a=0; a<arr.length;a++){
            if(a==0){
                int number = stackInt.push(arr[a]);
                ans.add(number);
            }
            else{
                if(stackInt.peek()==arr[a]){
                    continue;
                }else{
                    int number = stackInt.push(arr[a]);
                    ans.add(number);
                }
            }
        }
        
        int[] answer = ans.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}