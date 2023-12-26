import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> arrayList = new ArrayList<>();
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("code",0);
        hashMap.put("date",1);
        hashMap.put("maximum",2);
        hashMap.put("remain",3);
        
        for(int i=0;i<data.length;i++){
                if(val_ext>data[i][hashMap.get(ext)]){
                    arrayList.add(data[i]);
                }
        }
        
        int[][] answer = new int[arrayList.size()][4];
        for(int i=0;i<arrayList.size();i++){
            answer[i] = arrayList.get(i);
        }
        
        int num = hashMap.get(sort_by);
        int[] temp = new int[answer[0].length];
        
        for(int i = answer.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(answer[j][num]>answer[j+1][num]){
                    temp = answer[j];
                    answer[j] = answer[j+1];
                    answer[j+1] = temp;
                }
            }
        }
        
        
        return answer;
    }
}