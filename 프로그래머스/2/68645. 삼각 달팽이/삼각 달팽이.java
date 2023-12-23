import java.util.*;
class Solution {
    
    private static final int[] dx = {0,1,-1};
    private static final int[] dy = {1,0,-1};
    
    public int[] solution(int n) {
        int[][] triangle = new int[n][n];
        List<Integer> answerList = new ArrayList<>();
        
        int x = 0;
        int y = 0;
        int d = 0;
        int state = 1; // 현재숫자를 나타냄
        int finish = cal(n);
        
        while(state<=finish){
             triangle[y][x] = state++;
             int nx = x+dx[d];
             int ny = y+dy[d];
            if(nx == n||ny==n||nx==-1||ny==-1||triangle[ny][nx]!=0){
                d = (d+1)%3;
                nx = x+dx[d];
                ny = y+dy[d];
            }
            x = nx;
            y = ny;
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