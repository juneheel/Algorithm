import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[][] result = new int[41][2];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        result[0][0] = 1;
        result[0][1] = 0;
        result[1][0] = 0;
        result[1][1] = 1;
        for(int i=2;i<41;i++){
            result[i][0] = result[i-2][0]+result[i-1][0];
            result[i][1] = result[i-2][1]+result[i-1][1];
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<t;i++){
            int num = (Integer.parseInt(br.readLine()));
            sb.append(result[num][0]+" ").append(result[num][1]).append("\n");
        }
        System.out.println(sb);
    }
}
