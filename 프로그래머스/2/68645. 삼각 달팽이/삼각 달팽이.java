import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[][] triangle = new int[n][n];
        List<Integer> answerList = new ArrayList<>();
        
        int x = 0;
        int y = 0;
        int state = 1; // 현재숫자를 나타냄
        int finish = cal(n);
        
        for(int i=1;i<=finish;i++){
            while(true){ // 1차행동 : 아래로이동
             triangle[y][x] = state++;
                if(y+1 ==n||triangle[y+1][x] != 0) break;
                y++;
            }
            if(x+1==n||triangle[y][x+1]!=0) break; // 내려가서끝인경우
            x++;
            while(true){ // 2차행동 : 오른쪽으로 이동
                triangle[y][x] = state++;
                if(x+1==n||triangle[y][x+1]!=0) break;
                x++;
            }
            if(triangle[y-1][x-1]!=0) break; // 오른쪽으로 이동해서 끝인경우
            y--;
            x--;
            
            while(true){
                triangle[y][x]=state++;    
                if(triangle[y-1][x-1]!=0) break;
                y--;
                x--;
            }
            if(y+1==n||triangle[y+1][x]!=0)break;
            y++;
        }
            
        for(int[] as : triangle){
            for(int a : as){
                if(a!=0){
                    answerList.add(a);
                }
            }
        }
        
        int[] answer = answerList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return answer;
    }
    
    public static int cal(int n){
        int result = 0;
        for(int i=1;i<=n;i++){
            result += i;
        }
        return result;
    }
}