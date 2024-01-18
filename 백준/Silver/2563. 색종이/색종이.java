import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int amount = Integer.parseInt(st.nextToken());
        final int excreta = 10;
        int maxX=0;
        int maxY=0;
        int answer=0;
        // 좌표는 1사분면의 시작점 해당 점에서 x+10 y+10을진행하면된다.
        List<Integer> arrList = new ArrayList<>();
        for(int i=0;i<amount;i++){
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()) {
                arrList.add(Integer.parseInt(st.nextToken()));
            }
        }

       int[][] arr = new int[100][100];
        for(int i=0;i<arrList.size();i+=2) {
            for(int j=0;j<excreta;j++){
                for(int k=0;k<excreta;k++){
                    int point = arr[arrList.get(i)+j][arrList.get(i+1)+k];
                    if(point!=1) {
                        arr[arrList.get(i) + j][arrList.get(i + 1) + k] = 1;
                        answer++;
                    }
                }
            }
        }
        System.out.println(answer);

    }
}
