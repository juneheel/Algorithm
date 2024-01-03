import java.util.*;
class Solution {
    public int solution(int number, int limit, int power) {
        int[] numbers = new int[number];
        int answer = 0;
        for(int i=0;i<numbers.length;i++){
            numbers[i] = divisor(i+1);
            if(numbers[i]>limit){
                answer += power;
            }else{
                answer += numbers[i];
            }
        }
        
        return answer;
    }
    
    public static int divisor(int n){
        int result = 0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(i*i == n){
                result++;
                continue;
            }
            if(n%i==0){
              result += 2 ;
            }
        }
        return result;
    }
}