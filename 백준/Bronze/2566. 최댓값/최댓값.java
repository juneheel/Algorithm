import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static class ValueMax{
        int x;
        int y;
        int value;

        public ValueMax(int x, int y, int value) {
            this.x = x;
            this.y = y;
            this.value = value;
        }
    }

    public static void main(String[] args) throws IOException {
        ValueMax answer;
        int[][] arr = new int[9][9];
        int max = 0;
        List<ValueMax> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for(int i=0;i<9;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<9;j++){
                int check = Integer.parseInt(st.nextToken());
                if(check>=max){
                    max = check;
                    answer = new ValueMax(i+1,j+1,max);
                    list.add(answer);
                }
            }

        }

        list.sort(((o1, o2) -> o2.value- o1.value));
        System.out.println(list.get(0).value);
        System.out.println(list.get(0).x + " " + list.get(0).y);
    }
}
