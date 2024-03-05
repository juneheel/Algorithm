class Solution {
    public String solution(String code) {
        String[] codes = code.split("");
        String answer = "";
        boolean mode = false;
        for(int i=0;i<code.length();i++){
            if(codes[i].equals("1")){
                mode = !mode;
                continue;
            }
            if(mode != true&&i%2==0){
                answer+=codes[i];
            }
            if(mode == true&&i%2==1){
                answer+=codes[i];
            }
        }
        
        return answer.length()>=1? answer:"EMPTY";
    }
}