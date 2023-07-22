class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] arr = myString.toCharArray();
        System.out.println(arr);
        for(int i=0;i<myString.length();i++){
            if(arr[i]>='a'){
                arr[i] -= 32;
            }
        }

      answer = String.valueOf(arr);
        return answer;
    }
}