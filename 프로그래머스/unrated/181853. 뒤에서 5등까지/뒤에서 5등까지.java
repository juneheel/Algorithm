import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> answerList = new ArrayList<>();
        Arrays.sort(num_list);
        int count = 0;
        for(int num : num_list){
            if(count == 5){
                break;
            }
            answerList.add(num);
            count++;
        }
        int[] answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}