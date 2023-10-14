import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String,Integer> nameYear = new HashMap<>();
        int lengthName = name.length;
       for(int i=0;i<lengthName;i++){
           String nameValue = name[i];
           int yearValue = yearning[i];
           nameYear.put(nameValue,yearValue);
       }
        
        int photoRowLength = photo.length;
        int[] result = new int[photoRowLength];
        
        int n = 0;
        for(String[] i : photo)
        {
            for(String j : i){
                if(nameYear.get(j)==null) {
                    continue;
                }
                else {
                    result[n] += nameYear.get(j);
                }
            }
            n++;
        }
        int[] answer = result;
        return answer;
    }
}