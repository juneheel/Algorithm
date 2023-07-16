import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[][] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        arr = new int[n + 1][n + 1];


        for (int i = 0; i < m; i++) {

            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = 1;
            arr[b][a] = 1;

        }

        visited = new boolean[n+1];
        dfs(v);
        System.out.println();
        visited = new boolean[n+1];
        bfs(v);

    }

    static void dfs(int v){
        visited[v] = true;
        System.out.print(v+" ");

        if(v>arr.length-1){
            return;
        }

        for(int node = 1; node<arr.length;node++){
            if(arr[v][node] == 1 && visited[node] == false){
                dfs(node);
            }
        }
    }

    static void bfs(int v){
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(v);
        visited[v] = true;
        System.out.print(v + " ");

        while(!queue.isEmpty()) {
            int temp = queue.poll();
            for (int node = 1; node < arr.length; node++) {
                if (arr[temp][node] == 1 && visited[node] == false) {
                    queue.add(node);
                    visited[node] = true;
                    System.out.print(node + " ");
                }
            }
        }
    }
}
