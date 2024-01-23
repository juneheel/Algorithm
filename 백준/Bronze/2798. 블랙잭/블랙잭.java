import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    private static List<Integer> result = new ArrayList<>();
    private static boolean[] visited;
    private static int m = 0;
    private static int[] cards;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 카드의 개수
        m = Integer.parseInt(st.nextToken()); // 카드의 합

        cards = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            cards[i] = Integer.parseInt(st.nextToken());
        }
        visited = new boolean[cards.length];
        dfs(0, 0, 0);
        result.sort(Comparator.reverseOrder());
            System.out.println(result.get(0));
    }

    static void dfs(int start,int count,int hap){
        // 종료조건
        if(count == 3) {
            if(hap<=m){
                result.add(hap);
            } return;
        }
        for(int i=start;i<cards.length;i++){
            if(visited[i])continue;
            visited[i] = true;
            //hap += cards[i]; -> hap을 더해버리기때문에 값이 고정된상태로 hap이 계속더해져 인덱스 012 즉 18만이남고 return되어 나머지 값들에 대한 재귀가 발동되지않는다.
            dfs(i+1,count+1,hap+cards[i]); // 각각의 인덱스값을 hap으로 넘기기때문에 해당 hap에 대한 다른 재귀역시 발동가능
            visited[i] = false;
        }

    }
}
