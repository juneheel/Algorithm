import java.util.*;
class Solution {
    public int solution(int a, int b, int c) {
        int one = a+b+c;
        int two = (int)Math.pow(a,2)+(int)Math.pow(b,2)+(int)Math.pow(c,2);
        int three = (int)Math.pow(a,3)+(int)Math.pow(b,3)+(int)Math.pow(c,3);
        int answer = 0;
        
        if(a==b&&b==c){
            answer = one*two*three;
        }else if(a!=b&&b!=c&&c!=a){
            answer = one;
        }else{
            answer = one*two;
        }
        return answer;
    }
}