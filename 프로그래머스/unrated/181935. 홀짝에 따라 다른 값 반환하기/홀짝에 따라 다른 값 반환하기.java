class Solution {
    public int solution(int n) {
        int answer = 0;
        switch(n%2){
            case 0:
                for(int i=1;i<=n;i++){
                    if(i%2==0){
                        answer+=i*i;
                    }
                }
                return answer;
        case 1:
                for(int i=1;i<=n;i++){
                    if(i%2==1){
                        answer+=i;
                    }
                }
                return answer;
            default:
            return 0;
        }
    }
}