import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    // 상태를 저장하는 State 클래스 생성, x좌표,y좌표,이동한거리를 변수로
    private static class State{
        public final int x;
        public final int y;
        public final int step;

        public State(int x, int y, int step) {
            this.x = x;
            this.y = y;
            this.step = step;
        }
    }

    private static final int[] dx = {-1,1,0,0}; // 2차원 좌표에서 x축으로 이동하기때문에
    private static final int[] dy = {-0,0,-1,1}; // 2차원 좌표에서 y축으로 이동하기때문에

    public int solution(int[][] maps) {
        // dfs,bfs의 기본 방문체크를 위한 boolean값 체크
        boolean[][] isVisited = new boolean[maps.length][maps[0].length];

        Queue<State> queue = new LinkedList<>();
        // 초기값 넣어주기 시작점 위치가 배열[0][0]이고 한칸이므로 step에는 1을 넣어준다.
        queue.add(new State(0,0,1));
        isVisited[0][0] = true;

        while (!queue.isEmpty()){
            State state = queue.poll();
            if(state.y == maps.length-1&& state.x == maps[state.y].length-1){
                return state.step;
            }
            // 상하좌우로 탐색진행
            for(int i=0;i<4;i++){
                int nx = state.x - dx[i];
                int ny = state.y - dy[i];

                // maps 이차원배열 범위 벗어났을때 체크하여 다음 반복 진행
                if(ny<0||ny>=maps.length||nx<0||nx>=maps[0].length){
                    continue;
                }
                // 0은 벽이있으므로 통과 X이므로 제외
                if(maps[ny][nx]!=1){
                    continue;
                }
                // 이미 통과한 지역은 제외
                if(isVisited[ny][nx]){
                    continue;
                }

                isVisited[ny][nx] = true;
                queue.add(new State(nx,ny, state.step+1));
            }
        }
        return -1;
    }
}
