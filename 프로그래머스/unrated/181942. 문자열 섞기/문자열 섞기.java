class Solution {
    public String solution(String str1, String str2) {
        String[] strArray1 = str1.split("");
        String[] strArray2 = str2.split("");
        String answer = "";
        
        
        for(int i=0;i<str1.length();i++){
            answer += strArray1[i]+strArray2[i];
        }
        return answer;
    }
}