class Solution {
    public int solution(String t, String p) {
        
        int pLength = p.length(); 
        Long pInt = Long.parseLong(p);
        int answer = 0;
        int a = 0;
        Long split = 0l;
        
        while(a+pLength-1<t.length()){
        if(pLength>1){
            split = Long.parseLong(t.substring(a,a+pLength));
            if(split<=pInt){
                answer++;
            }
            a++;
            }else{
            split = Long.parseLong(t.substring(a,a+1));
            if(split<=pInt){
                answer++;
                }
            a++;
            }
        }
        
        return answer;
    }
}