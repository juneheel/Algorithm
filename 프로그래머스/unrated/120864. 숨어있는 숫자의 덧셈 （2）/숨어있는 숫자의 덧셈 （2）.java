class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        my_string = my_string.replaceAll("[^\\d]", " ");
        // String[] str = my_string.replaceAll("[a-zA-Z]", " ")
        // \\d : [0-9]와 동일한 의미를 가진다.
        //  ^  : 정규표현식에서 "부정"을 나타내는 메타문자.
        // 즉 [^\\d]는 숫자가 아닌 모든 문자를 뜻한다.
        
        String[] str = my_string.split(" ");
        for (int i = 0; i < str.length; i++) {
            answer += (!str[i].isEmpty()) ? Integer.parseInt(str[i]) : 0;
        }
        
        return answer;
    }
}