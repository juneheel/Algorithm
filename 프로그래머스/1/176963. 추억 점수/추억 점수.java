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
        
        for(int i=0;i<photoRowLength;i++){
            for(int j=0;j<photo[i].length;j++){
                if(nameYear.get(photo[i][j])==null)
                {
                    continue;
                }
                else {
                    result[i] += nameYear.get(photo[i][j]);
                }
            }
        }
        int[] answer = result;
        return answer;
    }
}